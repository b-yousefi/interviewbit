package interviewbit.bitManipulation;

import java.util.ArrayList;
import java.util.Collections;

class MinXORvalue {
    public int findMinXor(ArrayList<Integer> list) {
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int xor = list.get(i) ^ list.get(i + 1);
            if (xor < min) {
                min = xor;
            }
        }
        return min;
    }
}