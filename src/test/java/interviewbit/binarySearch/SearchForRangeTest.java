package interviewbit.binarySearch;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchForRangeTest {

    @Test
    public void searchRange() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(10);
        SearchForRange searchForRange = new SearchForRange();
        assertEquals(List.of(3, 4), searchForRange.searchRange(list, 8));
    }
}