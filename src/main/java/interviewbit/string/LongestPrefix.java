package interviewbit.string;

import java.util.ArrayList;

class LongestPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        if (A.size() == 1) {
            return A.get(0);
        }
        int j = 0;
        out:
        while (true) {
            for (int i = 0; i < A.size() - 1; i++) {
                if (A.get(i).length() - 1 < j || A.get(i + 1).length() - 1 < j)
                    break out;
                if (A.get(i).charAt(j) != A.get(i + 1).charAt(j)) {
                    break out;
                }
            }
            j++;
        }
        return A.get(0).substring(0, j);
    }
}
