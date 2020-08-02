package interviewbit.binarySearch;

import java.util.ArrayList;

class MatrixSearch {

    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        int i = 0, j = A.get(0).size() - 1;
        while (i < A.size() && j >= 0) {
            if (A.get(i).get(j) == B) {
                return 1;
            } else if (A.get(i).get(j) < B) {
                i++;
            } else {
                j--;
            }
        }
        return 0;
    }
}