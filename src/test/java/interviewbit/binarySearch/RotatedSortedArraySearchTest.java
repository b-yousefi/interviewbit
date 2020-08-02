package interviewbit.binarySearch;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RotatedSortedArraySearchTest {

    @Test
    public void search() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(17);
        list.add(100);
        list.add(3);

        RotatedSortedArraySearch rotatedSortedArraySearch = new RotatedSortedArraySearch();
        assertEquals(-1, rotatedSortedArraySearch.search(list, 6));
    }
}