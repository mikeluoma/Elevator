package com.remitly;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    /**
     * You are implementing an elevator.
     *
     * The elevator has 4 actions: (see ElevatorAction.java)
     *
     *     UP_ONE
     *     DOWN_ONE
     *     OPEN_CLOSE
     *     NO_OP
     *
     * The interface you should implement is in ElevatorController.java

     * Additional Guidance:
     *
     *     This is unlike a normal elevator. Users request the elevator by pressing a single giant button -- there's no up or down option.
     *     Once on the elevator, users press a button corresponding to the floor they want to go to.
     *
     *     Assume that open/close is atomic (so people who need to get off will get off and people who need to get on will get on in the same action)
     *
     *     You can use any data structure to hold the possible actions (enum, dictionary, whatever).
     *
     *     Assume some process is calling do() and executing the action. You don't have to worry about how or when.
     *
     *     Assume that moving floors and opening / closing is instant and never fails. You don't have to worry about failing an action.
     */


    public static void main(String[] args) {
        int lowestFloor = getIntegerInput("Enter Lowest Floor");
        int highestFloor = getIntegerInput("Enter Highest Floor");
        if (lowestFloor >= highestFloor) {
            System.out.println("Invalid elevator scenario.  Bye!");
            System.exit(0);
        }

        // Replace this with your implementation
        ElevatorController controller = new NoOpElevatorController();

        ElevatorRunner runner = new ElevatorRunner(controller);
        runner.start();

        ElevatorTrafficGenerator generator = new ElevatorTrafficGenerator(controller, lowestFloor, highestFloor);
        generator.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("SHUT IT DOWN!");
            runner.interrupt();
            generator.interrupt();
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
