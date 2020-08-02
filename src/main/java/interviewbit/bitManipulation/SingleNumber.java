package interviewbit.bitManipulation;

import java.util.List;

class SingleNumber {
    public int singleNumber(final List<Integer> list) {
        int xor = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            xor ^= list.get(i);
        }
        return xor;
    }

}