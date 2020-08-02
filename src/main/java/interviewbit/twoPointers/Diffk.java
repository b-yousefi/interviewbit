package interviewbit.twoPointers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Diffk {
    public int diffPossible(final List<Integer> list, int k) {
        Set<Integer> remain = new HashSet<>();
        for (Integer integer : list) {
            if (remain.contains(integer)) {
                return 1;
            } else {
                remain.add(integer + k);
            }
        }
        return 0;
    }
}