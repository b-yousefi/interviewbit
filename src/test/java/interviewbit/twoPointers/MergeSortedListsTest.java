package interviewbit.twoPointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeSortedListsTest {

    @Test
    public void merge() {
        MergeSortedLists mergeSortedLists = new MergeSortedLists();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(8);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(9);
        mergeSortedLists.merge(list1, list2);
        assertEquals(List.of(1, 5, 6, 8, 9), list1);
    }
}