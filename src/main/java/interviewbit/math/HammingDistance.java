package interviewbit.math;

import java.util.List;

class HammingDistance {
    public int hammingDistance(final List<Integer> A) {
        long result = 0;
        long zeros, ones;
        int k = 0;
        int done = A.size();
        while (done > 0) {
            done = A.size();
            zeros = 0;
            ones = 0;
            for (Integer integer : A) {
                String str = Integer.toBinaryString(integer);
                if (str.length() > k) {
                    if (str.charAt(str.length() - k - 1) == '1') {
                        ones++;
                    } else {
                        zeros++;
                    }
                } else {
                    done--;
                    zeros++;
                }
            }
            result = (result + 2 * (zeros * ones)) % 1000000007;
            k++;
        }

        return (int) result % 1000000007;
    }
}