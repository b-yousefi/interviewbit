package interviewbit.string;

class Atoi {
    public int atoi(final String A) {
        long num = 0;
        boolean positive = true;

        int i = 0;
        while (i < A.length() && A.charAt(i) == ' ') {
            i++;
        }
        if (A.charAt(i) == '+') {
            i++;
        } else if (A.charAt(i) == '+' || A.charAt(i) == '-') {
            i++;
            positive = false;
        }
        while (i < A.length() && Character.isDigit(A.charAt(i))) {
            num = (num * 10) + Character.getNumericValue(A.charAt(i));
            if (positive && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (-num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        if (!positive) {
            num = -num;
        }
        return (int) num;
    }
}