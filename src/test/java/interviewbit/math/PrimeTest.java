package interviewbit.math;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeTest {

    @Test
    public void primesum() {
        Prime prime = new Prime();

        assertEquals(List.of(2, 2), prime.primesum(4));
    }
}