package interviewbit.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parenthesis {
    public int isValid(String braces) {
        Stack<Character> chars = new Stack<>();
        Map<Character, Character> closeChars = new HashMap<>();
        closeChars.put(')', '(');
        closeChars.put(']', '[');
        closeChars.put('}', '{');
        for (int i = 0; i < braces.length(); i++) {
            Character ch = braces.charAt(i);
            if (closeChars.containsKey(ch)) {
                if (chars.isEmpty()) {
                    return 0;
                }
                Character chTop = chars.pop();
                if (chTop != closeChars.get(ch)) {
                    return 0;
                }
            } else {
                chars.push(braces.charAt(i));
            }
        }
        if (!chars.isEmpty()) {
            return 0;
        }
        return 1;
    }
}