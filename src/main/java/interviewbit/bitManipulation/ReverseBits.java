package interviewbit.bitManipulation;

class ReverseBits {
    public long reverse(long num) {
        int i = 0;
        long reverse = 0;
        while (i < 32) {
            long remain = num & 1;
            reverse = (reverse << 1) + remain;
            num = num >>> 1;
            i++;
        }
        return reverse;
    }

}