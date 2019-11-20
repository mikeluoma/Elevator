package com.remitly;

import org.junit.Assert;
import org.junit.Test;

public class ElevatorControllerTest {
    private ElevatorController getController() {
        return new ElevatorControllerImpl();
    }

    @Test
    public void ElevatorGoesUp() {
        ElevatorController controller = getController();
        controller.requestFloor(1);

        Assert.assertEquals("Elevator should want to go from 0 to 1", ElevatorAction.GO_UP_ONE_FLOOR, controller.getNextAction());
        Assert.assertEquals("Elevator should want to open doors", ElevatorAction.OPEN_AND_CLOSE_DOORS, controller.getNextAction());
        Assert.assertEquals("Elevator should wait", ElevatorAction.NO_OP, controller.getNextAction());
    }
}
