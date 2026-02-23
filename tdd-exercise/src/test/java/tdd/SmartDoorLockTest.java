package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartDoorLockTest {
    private SmartDoorLock smartDoorLock;
    public final static int MAX_ATTEMPTS = 10;
    public final static int INITIAL_FAILED_ATTEMPTS = 0;

    @BeforeEach
    void beforeEach() {
        smartDoorLock = new SmartDoorLockImpl(MAX_ATTEMPTS, INITIAL_FAILED_ATTEMPTS);
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

    @Test
    public void testLockingDoor() {
        smartDoorLock.setPin(1234);
        smartDoorLock.lock();
        assertTrue(smartDoorLock.isLocked());
    }

    @Test
    public void testLockWithPinNotSet() {
        assertThrows(IllegalStateException.class, () -> smartDoorLock.lock());
    }

    @Test
    public void testMaxAttempts() {
        assertEquals(MAX_ATTEMPTS, smartDoorLock.getMaxAttempts());
    }

    @Test
    public void testInitialFailedAttempts() {
        assertEquals(INITIAL_FAILED_ATTEMPTS, smartDoorLock.getFailedAttempts());
    }
}
