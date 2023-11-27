package HotelManagement;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddUpdateController {

    private HotelManager hotelManager;
    private guest guest;

    @FXML
    private TextField nameField;

    @FXML
    private TextField roomNumberField;

    @FXML
    private Button saveButton;

    @FXML
    private Button cancelButton;

    public void setHotelManager(HotelManager hotelManager) {
        this.hotelManager = hotelManager;
    }

    public void setGuest(guest guest) {
        this.guest = guest;
        if (guest != null) {
            nameField.setText(guest.getName());
            roomNumberField.setText(String.valueOf(guest.getRoomNumber()));
        }
    }

    @FXML
    private void handleSave() {
        String name = nameField.getText();
        int roomNumber = Integer.parseInt(roomNumberField.getText());

        if (guest == null) {
            // Adding a new guest
            guest newGuest = new guest(name, roomNumber);
            hotelManager.getHotel().addGuest(newGuest);
        } else {
            // Updating an existing guest
            guest.setName(name);
            guest.setRoomNumber(roomNumber);
        }

        closeWindow();
    }

    @FXML
    private void handleCancel() {
        closeWindow();
    }

    private void closeWindow() {
        Stage stage = (Stage) nameField.getScene().getWindow();
        stage.close();
    }

 {
    
}
}

