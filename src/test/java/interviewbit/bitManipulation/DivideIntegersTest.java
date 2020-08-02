package interviewbit.bitManipulation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideIntegersTest {

    @Test
    public void divide() {
        DivideIntegers divideIntegers = new DivideIntegers();
        assertEquals(2, divideIntegers.divide(5, 2));
    }
}