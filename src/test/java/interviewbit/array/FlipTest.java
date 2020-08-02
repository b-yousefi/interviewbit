package interviewbit.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlipTest {

    @Test
    public void flip() {
        final Flip flip = new Flip();
        assertEquals(List.of(1, 1), flip.flip("0111010"));
    }
}