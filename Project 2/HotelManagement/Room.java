package HotelManagement;
import java.io.Serializable;

public class Room implements Serializable {
    private static final long serialVersionUID = 1L;

    private int roomNumber;
    private boolean occupied;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.occupied = false;
    }

    // Getters and setters

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy() {
        occupied = true;
    }

    public void vacate() {
        occupied = false;
    }

    @Override
    public String toString() {
        return "Room{roomNumber=" + roomNumber + ", occupied=" + occupied + '}';
    }
}
