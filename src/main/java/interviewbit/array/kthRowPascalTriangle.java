package interviewbit.array;

import java.util.ArrayList;

class kthRowPascalTriangle {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        if (A == 0) {
            return result;
        } else {
            for (int i = 0; i < A; i++) {
                ArrayList<Integer> resultRow = new ArrayList<>();
                resultRow.add(1);
                for (int j = 0; j < i; j++) {
                    resultRow.add(result.get(j) + result.get(j + 1));
                }
                resultRow.add(1);
                result = resultRow;
            }
        }
        return result;
    }
}