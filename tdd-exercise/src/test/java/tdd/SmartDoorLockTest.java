package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorLockTest {
    private SmartDoorLock smartDoorLock;

    @BeforeEach
    void beforeEach() {
        smartDoorLock = new SmartDoorLockImpl();
    }

    @Test
    public void testIsNotLocked() {
        assertFalse(smartDoorLock.isLocked());
    }

    @Test
    public void testIsNotBlocked() {
        assertFalse(smartDoorLock.isBlocked());
    }

    @Test
    public void testisOpen() {
        assertFalse(smartDoorLock.isBlocked() && smartDoorLock.isLocked());
    }
}
