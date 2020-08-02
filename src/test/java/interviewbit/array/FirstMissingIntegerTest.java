package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FirstMissingIntegerTest {

    @Test
    public void firstMissingPositive() {
        FirstMissingInteger firstMissingInteger = new FirstMissingInteger();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(-1);
        list1.add(1);

        assertEquals(2, firstMissingInteger.firstMissingPositive(list1));
    }
}