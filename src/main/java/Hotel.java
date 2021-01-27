import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<MeetingRoom> meetingRooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.meetingRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public ArrayList<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public String checkGuestIn(Guest guest) {
        if (bedrooms.size() > 0) {
            bedrooms.get(0).setGuests(guest);
        }
        return "No Rooms available!";
    }


    public String checkGuestOut(Guest guest) {
        // for room in bedrooms
        // check the room guest list for the guest
        // if guest exists, remove from guest list
        for(Bedroom bedroom : this.bedrooms){
            if (bedroom.getGuests().contains(guest) == true){
                bedroom.getGuests().remove(guest);
                return "Checked out";
            }
        }
        return "Guest already checked out";
    }

}
