package HotelManagement;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<guest> guests;

    public Hotel() {
        this.guests = new ArrayList<>();
    }

    public void addGuest(guest guest) {
        guests.add(guest);
    }

    public void removeGuest(guest guest) {
        guests.remove(guest);
    }

    public List<guest> getAllGuests() {
        return new ArrayList<>(guests);
    }
}
