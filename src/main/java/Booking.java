public class Booking {
    private int nightsBooked;
    private Bedroom bedroom;

    public Booking (Bedroom bedroom, int nightsBooked){
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public int getTotalBill(){
        return this.nightsBooked * bedroom.getNightlyRate();
    }
}
