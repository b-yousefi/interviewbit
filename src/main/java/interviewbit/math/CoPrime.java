package interviewbit.math;

class CoPrime {

    public int cpFact(int x, int y) {
        int max = 1;
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                if (gcd(y, i) == 1) {
                    if(i > max)
                        max = i;
                }
                int m = x / i;
                if (gcd(y, m) == 1) {
                    if(m > max)
                        max = m;
                }
            }
        }
        return max;
    }

    public int gcd(int A, int B) {
        if (B == 0) {
            return A;
        } else
            return gcd(B, A % B);
    }
}