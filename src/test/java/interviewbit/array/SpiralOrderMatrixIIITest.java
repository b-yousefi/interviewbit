package interviewbit.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpiralOrderMatrixIIITest {

    @Test
    public void generateMatrix() {
        SpiralOrderMatrixIII spiralOrderMatrixIII = new SpiralOrderMatrixIII();
        assertEquals(List.of(List.of(1, 2, 3), List.of(8, 9, 4), List.of(7, 6, 5)),
                spiralOrderMatrixIII.generateMatrix(3));
    }
}