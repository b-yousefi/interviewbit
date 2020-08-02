package interviewbit.twoPointers;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiffkIITest {

    @Test
    public void diffPossible() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        Diffk diffk = new Diffk();

        assertEquals(1, diffk.diffPossible(list1, 4));
    }
}