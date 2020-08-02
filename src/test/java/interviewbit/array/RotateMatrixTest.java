package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RotateMatrixTest {

    @Test
    public void rotate() {
        RotateMatrix rotateMatrix = new RotateMatrix();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list.add(list1);
        list.add(list2);
        rotateMatrix.rotate(list);
        assertEquals(List.of(List.of(3, 1), List.of(4, 2)), list);
    }
}