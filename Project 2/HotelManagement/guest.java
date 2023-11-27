package HotelManagement;
import java.io.Serializable;

public class guest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int roomNumber;

    public guest(String name, int roomNumber) {
        this.name = name;
        this.roomNumber = roomNumber;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Guest{name='" + name + "', roomNumber=" + roomNumber + '}';
    }
}
