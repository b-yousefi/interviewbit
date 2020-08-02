package interviewbit.binarySearch;

class SquareRoot {
    public int sqrt(int A) {
        long start = 1;
        long end = A;
        while (start < end) {
            long mid = (start + end) / 2;
            long mul = mid * mid;
            if (mul == A) {
                return (int) mid;
            } else if (mul > A) {
                end = mid - 1;
                if (end * end <= A) {
                    return (int) end;
                }
            } else {
                start = mid + 1;
                if (start * start > A) {
                    return (int) mid;
                }
            }
        }
        return (int) end;
    }
}