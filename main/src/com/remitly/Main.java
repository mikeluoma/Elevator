package com.remitly;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int lowestFloor = getIntegerInput("Enter Lowest Floor");
        int highestFloor = getIntegerInput("Enter Highest Floor");
        int numGenerators = getIntegerInput("How many request generators?");
        if (lowestFloor >= highestFloor || numGenerators <= 0) {
            System.out.println("Invalid elevator scenario.  Bye!");
            System.exit(0);
        }

        ElevatorController controller = new ElevatorController(lowestFloor, highestFloor);
        Set<ElevatorTrafficGenerator> generatorSet = new HashSet<>();
        for (int i = 0; i < numGenerators; i++) {
            ElevatorTrafficGenerator generator = new ElevatorTrafficGenerator(controller);
            generator.start();
            generatorSet.add(generator);
        }

        ElevatorRunner runner = new ElevatorRunner(controller);
        runner.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("SHUT IT DOWN!");
            runner.interrupt();
            generatorSet.forEach(Thread::interrupt);
        }));
    }

    private static int getIntegerInput(String prompt) {
        System.out.println(prompt);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please enter a number");
            }
        }
    }
}
