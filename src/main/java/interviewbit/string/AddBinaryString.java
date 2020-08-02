package interviewbit.string;

class AddBinaryString {
    public String addBinary(String A, String B) {
        boolean carry = false;
        int i = A.length() - 1;
        int j = B.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 && j >= 0) {

            int sum = carry ? 1 : 0;
            if (A.charAt(i) == '1') {
                sum += 1;
            }
            if (B.charAt(j) == '1') {
                sum += 1;
            }
            int b = sum % 2;
            carry = sum / 2 > 0;
            stringBuilder.append(b);
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = carry ? 1 : 0;
            if (A.charAt(i) == '1') {
                sum += 1;
            }
            int b = sum % 2;
            carry = sum / 2 > 0;
            stringBuilder.append(b);
            i--;
        }
        while (j >= 0) {
            int sum = carry ? 1 : 0;
            if (B.charAt(j) == '1') {
                sum += 1;
            }
            int b = sum % 2;
            carry = sum / 2 > 0;
            stringBuilder.append(b);
            j--;
        }
        if (carry) {
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }
}