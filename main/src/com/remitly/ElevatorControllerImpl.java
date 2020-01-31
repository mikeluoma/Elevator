package com.remitly;
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
 * Additional Guidance:
 *
 *     This is unlike a normal elevator. Users request the elevator by pressing a single giant button - there's no up or down option.
 *     Once on the elevator, users press a button corresponding to the floor they want to go to.
 *
 *     Assume that open/close is atomic (so people who need to get off will get off and people who need to get on will get on in the same action
 *
 *     Assume some process is calling getNextAction() and executing the action. You don't have to worry about how or when.
 *
 *     Assume that moving floors and opening / closing is instant and never fails. You don't have to worry about failing an action.
 *
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
