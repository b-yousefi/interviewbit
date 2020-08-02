package interviewbit.twoPointers;

import java.util.ArrayList;

/**
 * Created by: b.yousefi
 * Date: 8/3/2020
 */
public class RemoveDuplicatesSortedArrayII {
    public int removeDuplicates(ArrayList<Integer> a) {
        int pre = a.get(a.size() - 1);
        boolean second = false;
        for (int i = a.size() - 2; i >= 0; i--) {
            if (a.get(i).equals(pre)) {
                if (second) {
                    a.remove(i);
                } else {
                    second = true;
                }
            } else {
                pre = a.get(i);
                second = false;
            }
        }
        return a.size();
    }
}
