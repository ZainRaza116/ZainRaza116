package library;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddUpdateController {

    private InventoryManager inventoryManager;
    private Book book;  // New field to store the book being added/updated

    @FXML
    private TextField titleField;

    @FXML
    private TextField authorField;

    @FXML
    private TextField quantityField;

    @FXML
    private TextField priceField;

    public void setInventoryManager(InventoryManager inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

    public void setBook(Book book) {
        this.book = book;
        if (book != null) {
            // If updating a book, populate the fields with its details
            titleField.setText(book.getTitle());
            authorField.setText(book.getAuthor());
            quantityField.setText(Integer.toString(book.getQuantity()));
            priceField.setText(Double.toString(book.getPrice()));
        }
    }

    @FXML
    private void handleSave() {
        // Get data from fields and add/update book in inventory
        String title = titleField.getText();
        String author = authorField.getText();
        int quantity = Integer.parseInt(quantityField.getText());
        double price = Double.parseDouble(priceField.getText());

        if (book == null) {
            // Adding a new book
            Book newBook = new Book(title, author, quantity, price);
            inventoryManager.addBook(newBook);
        } else {
            // Updating an existing book
            book.setTitle(title);
            book.setAuthor(author);
            book.setQuantity(quantity);
            book.setPrice(price);
        }

        // Close the window
        closeWindow();
    }

    @FXML
    private void handleCancel() {
        // Close the window without saving
        closeWindow();
    }

    private void closeWindow() {
        Stage stage = (Stage) titleField.getScene().getWindow();
        stage.close();
    }
}
