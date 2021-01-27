import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MeetingRoomTest {

    private MeetingRoom meetingRoom;

    @Test
    public void canCreateMeetingRoom(){
        MeetingRoom meetingRoom = new MeetingRoom("Meeting Room 1", 10);
        assertNotNull(meetingRoom);
    }

}
