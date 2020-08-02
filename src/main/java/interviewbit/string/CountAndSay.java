package interviewbit.string;

class CountAndSay {
    public String countAndSay(int A) {
        String str = "1";
        for (int i = 1; i < A; i++) {
            str = countAndSay(str);
        }
        return str;
    }

    private String countAndSay(String a) {
        int count = 0, i = 0;
        char num = a.charAt(0);
        StringBuilder result = new StringBuilder();
        while (i < a.length()) {
            if (num != a.charAt(i)) {
                result.append(count);
                result.append(num);
                num = a.charAt(i);
                count = 1;
            } else {
                count++;
            }
            i++;
        }
        result.append(count);
        result.append(num);
        return result.toString();
    }
}