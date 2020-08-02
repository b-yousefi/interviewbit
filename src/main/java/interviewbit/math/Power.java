package interviewbit.math;

class Power {

    private boolean isPower(int A, int f) {
        int num = A;
        while (num % f == 0 && num >= f) {
            num /= f;
        }
        return num == 1;
    }

    public int isPower(int A) {
        if (A == 1) {
            return 1;
        }
        for (int i = 2; i <= Math.sqrt(A); i++) {
            if (A % i == 0) {
                if (isPower(A, i)) {
                    return 1;
                } else if (isPower(A, A / i)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}