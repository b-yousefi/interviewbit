package interviewbit.binarySearch;

import java.util.ArrayList;
import java.util.Collections;

class MatrixMedian {
    public int findMedian(ArrayList<ArrayList<Integer>> list) {
        int count, position;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int m = list.get(0).size() - 1;
        int midNum = (list.size() * list.get(0).size() + 1) / 2;
        for (ArrayList<Integer> integers : list) {
            if (integers.get(0) < min) {
                min = integers.get(0);
            }
            if (integers.get(m) > max) {
                max = integers.get(m);
            }
        }

        while (min < max) {
            int mid = min + (max - min) / 2;
            position = 0;
            for (ArrayList<Integer> integers : list) {
                count = Collections.binarySearch(integers, mid);
                if (count < 0) {
                    count = Math.abs(count) - 1;
                } else {
                    while (count <= m && integers.get(count) == mid) {
                        count++;
                    }
                }
                position = position + count;
            }
            if (position < midNum)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }
}