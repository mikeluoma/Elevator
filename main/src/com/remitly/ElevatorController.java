package com.remitly;

/**
 * This is the interface you should implement.
 */
public interface ElevatorController {
    void requestFloor(int floor);
    ElevatorAction getNextAction();
}
