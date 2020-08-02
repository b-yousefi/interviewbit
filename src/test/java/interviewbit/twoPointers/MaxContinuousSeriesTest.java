package interviewbit.twoPointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaxContinuousSeriesTest {

    @Test
    public void maxone() {
        MaxContinuousSeries max = new MaxContinuousSeries();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(0);
        list1.add(1);
        list1.add(1);
        list1.add(0);
        list1.add(0);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        assertEquals(List.of(0, 1, 2, 3, 4), max.maxone(list1, 1));
    }
}