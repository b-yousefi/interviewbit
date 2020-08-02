package interviewbit.math;

import java.util.*;

class RearrangeArray {

    public void arrange(ArrayList<Integer> array) {
        int size = array.size();
        for (int i = 0; i < size; i++) {
            if (array.get(i) < i) {
                array.set(i, array.get(i) * size + (array.get(array.get(i)) / size));
            } else {
                array.set(i, array.get(i) * size + array.get(array.get(i)));
            }
        }
        for (int i = 0; i < size; i++) {
            array.set(i, array.get(i) % size);
        }
    }
}