package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Power2Test {

    @Test
    public void power() {
        Power2 power2 = new Power2();
        assertEquals(1, power2.power("128"));
    }
}