package interviewbit.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NearestSmallestTest {

    @Test
    public void prevSmaller() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(2);
        list1.add(10);
        list1.add(8);
        NearestSmallest nearestSmallest = new NearestSmallest();
        assertEquals(List.of(-1, 4, -1, 2, 2), nearestSmallest.prevSmaller(list1));
    }
}