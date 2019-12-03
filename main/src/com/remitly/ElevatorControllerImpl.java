package com.remitly;

/**
 * Implement your solution here. It's ok to maintain state in this controller.
 */
public class ElevatorControllerImpl implements ElevatorController {

    /**
     * Feel free to change the contract of the constructor.
     */
    public ElevatorControllerImpl() {
    }

    public int getCurrentFloor() {
        return 0;
    }

    public void requestFloor(int floor) {
    }

    public ElevatorAction getNextAction() {
        return ElevatorAction.NO_OP;
    }
}
