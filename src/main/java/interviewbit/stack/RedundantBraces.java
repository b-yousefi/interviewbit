package interviewbit.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RedundantBraces {
    public int braces(String str) {
        Set<Character> operators = new HashSet<>();
        Stack<Character> stackOps = new Stack<>();
        operators.add('+');
        operators.add('-');
        operators.add('*');
        operators.add('/');
        operators.add('(');
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (operators.contains(ch)) {
                stackOps.push(ch);
            } else if (ch == ')') {
                if (stackOps.peek() == '(') {
                    return 1;
                }
                while (!stackOps.isEmpty() && stackOps.peek() != '(') {
                    stackOps.pop();
                }
                stackOps.pop();

            }
        }
        return 0;
    }
}