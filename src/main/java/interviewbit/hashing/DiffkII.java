package interviewbit.hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DiffkII {
    public int diffPossible(final List<Integer> list, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        list.forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1));
        for (Integer integer : list) {

            int remain = k + integer;
            if (map.containsKey(remain) && (remain != integer || map.get(remain) > 1)) {
                return 1;
            }
        }
        return 0;
    }
}