package interviewbit.twoPointers;

import java.util.ArrayList;

class RemoveDuplicatesSortedArray {
    public int removeDuplicates(ArrayList<Integer> a) {
        for (int i = a.size() - 1; i > 0; i--) {
            if (a.get(i).equals(a.get(i - 1))) {
                a.remove(i);
            }
        }
        return a.size();
    }
}