package interviewbit.math;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

    @Test
    public void hammingDistance() {
        HammingDistance hammingDistance = new HammingDistance();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);

        assertEquals(8, hammingDistance.hammingDistance(list1));
    }
}