package interviewbit.twoPointers;

import java.util.ArrayList;

class RemoveElementFromArray {
    public int removeElement(ArrayList<Integer> a, int b) {
        int size = a.size();
        int validInx = 0;
        int i = 0;
        while (i < size) {
            while (i < size && a.get(i) == b) {
                i++;
            }
            if (i != size) {
                a.set(validInx, a.get(i));
                validInx++;
                i++;
            }
        }
        return validInx;
    }
}