package interviewbit.math;

class PalindromeInteger {
    public boolean isPalindrome(int A) {
        String strA;
        if (A < 0) {
            strA = String.valueOf(A * -1);
        } else {
            strA = String.valueOf(A);
        }
        int i = 0, j = strA.length() - 1;
        while (j > i) {
            if (strA.charAt(i) != strA.charAt(j)) {
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}