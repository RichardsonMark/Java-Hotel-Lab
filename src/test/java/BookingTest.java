import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Test
    public void canCreateBooking(){
        bedroom = new Bedroom(101, 2, "Double", 125);
        booking = new Booking(bedroom, 2);
        assertNotNull(booking);
    }

    @Test
    public void canGetTotalBill(){
        bedroom = new Bedroom(101, 2, "Double", 125);
        booking = new Booking(bedroom, 2);
        assertEquals( 250, booking.getTotalBill());
    }
}
