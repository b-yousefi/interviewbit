package interviewbit.twoPointers;

import java.util.ArrayList;

class MergeSortedLists {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        int size = a.size();
        while (i < size + j && j < b.size()) {
            if (a.get(i) < b.get(j)) {
                i++;
            } else {
                a.add(i, b.get(j));
                j++;
                i++;
            }
        }
        while (j != b.size()) {
            a.add(b.get(j));
            j++;
        }
    }
}