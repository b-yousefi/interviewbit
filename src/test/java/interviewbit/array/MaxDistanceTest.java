package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MaxDistanceTest {

    @Test
    public void maximumGap() {
        MaxDistance maxDistance = new MaxDistance();
        final ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        assertEquals(2, maxDistance.maximumGap(list1));
    }
}