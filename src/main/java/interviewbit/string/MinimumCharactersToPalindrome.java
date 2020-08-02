package interviewbit.string;

class MinimumCharactersToPalindrome {
    public boolean isPalindrome(String A) {
        int i = 0, j = A.length() - 1;
        while (i < j) {
            if (A.charAt(i) != A.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public int solve(String A) {
        int count = 0;
        while (A.length() > 0) {
            if (isPalindrome(A)) {
                break;
            } else {
                count++;
                A = A.substring(0, A.length() - 1);
            }
        }
        return count;
    }
}