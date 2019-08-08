package com.remitly;

public class NoOpElevatorController implements ElevatorController {

    public NoOpElevatorController() {
    }

    public void requestFloor(int floor) {
    }

    public ElevatorAction getNextAction() {
        return ElevatorAction.NO_OP;
    }
}
