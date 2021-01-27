import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DiningRoomTest {

    private DiningRoom diningRoom;
    private Guest guest;

    @Test
    public void canCreateDiningRoom(){
        DiningRoom diningRoom = new DiningRoom("Front Lounge");
        assertNotNull(diningRoom);
    }

    @Test
    public void canAddGuestToDiningRoom(){
        Guest bob = new Guest("Bob");
        Guest sue = new Guest("Sue");
        DiningRoom diningRoom = new DiningRoom("Front Lounge");
        diningRoom.setGuests(bob);
        diningRoom.setGuests(sue);
        assertEquals(2, diningRoom.getGuests().size());
    }
}
