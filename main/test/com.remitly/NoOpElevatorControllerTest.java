package com.remitly;

import org.junit.Assert;
import org.junit.Test;

public class NoOpElevatorControllerTest {
    @Test
    public void AlwaysNoOp() {
        NoOpElevatorController controller = new NoOpElevatorController();
        Assert.assertEquals(ElevatorAction.NO_OP, controller.getNextAction());
    }
}
