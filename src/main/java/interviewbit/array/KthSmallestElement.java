package interviewbit.array;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class KthSmallestElement {
    public int kthsmallest(final List<Integer> list, int k) {
        PriorityQueue<Integer> kthSmallest = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer integer : list) {
            if (kthSmallest.size() < k) {
                kthSmallest.add(integer);
            } else if (kthSmallest.peek() > integer) {
                kthSmallest.poll();
                kthSmallest.add(integer);
            }
        }
        return kthSmallest.poll();
    }
}