package interviewbit.string;

class ReverseString {
    public String solve(String A) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = A.trim().split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}