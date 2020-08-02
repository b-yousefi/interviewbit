package interviewbit.array;

import java.util.ArrayList;


class MaxNonNegativeSubArray {

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> result;
        int startIndx = 0, endIndx = 0, start =0;
        double sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i)>= 0) {
                sum += A.get(i);
            } else {
                if (sum >= 0) {
                    if (sum > max) {
                        startIndx = start;
                        endIndx = i - 1;
                        max = sum;
                    } else if (sum == max) {
                        if ((i - 1 - start > endIndx - startIndx)) {
                            startIndx = start;
                            endIndx = i - 1;
                            max = sum;
                        }
                    }
                    sum = 0;
                }
                start = i+1;
            }
        }
        //check last sum
        if (sum > max) {
            startIndx = start;
            endIndx = A.size() - 1;
        } else if (sum == max) {
            if ((A.size() - 1 - start > endIndx - startIndx)) {
                startIndx = start;
                endIndx = A.size() - 1;
            }
        }
        result = new ArrayList<>(A.subList(startIndx, endIndx+1));
        return result;
    }
}