package interviewbit.bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;

class SumBitDifferences {
    private final static long M = 1000000007L;

    public int cntBits(ArrayList<Integer> list1) {
        long count = 0;
        long[] countBitSet = new long[32];
        Arrays.fill(countBitSet, 0);
        for (int num : list1) {
            int j = 0;
            while (num != 0) {
                if ((num & 1) == 1) {
                    countBitSet[j]++;
                }
                j++;
                num = num >>> 1;
            }
        }
        for (int i = 0; i < 32; i++) {
            count += 2 * countBitSet[i] * (list1.size() - countBitSet[i]);
        }

        return (int) (count % M);
    }

}