package interviewbit.string;

import java.util.HashMap;
import java.util.Map;


class RomanToNumber {
    private static Map<Character, Integer> romanCharToNumber;

    static {
        romanCharToNumber = new HashMap<>();
        romanCharToNumber.put('I', 1);
        romanCharToNumber.put('V', 5);
        romanCharToNumber.put('X', 10);
        romanCharToNumber.put('L', 50);
        romanCharToNumber.put('C', 100);
        romanCharToNumber.put('D', 500);
        romanCharToNumber.put('M', 1000);
    }

    public int romanToInt(String A) {
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            int numI = romanCharToNumber.get(A.charAt(i)), numNextI = 0;
            if (i + 1 < A.length()) {
                numNextI = romanCharToNumber.get(A.charAt(i + 1));
            }
            if (numI >= numNextI || i + 1 >= A.length()) {
                result += romanCharToNumber.get(A.charAt(i));
            } else {
                result += numNextI - numI;
                i++;
            }
        }
        return result;
    }
}