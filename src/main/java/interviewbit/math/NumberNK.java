package interviewbit.math;

import java.util.ArrayList;


class NumberNK {
    int allNumbers;
    ArrayList<Integer> possibleNumberEqual = new ArrayList<>();
    ArrayList<Integer> possibleNumberLess = new ArrayList<>();

    public int solve(ArrayList<Integer> A, int B, int C) {
        allNumbers = A.size();
        if (allNumbers == 0) {
            return 0;
        }
        ArrayList<Integer> limit = new ArrayList<>();
        String strC = String.valueOf(C);
        if (strC.length() < B) {
            return 0;
        }
        if (strC.length() > B) {
            return (int) (A.get(0) == 0 && B > 1 ? (allNumbers - 1) * Math.pow(allNumbers, B - 1)
                    : Math.pow(allNumbers, B));
        }
        for (int i = 0; i < strC.length(); i++) {
            limit.add(Character.getNumericValue(strC.charAt(i)));
        }
        for (int i = 0; i < B; i++) {
            int countLess = 0, countEqual = 0;
            for (Integer integer : A) {
                if (integer < limit.get(i) && (i != 0 || integer != 0 || B == 1)) {
                    countLess++;
                } else if (integer.equals(limit.get(i))) {
                    countEqual++;
                }
            }
            possibleNumberEqual.add(countEqual);
            possibleNumberLess.add(countLess);
        }
        return sumPossibleNumbers(0, B);
    }

    private int sumPossibleNumbers(int i, int B) {
        double sum = 0;
        if (possibleNumberLess.get(i) > 0) {
            sum = possibleNumberLess.get(i) * (Math.pow(allNumbers, (B - i - 1)));
        }
        if (possibleNumberEqual.get(i) > 0 && i + 1 < B) {
            sum += sumPossibleNumbers(i + 1, B);
        }
        return (int) sum;
    }
}