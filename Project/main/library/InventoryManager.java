package library;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class InventoryManager {
    private List<Book> bookInventory;

    public InventoryManager() {
        this.bookInventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void removeBook(Book book) {
        bookInventory.remove(book);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(bookInventory);
    }

    public void saveInventoryToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(bookInventory);
            System.out.println("Inventory saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadInventoryFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            bookInventory = (List<Book>) ois.readObject();
            System.out.println("Inventory loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
