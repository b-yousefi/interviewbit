package interviewbit.stack;

import java.util.ArrayList;
import java.util.Stack;

public class LargestRectangleHistogram {
    public int largestRectangleArea(ArrayList<Integer> list) {
        int result = 0;
        ArrayList<Integer> leftLengths = new ArrayList<>();
        int[] rightLengths = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            while (!stack.isEmpty() && list.get(stack.peek()) >= list.get(i)) {
                int j = stack.pop();
                if (rightLengths[j] == 0)
                    rightLengths[j] = i - j;
            }
            if (stack.isEmpty()) {
                leftLengths.add(i);
            } else {
                leftLengths.add(i - stack.peek() - 1);
            }
            stack.push(i);
        }
        for (int i = 0; i < leftLengths.size(); i++) {
            int right = rightLengths[i] == 0 ? list.size() - i : rightLengths[i];
            int r = (leftLengths.get(i) + right) * list.get(i);
            if (r > result) {
                result = r;
            }
        }
        return result;
    }
}
