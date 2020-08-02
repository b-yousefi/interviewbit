package interviewbit.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class kthRowPascalTriangleTest {

    @Test
    public void getRow() {
        kthRowPascalTriangle pascalTriangle = new kthRowPascalTriangle();
        assertEquals(List.of(1, 3, 3, 1), pascalTriangle.getRow(3));
    }
}