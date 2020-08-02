package interviewbit.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> list, int sum) {
        Map<Integer, Integer> remainIndx = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (remainIndx.containsKey(list.get(i))) {
                result.add(remainIndx.get(list.get(i)) + 1);
                result.add(i + 1);
                break;
            }
            int remain = sum - list.get(i);
            if (!remainIndx.containsKey(remain))
                remainIndx.put(remain, i);
        }
        return result;
    }
}
