package interviewbit.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackTest {

    @Test
    public void push() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        assertEquals(minStack.top(), 3);
    }

    @Test
    public void pop() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        assertEquals(minStack.top(), 2);
        minStack.pop();
        assertEquals(minStack.top(), 3);
    }

    @Test
    public void top() {
        MinStack minStack = new MinStack();
        assertEquals(minStack.top(), -1);
    }

    @Test
    public void getMin() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(1);
        assertEquals(1, minStack.top());
        assertEquals(1, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
        minStack.pop();
        assertEquals(3, minStack.getMin());
    }
}