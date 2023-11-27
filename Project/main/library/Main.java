package library;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private InventoryManager inventoryManager;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        inventoryManager = new InventoryManager();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/library/main.fxml"));
            Parent root = loader.load();
            MainController mainController = loader.getController();
            mainController.setInventoryManager(inventoryManager);
            mainController.setMainApp(this);

            primaryStage.setTitle("Bookstore Inventory Manager");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAddUpdateBookWindow(InventoryManager inventoryManager, Book book) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/library/addupdate.fxml"));
            Parent root = loader.load();

            AddUpdateController addUpdateController = loader.getController();
            addUpdateController.setInventoryManager(inventoryManager);
            addUpdateController.setBook(book);

            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Add/Update Book");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
