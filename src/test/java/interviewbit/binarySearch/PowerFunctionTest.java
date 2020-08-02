package interviewbit.binarySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerFunctionTest {

    @Test
    public void pow() {
        PowerFunction PowerFunction = new PowerFunction();
        assertEquals(2, PowerFunction.pow(2, 3, 3));
    }
}