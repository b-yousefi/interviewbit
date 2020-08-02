package interviewbit.binarySearch;

import java.util.Collections;
import java.util.List;

class MedianArray {
    private double findMedian(final List<Integer> a, final List<Integer> b) {
        int size = a.size() + b.size();
        int target = size / 2;
        int start = 0;
        int end = a.size() - 1;
        int madian;
        while (start <= end) {
            int mid = (start + end) / 2;
            int num = a.get(mid);
            int indx = Collections.binarySearch(b, num);
            if (indx < 0) {
                indx = -indx - 1;
            }
            madian = mid + indx;
            if (madian == target) {
                if ((size & 1) == 0) {
                    double o;
                    if (mid > 0 && indx > 0) {
                        if (a.get(mid - 1) > b.get(indx - 1)) {
                            o = a.get(mid - 1);
                        } else {
                            o = b.get(indx - 1);
                        }
                    } else if (mid > 0) {
                        o = a.get(mid - 1);
                    } else {
                        o = b.get(indx - 1);
                    }

                    return (num + o) / 2;
                } else {
                    return num;
                }
            }
            if (madian > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        double result = findMedian(a, b);
        if (result != -1) {
            return result;
        }
        return findMedian(b, a);
    }
}