package interviewbit.twoPointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntersectionSortedArraysTest {

    @Test
    public void intersect() {
        IntersectionSortedArrays inter = new IntersectionSortedArrays();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        assertEquals(List.of(3, 3, 5), inter.intersect(list1, list2));
    }
}