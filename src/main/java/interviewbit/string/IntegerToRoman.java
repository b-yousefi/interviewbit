package interviewbit.string;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
    private static Map<Integer, String> numberToRomanChar;

    static {
        numberToRomanChar = new TreeMap<>(Collections.reverseOrder());
        numberToRomanChar.put(1000, "M");
        numberToRomanChar.put(900, "CM");
        numberToRomanChar.put(500, "D");
        numberToRomanChar.put(400, "CD");
        numberToRomanChar.put(100, "C");
        numberToRomanChar.put(90, "XC");
        numberToRomanChar.put(50, "L");
        numberToRomanChar.put(40, "XL");
        numberToRomanChar.put(10, "X");
        numberToRomanChar.put(9, "IX");
        numberToRomanChar.put(5, "V");
        numberToRomanChar.put(4, "IV");
        numberToRomanChar.put(1, "I");
    }

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Integer> it = numberToRomanChar.keySet().iterator();
        int current_num = it.next();
        while (num != 0) {
            if (current_num > num) {
                current_num = it.next();
            } else {
                stringBuilder.append(numberToRomanChar.get(current_num));
                num = num - current_num;
            }
        }
        return stringBuilder.toString();
    }
}
