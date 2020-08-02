package interviewbit.math;

class TrailingZerosFactorial {
    public int trailingZeroes(int A) {
        int result = 0;
        for (int i = 5; A >= i; i = i * 5) {
            result += A / (i);
        }
        return result;
    }
}