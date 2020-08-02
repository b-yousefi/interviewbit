package interviewbit.array;

import java.util.ArrayList;

class MinSteps {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() == 0) {
            return 0;
        }
        int steps = 0;
        int currentI = A.get(0);
        int currentJ = B.get(0);
        for (int k = 1; k < A.size(); k++) {
            int i = A.get(k);
            int j = B.get(k);
            while (currentI != i || currentJ != j) {
                steps++;
                if (currentI != i) {
                    if (currentI < i)
                        currentI++;
                    else
                        currentI--;
                }
                if (currentJ != j) {
                    if (currentJ < j)
                        currentJ++;
                    else
                        currentJ--;
                }
            }

        }
        return steps;
    }
}