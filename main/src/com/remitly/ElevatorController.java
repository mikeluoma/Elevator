package com.remitly;

public class ElevatorController {

    // Add any other state you need.
    private int lowestFloor;
    private int highestFloor;

    public ElevatorController(int lowestFloor, int highestFloor) {
        this.lowestFloor = lowestFloor;
        this.highestFloor = highestFloor;
    }

    public void requestFloor(int floor) {
    }

    public ElevatorAction getNextAction() {
        return ElevatorAction.NO_OP;
    }

    public int getMaxFloor() {
        return highestFloor;
    }

    public int getMinFloor() {
        return lowestFloor;
    }
}
