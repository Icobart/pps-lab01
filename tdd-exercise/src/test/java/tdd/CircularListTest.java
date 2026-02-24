package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularQueue circularQueue;

    @BeforeEach
    public void beforeEach() {
        circularQueue = new CircularQueueImpl(3);
    }

    @Test
    public void testEnqueueElementAndCheckLastElementInserted() {
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.enqueue(3);
        assertEquals(3, circularQueue.getLastElement());
    }

    @Test
    public void testDequeueElementAndCheckNewOldestElement() {
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.enqueue(3);
        circularQueue.dequeue();
        assertEquals(5, circularQueue.getFirstElement());
    }
}
