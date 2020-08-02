package interviewbit.twoPointers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveElementFromArrayTest {

    @Test
    public void removeElement() {
        RemoveElementFromArray removeElementFromArray = new RemoveElementFromArray();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(3);
        assertEquals(3, removeElementFromArray.removeElement(list1, 1));
        assertEquals(List.of(4, 2, 3), list1.subList(0, 3));
    }
}