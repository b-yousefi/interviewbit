package interviewbit.binarySearch;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SortedInsertPositionTest {

    @Test
    public void searchInsert() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        SortedInsertPosition sortedInsertPosition = new SortedInsertPosition();
        assertEquals(2, sortedInsertPosition.searchInsert(list, 5));
    }
}