package interviewbit.stack;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RainWaterTrappedTest {

    @Test
    public void trap() {
        RainWaterTrapped rainWaterTrapped = new RainWaterTrapped();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(0);
        list1.add(2);
        list1.add(1);
        list1.add(0);
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        list1.add(1);
        assertEquals(6, rainWaterTrapped.trap(list1));
    }
}