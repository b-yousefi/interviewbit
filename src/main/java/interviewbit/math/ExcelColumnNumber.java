package interviewbit.math;

class ExcelColumnNumber {

    public int titleToNumber(String str) {
        int baseInt = 'A' - 1;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int charInt = str.charAt(i) - baseInt;
            result += Math.pow(26, str.length() - i - 1) * charInt;
        }
        return result;
    }
}