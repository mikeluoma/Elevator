package com.remitly;

public class ElevatorRunner extends Thread {

    private ElevatorController controller;

    public ElevatorRunner(ElevatorController controller) {
        this.controller = controller;
    }

    public void run() {
        try {
            while (true) {
                ElevatorAction action = controller.getNextAction();
                System.out.println("Performing action " + action);
                if (action != ElevatorAction.NO_OP) {
                    // Execute the action on actual hardware.
                    // No work for you to do here.
                }

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Stopping runner");
        }
    }

}
