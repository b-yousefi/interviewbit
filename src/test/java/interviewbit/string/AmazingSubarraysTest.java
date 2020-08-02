package interviewbit.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmazingSubarraysTest {

    @Test
    public void solve() {
        AmazingSubarrays amazingSubarrays = new AmazingSubarrays();
        assertEquals(6, amazingSubarrays.solve("ABEC"));
    }
}