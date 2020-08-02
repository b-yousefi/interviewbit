package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NobleIntegerTest {

    @Test
    public void solve() {
        NobleInteger nobleInteger = new NobleInteger();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(3);

        assertEquals(1, nobleInteger.solve(list1));
    }
}