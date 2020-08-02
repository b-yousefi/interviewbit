package interviewbit.stack;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LargestRectangleHistogramTest {

    @Test
    public void largestRectangleArea() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(5);
        list1.add(6);
        list1.add(2);
        list1.add(3);
        LargestRectangleHistogram largestRectangleHistogram = new LargestRectangleHistogram();

        assertEquals(10, largestRectangleHistogram.largestRectangleArea(list1));
    }
}