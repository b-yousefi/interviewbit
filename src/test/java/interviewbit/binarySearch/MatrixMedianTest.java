package interviewbit.binarySearch;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MatrixMedianTest {

    @Test
    public void findMedian() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(6);
        list2.add(9);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list.add(list1);
        list.add(list2);
        list.add(list3);
        MatrixMedian matrixMedian = new MatrixMedian();
        assertEquals(5, matrixMedian.findMedian(list));
    }
}