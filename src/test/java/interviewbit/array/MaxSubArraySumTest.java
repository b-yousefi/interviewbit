package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MaxSubArraySumTest {

    @Test
    public void maxSubArray() {
        MaxSubArraySum maxSubArraySum = new MaxSubArraySum();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(-10);

        assertEquals(10, maxSubArraySum.maxSubArray(list1));
    }
}