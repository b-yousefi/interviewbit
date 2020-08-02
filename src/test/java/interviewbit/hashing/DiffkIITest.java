package interviewbit.hashing;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiffkIITest {

    @Test
    public void diffPossible() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(2);
        DiffkII diffkII = new DiffkII();

        assertEquals(1, diffkII.diffPossible(list1, 2));
    }
}