package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LargestNumberTest {

    @Test
    public void largestNumber() {
        LargestNumber largestNumber = new LargestNumber();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(30);
        list1.add(34);
        list1.add(5);
        list1.add(9);
        assertEquals("9534330", largestNumber.largestNumber(list1));
    }
}