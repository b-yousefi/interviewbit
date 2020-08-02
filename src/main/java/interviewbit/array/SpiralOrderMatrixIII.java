package interviewbit.array;

import java.util.ArrayList;

class SpiralOrderMatrixIII {

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int k = 0; k < A; k++) {
            result.add(new ArrayList<>());
            for (int m = 0; m < A; m++) {
                result.get(k).add(0);
            }
        }
        int i = 0, j = 0, r = 0, c = 0;
        boolean plus = true;
        boolean rowCol = true; // row: true, col: flase
        for (int k = 0; k < A * A; k++) {
            result.get(i).set(j, k + 1);
            if (rowCol) {
                if (plus) {
                    if (j < A - 1 - c) {
                        j++;
                    } else {
                        rowCol = false;
                        i++;
                    }
                } else {
                    if (j > r) {
                        j--;
                    } else {
                        rowCol = false;
                        r++;
                        i--;
                    }
                }
            } else {
                if (plus) {
                    if (i < A - 1 - r) {
                        i++;
                    } else {
                        rowCol = true;
                        plus = false;
                        j--;
                        c++;
                    }
                } else {
                    if (i > c) {
                        i--;
                    } else {
                        rowCol = true;
                        plus = true;
                        j++;
                    }
                }
            }
        }
        return result;
    }
}