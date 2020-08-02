package interviewbit.string;

import java.util.Arrays;

class MultiplyStrings {
    public String multiply(String a, String b) {
        a = a.trim();
        b = b.trim();
        int sizeB = b.length();
        int sizeA = a.length();
        int[] result = new int[a.length() + b.length()];
        Arrays.fill(result, 0);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sizeB; i++) {
            int intB = Character.getNumericValue(b.charAt(sizeB - i - 1));
            for (int j = 0; j < sizeA; j++) {
                int intA = Character.getNumericValue(a.charAt(sizeA - j - 1));
                int mul = intB * intA;
                int remain = mul % 10;
                putInt(result.length - (j + i) - 1, remain, result);
                int carry = mul / 10;
                if (carry > 0) {
                    putInt(result.length - (j + i) - 1 - 1, carry, result);
                }
            }
        }
        int k = 0;
        while (k < result.length && result[k] == 0) {
            k++;
        }
        if (k == result.length) {
            return "0";
        }
        for (int i = result.length - 1; i >= k; i--) {
            stringBuilder.insert(0, result[i]);
        }

        return stringBuilder.toString();
    }

    private void putInt(int indx, int number, int[] arr) {
        int n = number + arr[indx];
        if (n > 9) {
            int remain = n % 10;
            arr[indx] = remain;
            int carry = n / 10;
            putInt(indx - 1, carry, arr);
        } else {
            arr[indx] = n;
        }

    }
}