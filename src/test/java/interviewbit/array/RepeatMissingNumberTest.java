package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RepeatMissingNumberTest {

    @Test
    public void repeatedNumber() {
        RepeatMissingNumber repeatMissingNumber = new RepeatMissingNumber();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(3);

        assertEquals(List.of(3, 4), repeatMissingNumber.repeatedNumber(list1));
    }
}