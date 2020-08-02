package interviewbit.array;

import java.util.ArrayList;

class MaximumAbsoluteDifference {
    public int maxArr(ArrayList<Integer> A) {
        int maxDiff;
        ArrayList<Integer> plusList = new ArrayList<>();
        ArrayList<Integer> minusList = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            plusList.add(A.get(i) + i);
            minusList.add(A.get(i) - i);
        }
        int maxValuePlusIndx = Integer.MIN_VALUE, minValuePlusIndx = Integer.MAX_VALUE; // A[i] + i
        int maxValueMinusIndx = Integer.MIN_VALUE, minValueMinusIndx = Integer.MAX_VALUE; // A[i] - i
        for (int i = 0; i < A.size(); i++) {
            if (plusList.get(i) > maxValuePlusIndx) {
                maxValuePlusIndx = plusList.get(i);
            }
            if (plusList.get(i) < minValuePlusIndx) {
                minValuePlusIndx = plusList.get(i);
            }
            if (minusList.get(i) > maxValueMinusIndx) {
                maxValueMinusIndx = minusList.get(i);
            }
            if (minusList.get(i) < minValueMinusIndx) {
                minValueMinusIndx = minusList.get(i);
            }
        }
        int diffPlus = maxValuePlusIndx - minValuePlusIndx;
        int diffMinus = maxValueMinusIndx - minValueMinusIndx;
        maxDiff = Math.max(diffPlus, diffMinus);
        return maxDiff;
    }

}