package interviewbit.stack;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallest {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> list1) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : list1) {
            while (!stack.isEmpty() && stack.peek() > integer) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }
            stack.push(integer);
        }
        return result;
    }
}