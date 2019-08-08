package com.remitly;

public interface ElevatorController {
    void requestFloor(int floor);
    ElevatorAction getNextAction();
}
