package interviewbit.array;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HotelBookingsTest {

    @Test
    public void hotel() {
        HotelBookings hotelBookings = new HotelBookings();
        ArrayList<Integer> arrival = new ArrayList<>();
        arrival.add(1);
        arrival.add(3);
        arrival.add(5);
        ArrayList<Integer> departure = new ArrayList<>();
        departure.add(2);
        departure.add(6);
        departure.add(8);
        assertFalse(hotelBookings.hotel(arrival, departure, 1));
    }
}