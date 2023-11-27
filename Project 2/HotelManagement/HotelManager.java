package HotelManagement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HotelManager extends Application {

    private Hotel hotel;

    public static void main(String[] args) {
        launch(args);
    }
    public Hotel getHotel() {
        return hotel;
    }
    @Override
    public void start(Stage primaryStage) {
        hotel = new Hotel();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/HotelManagement/main.fxml"));
            Parent root = loader.load();
            primaryStage.setTitle("Hotel Management System");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAddUpdateGuestWindow(guest guest) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/HotelManagement/addupdate.fxml"));
            Parent root = loader.load();

            AddUpdateController addUpdateController = loader.getController();
            addUpdateController.setHotelManager(this);
            addUpdateController.setGuest(guest);

            Stage stage = new Stage();
            stage.setTitle("Add/Update Guest");
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
