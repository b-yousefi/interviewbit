package interviewbit.array;

import java.util.ArrayList;
import java.util.Collections;

class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        int size = A.size();
        int i = 0;
        while (i < size - 1) {
            int temp = A.get(i);
            A.set(i, A.get(i + 1));
            A.set(i + 1, temp);
            i += 2;
        }
        return A;
    }
}