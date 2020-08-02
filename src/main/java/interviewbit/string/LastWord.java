package interviewbit.string;

class LastWord {
    public int lengthOfLastWord(final String A) {
        int from = 0;
        String str = A.trim();
        while (str.indexOf(' ', from) != -1) {
            from = str.indexOf(' ', from) + 1;
        }
        return str.substring(from).length();
    }
}