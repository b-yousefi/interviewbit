package interviewbit.binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class SortedInsertPosition {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int indx = Collections.binarySearch(a, b);
        if (indx < 0) {
            return Math.abs(indx) - 1;
        } else {
            return indx;
        }
    }
}
