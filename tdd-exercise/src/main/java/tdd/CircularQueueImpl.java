package tdd;

import java.util.LinkedList;
import java.util.List;

public class CircularQueueImpl implements CircularQueue{

    private final List<Integer> queue;
    private final int capacity;

    public CircularQueueImpl(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    @Override
    public void enqueue(int value) {
        if (this.isFull()) {
            this.dequeue();
        }
        this.queue.add(value);
    }

    @Override
    public int dequeue() {
        checkException();
        return this.queue.removeFirst();
    }

    private void checkException() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Empty Queue");
        }
    }

    @Override
    public int getLastElement() {
        checkException();
        return this.queue.getLast();
    }

    @Override
    public int getFirstElement() {
        checkException();
        return this.queue.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public boolean isFull() {
        return this.queue.size() == this.capacity;
    }
}
