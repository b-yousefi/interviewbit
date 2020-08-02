package interviewbit.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RainWaterTrapped {
    public int trap(final List<Integer> A) {
        int count = 0;
        ArrayList<Integer> maxRights = new ArrayList<>();
        ArrayList<Integer> maxLefts = new ArrayList<>();
        int maxRight = 0, maxLeft = 0;
        for (Integer integer : A) {
            if (maxRight < integer) {
                maxRight = integer;
            }
            maxRights.add(maxRight);
        }
        for (int i = A.size() - 1; i >= 0; i--) {
            if (maxLeft < A.get(i)) {
                maxLeft = A.get(i);
            }
            maxLefts.add(maxLeft);
        }
        Collections.reverse(maxLefts);
        for (int i = 0; i < A.size(); i++) {
            count += Math.min(maxRights.get(i), maxLefts.get(i)) - A.get(i);
        }
        return count;
    }
}
