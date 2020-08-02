package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDTest {

    @Test
    public void gcd() {
        GCD gcd = new GCD();

        assertEquals(3, gcd.gcd(6, 9));
    }
}