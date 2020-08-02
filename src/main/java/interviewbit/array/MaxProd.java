package interviewbit.array;

import java.util.ArrayList;
import java.util.Stack;

class MaxProd {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        int size = A.size();
        int maxSeen = 0;
        Stack<Integer> remained = new Stack<>();
        ArrayList<Integer> LIndx = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            LIndx.add(-1);
        }
        for (int i = 0; i < size; i++) {
            while (!remained.isEmpty() && A.get(i) > A.get(remained.peek())) {
                int prod = LIndx.get(remained.pop()) * i;
                if (prod > maxSeen) {
                    maxSeen = prod;
                }

            }
            if (!remained.isEmpty() && !A.get(i).equals(A.get(remained.peek())))
                LIndx.add(i, remained.peek());
            remained.push(i);
        }
        return maxSeen;
    }
}