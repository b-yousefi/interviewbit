package interviewbit.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridUniquePathsTest {

    @Test
    public void uniquePaths() {
        GridUniquePaths gridUniquePaths = new GridUniquePaths();

        assertEquals(2, gridUniquePaths.uniquePaths(2, 2));
    }
}