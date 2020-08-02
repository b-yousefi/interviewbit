package interviewbit.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> nums;
    Stack<Integer> mins;

    public MinStack() {
        nums = new Stack<>();
        mins = new Stack<>();
    }

    public void push(int num) {
        if (mins.isEmpty() || num < mins.peek()) {
            mins.add(num);
        } else {
            mins.add(mins.peek());
        }
        nums.push(num);
    }

    public void pop() {
        if (nums.isEmpty()) {
            return;
        }
        mins.pop();
        nums.pop();
    }

    public int top() {
        if (nums.isEmpty()) {
            return -1;
        }
        return nums.peek();
    }

    public int getMin() {
        if (mins.isEmpty()) {
            return -1;
        }
        return mins.peek();
    }
}
