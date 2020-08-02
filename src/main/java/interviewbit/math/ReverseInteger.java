package interviewbit.math;

public class ReverseInteger {
    int reverse(int num) {
        double result = 0;
        boolean neg = false;
        int positiveNum;
        if (num < 0) {
            neg = true;
            positiveNum = -num;
        } else {
            positiveNum = num;
        }

        while (positiveNum >= 10) {
            result = result * 10 + positiveNum % 10;
            positiveNum = positiveNum / 10;
        }
        if (positiveNum > 0) {
            result = result * 10 + positiveNum;
        }
        result = result * (neg ? -1 : 1);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
