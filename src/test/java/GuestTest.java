import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GuestTest {

    private Guest guest;

    @Test
    public void canCreateGuest(){
        Guest guest = new Guest("CodeClan Executive");
        assertNotNull(guest);
    }

}
