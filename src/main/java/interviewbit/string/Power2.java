package interviewbit.string;

import java.math.BigInteger;

class Power2 {
    public int power(String A) {

        BigInteger bigInteger = new BigInteger(A);
        String binary = bigInteger.toString(2);
        return power2(binary);
    }

    private int power2(String binary) {
        int count = 0;
        if (binary.charAt(binary.length() - 1) == '1') {
            return 0;
        }
        for (int i = 0; i < binary.length() - 1; i++) {
            if (binary.charAt(i) == '1') {
                count++;
                if (count > 1) {
                    return 0;
                }
            }
        }
        return 1;
    }
}