package interviewbit.string;

import java.util.HashSet;
import java.util.Set;

class AmazingSubarrays {
    public int solve(String A) {
        long count = 0;
        Set<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        for (int i = 0; i < A.length(); i++) {
            if (vowel.contains(A.charAt(i))) {
                count = count + (A.length() - i);
            }
        }
        return (int) count % 10003;
    }
}