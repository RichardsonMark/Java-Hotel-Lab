import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BedroomTest {

    private Bedroom bedroom;


    @Test
    public void canCreateBedroom(){
        Bedroom bedroom = new Bedroom(1, 2, "double",125);
        assertNotNull(bedroom);
    }

    @Test
    public void canGetNightlyRate(){
        Bedroom bedroom = new Bedroom(1, 2, "double",125);
        assertEquals(125, bedroom.getNightlyRate());
    }


}
