package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(-321, reverseInteger.reverse((-123)));
    }
}