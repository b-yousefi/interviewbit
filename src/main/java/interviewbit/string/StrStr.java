package interviewbit.string;

class StrStr {
    public int strStr(final String A, final String B) {
        if (B.isEmpty() || A.length() < B.length()) {
            return -1;
        }
        int indx = 0;
        int i = 0;
        while (true) {
            if (A.charAt(indx + i) != B.charAt(i)) {
                indx = indx + 1;
                if (indx > A.length() - B.length()) {
                    return -1;
                }
                i = 0;
            } else {
                i++;
                if (i == B.length()) {
                    return indx;
                }
            }
        }
    }
}