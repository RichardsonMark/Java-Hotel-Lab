import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HotelTest {

    private Hotel hotel;

    @Test
    public void canCreateHotel(){
        Hotel hotel = new Hotel("CodeClan Towers");
        assertNotNull(hotel);
    }


    @Test
    public void canCheckGuestIn(){
        Hotel hotel = new Hotel("CodeClan Towers");
        Guest guest = new Guest("CodeClan Executive");
        Bedroom bedroom = new Bedroom(101, 4, "Family");
        hotel.setBedrooms(bedroom);
        hotel.checkGuestIn(guest);
        assertEquals(1, hotel.getBedrooms().size());
        assertEquals(1, hotel.getBedrooms().get(0).getGuests().size());
    }

    @Test
    public void canCheckGuestOut() {
        Hotel hotel = new Hotel("CodeClan Towers");
        Guest guest = new Guest("CodeClan Executive");
        Bedroom bedroom = new Bedroom(101, 4, "Family");
        hotel.setBedrooms(bedroom);
        hotel.checkGuestIn(guest);
//        hotel.checkGuestOut(guest);
//        assertEquals(0, hotel.getBedrooms().get(0).getGuests().size());
        assertEquals("Checked out", hotel.checkGuestOut(guest));
    }

    }
