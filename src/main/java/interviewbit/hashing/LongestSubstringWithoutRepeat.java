package interviewbit.hashing;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        LinkedHashSet<Character> setChar = new LinkedHashSet<>();
        int start = 0, startMax = 0, maxLenght = 0;
        for (int i = 0; i < str.length(); i++) {
            if (setChar.contains(str.charAt(i))) {
                int length = i - start;
                if (length > maxLenght) {
                    maxLenght = length;
                }
                Iterator<Character> it = setChar.iterator();
                int r = 0;
                while (it.hasNext()) {
                    r++;
                    if (!it.next().equals(str.charAt(i))) {
                        it.remove();
                    } else {
                        it.remove();
                        break;
                    }
                }
                start += r;
            }
            setChar.add(str.charAt(i));

        }
        int length = str.length() - start;
        if (length > maxLenght) {
            maxLenght = length;
        }
        return maxLenght;
    }
}
