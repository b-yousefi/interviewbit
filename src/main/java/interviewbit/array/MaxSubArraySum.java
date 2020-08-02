package interviewbit.array;

import java.util.List;

class MaxSubArraySum {
    public int maxSubArray(final List<Integer> A) {
        int max = Integer.MIN_VALUE, current_max = 0;
        for (Integer integer : A) {
            current_max += integer;
            if (max < current_max) {
                max = current_max;
            }
            if (current_max < 0) {
                current_max = 0;
            }
        }
        return max;
    }
}