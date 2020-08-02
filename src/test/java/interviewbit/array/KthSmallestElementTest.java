package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KthSmallestElementTest {

    @Test
    public void kthsmallest() {
        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(2);

        assertEquals(2, kthSmallestElement.kthsmallest(list1, 3));
    }
}