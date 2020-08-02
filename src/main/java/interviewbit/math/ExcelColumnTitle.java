package interviewbit.math;

public class ExcelColumnTitle {
    public String convertToTitle(int number) {
        int baseInt = 'A' - 1;
        StringBuilder stringBuilder = new StringBuilder();
        int a = number;
        do {
            int remain = a % 26;
            a = a / 26;
            if (remain > 0) {
                stringBuilder.insert(0, (char) (remain + baseInt));
            } else {
                stringBuilder.insert(0, (char) (26 + baseInt));
                a--;
            }

        } while (a >= 26);
        if (a > 0) {
            stringBuilder.insert(0, (char) (a + baseInt));
        }
        return stringBuilder.toString();
    }
}
