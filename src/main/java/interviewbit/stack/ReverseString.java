package interviewbit.stack;

import java.util.Stack;

public class ReverseString {
    public String reverseString(String A) {
        Stack<Character> chars = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            chars.push(A.charAt(i));
        }
        StringBuilder strBuilder = new StringBuilder();
        while (!chars.isEmpty()) {
            strBuilder.append(chars.pop());
        }
        return strBuilder.toString();
    }
}