package interviewbit.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class MergeIntervals {

    static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Interval interval = (Interval) o;
            return start == interval.start &&
                    end == interval.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }

    public ArrayList<Interval> insert(final ArrayList<Interval> intervals, final Interval newInterval) {
        final ArrayList<Interval> result = new ArrayList<>();
        final ArrayList<MyPoint> allPoints = new ArrayList<>();

        for (Interval interval : intervals) {
            allPoints.add(new MyPoint(interval.start, PointType.START));
            allPoints.add(new MyPoint(interval.end, PointType.END));
        }
        allPoints.add(new MyPoint(newInterval.start, PointType.START));
        allPoints.add(new MyPoint(newInterval.end, PointType.END));
        Collections.sort(allPoints);
        int currentOverlaps = 0;
        int arriveDis = 0, departDis;
        for (MyPoint allPoint : allPoints) {
            if (allPoint.pointType == PointType.START) {
                if (currentOverlaps == 0) {
                    arriveDis = allPoint.number;
                }
                currentOverlaps++;
            } else {
                currentOverlaps--;
                if (currentOverlaps == 0) {
                    departDis = allPoint.number;
                    result.add(new Interval(arriveDis, departDis));
                }
            }
        }
        return result;
    }

    static class MyPoint implements Comparable<MyPoint> {
        Integer number;
        PointType pointType;

        MyPoint(final Integer number, final PointType pointType) {
            this.number = number;
            this.pointType = pointType;
        }

        @Override
        public int compareTo(final MyPoint other) {
            final int result = number.compareTo(other.number);
            if (result == 0) {
                if (this.pointType == PointType.END) {
                    return 1;
                } else {
                    return -1;
                }
            } else
                return result;
        }
    }

    enum PointType {
        START, END
    }

}