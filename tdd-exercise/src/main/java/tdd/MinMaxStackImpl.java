package tdd;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinMaxStackImpl implements MinMaxStack{

    private Deque<Integer> stack;

    public MinMaxStackImpl() {
        this.stack = new ArrayDeque<>();
    }

    @Override
    public void push(int value) {
        this.stack.push(value);
    }

    @Override
    public int pop() {
        return this.stack.pop();
    }

    @Override
    public int peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Empty Stack");
        }
        return this.stack.getFirst();
    }

    @Override
    public int getMin() {
        return 0;
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
