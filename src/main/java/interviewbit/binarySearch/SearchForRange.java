package interviewbit.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SearchForRange {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        int indx = Collections.binarySearch(A, B);
        ArrayList<Integer> result = new ArrayList<>();
        if (indx < 0) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        int sRange = indx, eRange = indx, start = 0, end = indx, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (B == A.get(mid)) {
                sRange = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = indx;
        end = A.size() - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (B == A.get(mid)) {
                eRange = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        result.add(sRange);
        result.add(eRange);
        return result;
    }
}