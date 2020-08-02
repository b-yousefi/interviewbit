package interviewbit.hashing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    @Test
    public void twoSum() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(7);
        list1.add(11);
        list1.add(15);
        TwoSum twoSum = new TwoSum();
        assertEquals(List.of(1, 2), twoSum.twoSum(list1, 9));
    }
}