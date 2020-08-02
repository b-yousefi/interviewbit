package interviewbit.bitManipulation;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SingleNumberTest {

    @Test
    public void singleNumber() {
        SingleNumber singleNumber = new SingleNumber();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        assertEquals(3, singleNumber.singleNumber(list1));
    }
}