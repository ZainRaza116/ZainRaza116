package HotelManagement;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private TableView<guest> guestTableView;

    @FXML
    private TableColumn<guest, String> nameColumn;

    @FXML
    private TableColumn<guest, Integer> roomNumberColumn;

    @FXML
    private Button addGuestButton;

    @FXML
    private Button updateGuestButton;

    @FXML
    private Button deleteGuestButton;
    
    private HotelManager hotelManager;

    public void setHotelManager(HotelManager hotelManager) {
        this.hotelManager = hotelManager;
        updateGuestTableView();
    }

    @FXML
    private void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        roomNumberColumn.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));

    }

    @FXML
    private void handleAddGuest() {
        hotelManager.showAddUpdateGuestWindow(null);
    }

    @FXML
    private void handleUpdateGuest() {
        guest selectedGuest = guestTableView.getSelectionModel().getSelectedItem();

        if (selectedGuest != null) {
            hotelManager.showAddUpdateGuestWindow(selectedGuest);
        } else {
            showAlert("No Guest Selected", "Please select a guest to update.");
        }
    }

    @FXML
    private void handleDeleteGuest() {
        guest selectedGuest = guestTableView.getSelectionModel().getSelectedItem();

        if (selectedGuest != null) {
            // Remove the selected guest from the hotel
            hotelManager.getHotel().removeGuest(selectedGuest);
            updateGuestTableView();
        } else {
            showAlert("No Guest Selected", "Please select a guest to delete.");
        }
    }

    private void updateGuestTableView() {
        guestTableView.getItems().setAll(hotelManager.getHotel().getAllGuests());
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
