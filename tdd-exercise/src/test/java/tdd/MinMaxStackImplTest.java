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

    @Test
    public void testPushAndPeekNotEmptyStack() {
        minMaxStack.push(1);
        minMaxStack.push(2);
        minMaxStack.push(3);
        assertEquals(3, minMaxStack.peek());
    }

    @Test
    public void testPushAndPopNotEmptyStack() {
        minMaxStack.push(1);
        minMaxStack.push(2);
        minMaxStack.push(3);
        assertEquals(3, minMaxStack.pop());
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(IllegalStateException.class, () -> minMaxStack.peek());
    }
}