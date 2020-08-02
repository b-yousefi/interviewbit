package interviewbit.twoPointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesSortedArrayTest {

    @Test
    public void removeDuplicates() {
        RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(4);
        assertEquals(3, removeDuplicatesSortedArray.removeDuplicates(list1));
        assertEquals(List.of(1, 2, 4), list1);
    }
}