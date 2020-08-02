package interviewbit.binarySearch;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class MedianArrayTest {

    @Test
    public void findMedianSortedArrays() {
        MedianArray medianArray = new MedianArray();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);

        assertEquals(3, medianArray.findMedianSortedArrays(list1, list2), 0);
    }
}