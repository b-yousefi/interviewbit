package interviewbit.binarySearch;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MatrixSearchTest {

    @Test
    public void searchMatrix() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(11);
        list2.add(16);
        list2.add(20);
        ArrayList<Integer> list3 = new ArrayList<>();
        list2.add(23);
        list2.add(30);
        list2.add(34);
        list2.add(50);
        list.add(list1);
        list.add(list2);
        list.add(list3);
        MatrixSearch matrixMedian = new MatrixSearch();
        assertEquals(1, matrixMedian.searchMatrix(list, 3));
    }
}