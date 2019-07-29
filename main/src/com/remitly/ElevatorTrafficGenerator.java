package com.remitly;

import java.util.concurrent.ThreadLocalRandom;

public class ElevatorTrafficGenerator extends Thread {
    private ElevatorController controller;

    public ElevatorTrafficGenerator(ElevatorController controller) {
        this.controller = controller;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(ThreadLocalRandom.current().nextInt(0, 5) * 1000);
                int floorIndex = ThreadLocalRandom.current().nextInt(controller.getMinFloor(), controller.getMaxFloor() + 1);
                System.out.println("Requesting Floor " + floorIndex);
                controller.requestFloor(floorIndex);

            }
        } catch (InterruptedException e) {
            System.out.println("Stopping Traffic Generator");
        }
    }
}
