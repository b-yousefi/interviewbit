package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaxNonNegativeSubArrayTest {

    @Test
    public void maxset() {
        MaxNonNegativeSubArray maxNonNeg = new MaxNonNegativeSubArray();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(-7);
        list.add(2);
        list.add(3);
        assertEquals(List.of(1, 2, 5), maxNonNeg.maxset(list));
    }
}