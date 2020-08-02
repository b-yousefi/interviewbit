package interviewbit.twoPointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesSortedArrayIITest {

    @Test
    public void removeDuplicates() {
        RemoveDuplicatesSortedArrayII removeDuplicatesSortedArrayII = new RemoveDuplicatesSortedArrayII();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(2);
        assertEquals(3, removeDuplicatesSortedArrayII.removeDuplicates(list1));
        assertEquals(List.of(1, 1, 2), list1);
    }
}