package interviewbit.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

    @Test
    public void solve() {
        PascalTriangle pascalTriangle = new PascalTriangle();
        assertEquals(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1)),
                pascalTriangle.solve(5));
    }
}