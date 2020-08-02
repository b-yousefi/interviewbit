package interviewbit.string;

class Palindrome {
    public int isPalindrome(String A) {
        A = A.toLowerCase();
        int i = indxNextChar(A, 0, true), j = indxNextChar(A, A.length() - 1, false);
        while (i < j) {
            if (A.charAt(i) != A.charAt(j)) {
                return 0;
            } else {
                i = indxNextChar(A, ++i, true);
                j = indxNextChar(A, --j, false);
            }
        }
        return 1;
    }

    private int indxNextChar(String A, int start, boolean plusMinus) {

        while (start >= 0 && start < A.length()) {
            char c = A.charAt(start);
            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                if (plusMinus) {
                    start++;
                } else {
                    start--;
                }
            } else {
                break;
            }
        }
        return start;
    }
}