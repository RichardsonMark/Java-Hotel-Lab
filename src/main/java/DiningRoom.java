import java.util.ArrayList;

public class DiningRoom {
    private String name;
    private ArrayList<Guest> guests;

    public DiningRoom(String name){
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(Guest guest){
        guests.add(guest);
    }

}
