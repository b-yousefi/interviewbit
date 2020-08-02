package interviewbit.array;

import java.util.ArrayList;

class PRETTYPRINT {

    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int k = 0;
        int size = (A * 2) - 1;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int n = 0; n < size; n++) {
            result.add(new ArrayList<>());
            for (int m = 0; m < size; m++) {
                result.get(n).add(0);
            }
        }
        while (k < A) {
            for (int m = k; m < size - k; m++) {
                result.get(k).set(m, A - k);
                result.get(size - k - 1).set(m, A - k);
            }
            for (int m = k; m < size - k; m++) {
                result.get(m).set(k, A - k);
                result.get(m).set(size - k - 1, A - k);
            }
            k++;
        }
        return result;
    }
}