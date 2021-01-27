import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<MeetingRoom> meetingRooms;
    private HashMap<String, DiningRoom > diningRooms;
    private HashMap<Integer, Bedroom > emptyBedrooms;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.meetingRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
        this.emptyBedrooms = new HashMap<>();
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

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
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

    public void addDiningRoomToHotel(DiningRoom diningRoom){
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public void addEmptyRoom(Bedroom bedroom){
        emptyBedrooms.put(bedroom.getRoomNumber(), bedroom);
    }

    public void removeOccupiedRoom(Bedroom bedroom){
        emptyBedrooms.remove(bedroom.getRoomNumber());
    }
}
