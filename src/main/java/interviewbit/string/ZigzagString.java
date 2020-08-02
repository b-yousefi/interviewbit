package interviewbit.string;

class ZigzagString {
    public String convert(String str, int row) {
        if (row == 1) {
            return str;
        }
        StringBuilder[] stringBuilder = new StringBuilder[row];
        for (int k = 0; k < row; k++) {
            stringBuilder[k] = new StringBuilder();
        }
        boolean addSub = true; // true: add, false: sub
        int i = 0;
        int j = 0;
        while (i < str.length()) {
            stringBuilder[j].append(str.charAt(i));
            if (addSub) {
                j++;
            } else {
                j--;
            }
            if (j == row - 1 || j == 0) {
                addSub = !addSub;
            }
            i++;
        }
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < row; k++) {
            result.append(stringBuilder[k].toString());
        }
        return result.toString();
    }
}