package interviewbit.bitManipulation;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SumBitDifferencesTest {

    @Test
    public void cntBits() {
        SumBitDifferences sumBitDifferences = new SumBitDifferences();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        assertEquals(8, sumBitDifferences.cntBits(list1));
    }
}