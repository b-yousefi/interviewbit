package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrailingZerosFactorialTest {

    @Test
    public void trailingZeroes() {
        TrailingZerosFactorial trailingZerosFactorial = new TrailingZerosFactorial();
        assertEquals(1, trailingZerosFactorial.trailingZeroes(5));
    }
}