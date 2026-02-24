package tdd;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinMaxStackImpl implements MinMaxStack{

    private record Node(int element, int currentMin, int currentMax){}
    private Deque<Node> stack;

    public MinMaxStackImpl() {
        this.stack = new ArrayDeque<>();
    }

    @Override
    public void push(int value) {
        if (stack.isEmpty()) {
            this.stack.push(new Node(value, value, value));
        } else {
            Node top = stack.peek();
            int newMin = Math.min(top.currentMin(), value);
            int newMax = Math.max(top.currentMax(), value);
            this.stack.push(new Node(value, newMin, newMax));
        }
    }

    @Override
    public int pop() {
        checkException();
        return this.stack.pop().element();
    }

    @Override
    public int peek() {
        checkException();
        return this.stack.getFirst().element();
    }

    private void checkException() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Empty Stack");
        }
    }

    @Override
    public int getMin() {
        checkException();
        return this.stack.peek().currentMin();
    }

    @Override
    public int getMax() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    @Override
    public int size() {
        return this.stack.size();
    }
}
