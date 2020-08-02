package interviewbit.math;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz() {
        FizzBuzz fuzzBuzz = new FizzBuzz();

        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), fuzzBuzz.fizzBuzz(5));
    }
}