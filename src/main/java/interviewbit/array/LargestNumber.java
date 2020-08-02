package interviewbit.array;

import java.util.Comparator;
import java.util.List;

class LargestNumber {
    public String largestNumber(final List<Integer> A) {
        StringBuilder result = new StringBuilder();
        Comparator<Integer> compareChar = (int1, int2) -> {
            String int1Str = int1.toString();
            String int2Str = int2.toString();
            long app1 = Long.parseLong(int1Str + int2Str);
            long app2 = Long.parseLong(int2Str + int1Str);
            return -Long.compare(app1, app2);
        };
        A.sort(compareChar);
        if (A.get(0) == 0) {
            return "0";
        }
        for (Integer integer : A) {
            result.append(integer);
        }

        return result.toString();
    }
}