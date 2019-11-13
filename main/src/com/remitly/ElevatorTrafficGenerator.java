package com.remitly;

import java.util.concurrent.ThreadLocalRandom;

/**
 * This class simulates some random requests for floors for the elevator.
 * You can ignore the details this class.
 */
public class ElevatorTrafficGenerator extends Thread {
    private ElevatorController controller;
    private int minFloor;
    private int maxFloor;

    public ElevatorTrafficGenerator(
            ElevatorController controller,
            int minFloor,
            int maxFloor) {
        this.controller = controller;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(ThreadLocalRandom.current().nextInt(2, 8) * 1000);
                int floorIndex = ThreadLocalRandom.current().nextInt(minFloor, maxFloor + 1);
                System.out.println("Requesting Floor " + floorIndex);
                controller.requestFloor(floorIndex);

            }
        } catch (InterruptedException e) {
            System.out.println("Stopping Traffic Generator");
        }
    }
}
