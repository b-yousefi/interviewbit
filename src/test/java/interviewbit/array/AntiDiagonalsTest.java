package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AntiDiagonalsTest {

    @Test
    public void diagonal() {
        AntiDiagonals antiDiagonals = new AntiDiagonals();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        A.add(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        A.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        A.add(list3);
        ArrayList<ArrayList<Integer>> result = antiDiagonals.diagonal(A);
        assertEquals(5, result.size());
        assertEquals(List.of(1), result.get(0));
        assertEquals(List.of(2, 4), result.get(1));
        assertEquals(List.of(3, 5, 7), result.get(2));
        assertEquals(List.of(6, 8), result.get(3));
        assertEquals(List.of(9), result.get(4));
    }
}