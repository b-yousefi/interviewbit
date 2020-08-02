package interviewbit.array;

import java.util.*;

class RepeatMissingNumber {

    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();

        int size = A.size();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= A.size(); i++) {
            set.add(i);
        }
        for (Integer integer : A) {
            if (set.contains(integer)) {
                set.remove(integer);
            } else {
                result.add(integer);
            }
        }
        result.add(set.iterator().next());

        return result;
    }

}