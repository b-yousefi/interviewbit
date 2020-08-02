package interviewbit.array;

import java.util.ArrayList;
import java.util.Collections;

class HotelBookings {

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        ArrayList<Booking> allTimes = new ArrayList<>();
        for (Integer integer : arrive) {
            allTimes.add(new Booking(integer, TimeType.ARRIVE));
        }
        for (Integer integer : depart) {
            allTimes.add(new Booking(integer, TimeType.DEPART));
        }
        Collections.sort(allTimes);
        int currentResident = 0;
        for (Booking allTime : allTimes) {
            if (allTime.eTimeType == TimeType.ARRIVE) {
                currentResident++;
                if (currentResident > K) {
                    return false;
                }
            } else {
                currentResident--;
            }
        }
        return true;
    }

    enum TimeType {
        ARRIVE, DEPART
    }

    static class Booking implements Comparable<Booking> {
        Integer day;
        TimeType eTimeType;

        Booking(Integer day, TimeType eTimeType) {
            this.day = day;
            this.eTimeType = eTimeType;
        }

        @Override
        public int compareTo(Booking other) {
            int result = day.compareTo(other.day);
            if (result == 0) {
                if (this.eTimeType == TimeType.DEPART) {
                    return -1;
                } else {
                    return 1;
                }
            } else
                return result;
        }
    }
}