package tdd;

import java.util.LinkedList;
import java.util.List;

public class CircularQueueImpl implements CircularQueue{

    private List<Integer> queue;
    private final int size;

    public CircularQueueImpl(int size) {
        this.queue = new LinkedList<>();
        this.size = size;
    }

    @Override
    public void enqueue(int value) {
        this.queue.add(value);
    }

    @Override
    public int getLastElement() {
        return this.queue.getLast();
    }
}
