package interviewbit.bitManipulation;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MinXORvalueTest {

    @Test
    public void findMinXor() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(2);
        list1.add(5);
        list1.add(7);
        MinXORvalue minXORvalue = new MinXORvalue();

        assertEquals(2, minXORvalue.findMinXor(list1));
    }
}