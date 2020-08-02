package interviewbit.twoPointers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class MaxContinuousSeries {
    public ArrayList<Integer> maxone(ArrayList<Integer> list, int k) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        if (list.size() == 1) {
            if (list.get(0) == 0) {
                result.add(0);
            }
            return result;
        }
        List<Integer> maxIndxs = new ArrayList<>();
        Queue<Integer> indxs = new LinkedList<>();
        indxs.add(-1);
        int i;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                if (indxs.size() <= k) {
                    indxs.add(i);
                } else {
                    int maxC = i - indxs.peek() - 1;
                    if (maxC > max) {
                        max = maxC;
                        maxIndxs.clear();
                        maxIndxs.add(indxs.peek() + 1);
                        maxIndxs.add(i - 1);
                    }
                    indxs.poll();
                    indxs.add(i);
                }
            }
        }
        if (indxs.peek() != -1 || indxs.size() != 1) {

            int maxC = i - indxs.peek() - 1;
            if (maxC > max) {
                maxIndxs.clear();
                maxIndxs.add(indxs.peek() + 1);
                maxIndxs.add(i - 1);
            }

            for (int j = maxIndxs.get(0); j <= maxIndxs.get(maxIndxs.size() - 1); j++) {
                result.add(j);
            }
        } else {
            for (int j = 0; j <= list.size() - 1; j++) {
                result.add(j);
            }
        }

        return result;
    }
}