package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MergeIntervalsTest {

    @Test
    public void merge() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        ArrayList<MergeIntervals.Interval> intervals = new ArrayList<>();
        intervals.add(new MergeIntervals.Interval(1, 3));
        intervals.add(new MergeIntervals.Interval(6, 9));

        assertEquals(
                List.of(new MergeIntervals.Interval(1, 5), new MergeIntervals.Interval(6, 9)),
                mergeIntervals.insert(intervals, new MergeIntervals.Interval(2, 5)));
    }
}