package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerTest {

    @Test
    public void isPower() {
        Power power = new Power();

        assertEquals(1, power.isPower(1024064001));
    }
}