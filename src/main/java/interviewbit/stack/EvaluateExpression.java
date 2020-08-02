package interviewbit.stack;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {
    public int evalRPN(ArrayList<String> strs) {
        Stack<Integer> stack = new Stack<>();
        for (String str : strs) {
            if (str.equals("*") || str.equals("-") || str.equals("+") || str.equals("/")) {
                int r = 0;
                int a, b;
                b = stack.pop();
                a = stack.pop();
                switch (str) {
                    case "*":
                        r = a * b;
                        break;
                    case "-":
                        r = a - b;
                        break;
                    case "+":
                        r = a + b;
                        break;
                    case "/":
                        r = a / b;
                        break;
                }
                stack.push(r);
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        return stack.pop();
    }
}
