
package interviewbit.binarySearch;

class PowerFunction {
    public int pow(int x, int n, int d) {
        int result;
        if (x == 0)
            return 0;
        if (n == 0) {
            return 1;
        }
        long temp;
        temp = pow(x, n / 2, d);
        if (n % 2 == 0) {
            return (int) ((temp * temp) % d);
        } else {
            if (n > 0) {
                result = (int) (((temp * temp) % d * x % d) % d);
            } else {
                result = (int) (((temp * temp) % d / x % d) % d);
            }
        }
        if (result < 0) {
            result = d + result;
        }
        return result;
    }
}