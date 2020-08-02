package interviewbit.math;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RearrangeArrayTest {

    @Test
    public void arrange() {
        RearrangeArray rearrangeArray = new RearrangeArray();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(0);
        rearrangeArray.arrange(list1);
        assertEquals(List.of(0, 1), list1);
    }
}