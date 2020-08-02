package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoPrimeTest {

    @Test
    public void cpFact() {
        CoPrime coPrime = new CoPrime();
        assertEquals(5, coPrime.cpFact(30, 12));
    }
}