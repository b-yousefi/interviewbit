package interviewbit.twoPointers;

import java.util.ArrayList;
import java.util.List;

class IntersectionSortedArrays {

    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        int aIndx = 0;
        int bIndx = 0;
        while (aIndx < A.size() && bIndx < B.size()) {
            if (A.get(aIndx).equals(B.get(bIndx))) {
                result.add(A.get(aIndx));
                aIndx++;
            } else if (A.get(aIndx) < B.get(bIndx)) {
                aIndx++;
            } else {
                bIndx++;
            }
        }
        return result;
    }
}