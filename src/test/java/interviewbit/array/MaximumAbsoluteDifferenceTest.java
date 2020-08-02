package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MaximumAbsoluteDifferenceTest {

    @Test
    public void maxArr() {
        MaximumAbsoluteDifference maximumAbsoluteDifference = new MaximumAbsoluteDifference();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(-1);
        assertEquals(5, maximumAbsoluteDifference.maxArr(list1));
    }
}