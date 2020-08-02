package interviewbit.binarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareRootTest {

    @Test
    public void sqrt() {
        SquareRoot squareRoot = new SquareRoot();
        assertEquals(3, squareRoot.sqrt(11));
    }
}