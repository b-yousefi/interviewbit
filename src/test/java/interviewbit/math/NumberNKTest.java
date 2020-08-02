package interviewbit.math;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberNKTest {

    @Test
    public void solve() {
        final NumberNK nk = new NumberNK();
        // Input: A[] = {0, 1, 5}, N = 1, K = 2
        // Output: 2
        final ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(5);

        assertEquals(2, nk.solve(list1, 1, 2));
    }
}