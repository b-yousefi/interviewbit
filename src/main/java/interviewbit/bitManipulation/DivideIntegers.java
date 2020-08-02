package interviewbit.bitManipulation;

class DivideIntegers {
    public int divide(int A, int B) {
        boolean neg = (A < 0) ^ (B < 0);
        long lA = Math.abs((long) A), lB = Math.abs((long) B);

        long temp = 0, quotient = 0;
        for (int i = 31; i >= 0; --i) {
            if (temp + (lB << i) <= lA) {
                temp += lB << i;
                quotient |= 1L << i;
            }
        }

        if (quotient >= Integer.MAX_VALUE && !neg) {
            A = Integer.MAX_VALUE;
        } else {
            A = (int) quotient;
        }

        return neg ? -A : A;
    }
}