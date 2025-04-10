package library.resources;
import library.LibraryResource;

public class Book implements LibraryResource {

    @Override
    public boolean isAvailable(String title) {

        System.out.println("Checking if book '" + title + "' is available");
        return true;
    }

    @Override
    public void borrow(String title) {

        System.out.println("Book '" + title + "' has been borrowed");
    }

    @Override
    public void returnResource(String title) {

        System.out.println("Book '" + title + "' has been returned");
    }

    @Override
    public String getType() {

        return "Book";
    }
}
