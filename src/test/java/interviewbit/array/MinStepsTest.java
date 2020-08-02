package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MinStepsTest {

    @Test
    public void coverPoints() {
        MinSteps minSteps = new MinSteps();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        list2.add(2);


        assertEquals(2, minSteps.coverPoints(list1, list2));
    }
}