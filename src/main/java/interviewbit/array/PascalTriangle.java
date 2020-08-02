package interviewbit.array;

import java.util.ArrayList;

class PascalTriangle {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (A > 0) {
            result.add(new ArrayList<>());
            result.get(0).add(1);
            if (A == 1) {
                return result;
            } else {
                for (int i = 0; i < A - 1; i++) {
                    ArrayList<Integer> resultRow = new ArrayList<>();
                    resultRow.add(1);
                    for (int j = 0; j < i; j++) {
                        resultRow.add(result.get(i).get(j) + result.get(i).get(j + 1));
                    }
                    resultRow.add(1);
                    result.add(new ArrayList<>());
                    result.set(i + 1, resultRow);
                }
            }
        }
        return result;
    }
}