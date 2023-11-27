package library;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private TableView<Book> tableView;

    @FXML
    private TableColumn<Book, String> titleColumn;

    @FXML
    private TableColumn<Book, String> authorColumn;

    @FXML
    private TableColumn<Book, Integer> quantityColumn;

    @FXML
    private TableColumn<Book, Double> priceColumn;

    @FXML
    private Button addBookButton;

    @FXML
    private Button updateBookButton;

    @FXML
    private Button deleteBookButton;

    private InventoryManager inventoryManager;
    private Main mainApp; // Add this field

    public void setInventoryManager(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
        updateTableView();
    }

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void initialize() {
        // Initialize columns
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

    }

    @FXML
    private void handleAddBook() {
        mainApp.showAddUpdateBookWindow(inventoryManager, null);
    }

    @FXML
    private void handleUpdateBook() {
        Book selectedBook = tableView.getSelectionModel().getSelectedItem();

        if (selectedBook != null) {
            mainApp.showAddUpdateBookWindow(inventoryManager, selectedBook);
        } else {
            showAlert("No Book Selected", "Please select a book to update.");
        }
    }

    @FXML
    private void handleDeleteBook() {
        // Get the selected book from the table
        Book selectedBook = tableView.getSelectionModel().getSelectedItem();

        if (selectedBook != null) {
            // Remove the selected book from the inventory
            inventoryManager.removeBook(selectedBook);
            updateTableView();
        } else {
            // Display an alert informing the user to select a book
            showAlert("No Book Selected", "Please select a book to delete.");
        }
    }

    private void updateTableView() {
        // Update the table view with the current inventory
        tableView.getItems().setAll(inventoryManager.getAllBooks());
    }

    private void showAlert(String title, String message) {
        // Display an alert with the given title and message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
