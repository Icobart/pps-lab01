package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxStackImplTest {

    private MinMaxStack minMaxStack;

    @BeforeEach
    public void beforeEach() {
        minMaxStack = new MinMaxStackImpl();
    }

    @Test
    public void testStartingStackIsEmpty() {
        assertTrue(minMaxStack.isEmpty());
    }

    @Test
    public void testCheckInitialSize() {
        assertEquals(0, minMaxStack.size());
    }
}