package interviewbit.array;

import java.util.ArrayList;

class Flip {

    public ArrayList<Integer> flip(final String A) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE, current_max = 0, current_s = 1, max_s = 1, max_e = 1;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') {
                current_max--;
            } else {
                current_max++;
            }
            if (current_max > 0 && max < current_max) {
                max = current_max;
                max_s = current_s;
                max_e = i + 1;
            }
            if (current_max < 0) {
                current_max = 0;
                current_s = i + 2;
            }
        }
        if (max > 0) {
            result.add(max_s);
            result.add(max_e);
        }
        return result;
    }
}