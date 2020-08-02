package interviewbit.binarySearch;

import java.util.Collections;
import java.util.List;

class RotatedSortedArraySearch {
    public int search(final List<Integer> A, int B) {
        int pivot = findPivot(A);
        int result = Collections.binarySearch(A.subList(0, pivot + 1), B);
        if (result < 0) {
            result = Collections.binarySearch(A.subList(pivot + 1, A.size()), B);
        } else {
            return result;
        }
        return result >= 0 ? result + pivot + 1 : -1;
    }

    public int findPivot(final List<Integer> list) {
        int start = 0, end = list.size() - 1, pivot = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid + 1 < end && list.get(mid) > list.get(mid + 1)) {
                pivot = mid;
                break;
            }
            if (mid - 1 > 0 && list.get(mid) < list.get(mid - 1)) {
                pivot = mid - 1;
                break;
            }
            if (list.get(mid) < list.get(start)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return pivot;
    }
}