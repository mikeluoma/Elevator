package com.remitly;

/**
 * This is the interface you should implement.
 */
public interface ElevatorController {
    int getCurrentFloor();
    void requestFloor(int floor);
    ElevatorAction getNextAction();
}
