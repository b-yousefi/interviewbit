package interviewbit.array;

import java.util.ArrayList;
import java.util.Collections;

class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        Collections.reverse(A);
        for (int i = 0; i < A.size(); i++) {
            if (i == A.get(i) && (i == 0 || (i + 2 > A.size() ||
                    !A.get(i + 1).equals(A.get(i))) && !A.get(i - 1).equals(A.get(i)))) {
                return 1;
            }
        }
        return -1;

    }
}