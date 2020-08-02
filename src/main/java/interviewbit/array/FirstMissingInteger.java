package interviewbit.array;

import java.util.*;

class FirstMissingInteger {

    public int firstMissingPositive(ArrayList<Integer> A) {
        int result = 1;
        Comparator<Integer> positive = (Integer int1, Integer int2) -> {
            if (int1 < 0 && int2 > 0 || int1 == 0) {
                return 1;
            }
            if (int2 < 0 && int1 > 0 || int2 == 0) {
                return -1;
            }
            return int1.compareTo(int2);
        };
        A.sort(positive);
        for (int i = 0; i < A.size(); i++) {
            result = i + 1;
            if (A.get(i) < 0) {
                return i + 1;
            } else {
                if (A.get(i) != i + 1) {
                    return i + 1;
                }
            }
        }
        return ++result;
    }
}