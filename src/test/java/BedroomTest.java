import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BedroomTest {

    private Bedroom bedroom;


    @Test
    public void canCreateBedroom(){
        Bedroom bedroom = new Bedroom(1, 2, "double");
        assertNotNull(bedroom);
    }



}
