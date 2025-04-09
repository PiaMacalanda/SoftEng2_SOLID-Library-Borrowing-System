public class Audiobook implements LibraryResource {

    @Override
    public boolean isAvailable(String title) {

        System.out.println("Checking if audio book '" + title + "' is available");
        return true;
    }

    @Override
    public void borrow(String title) {

        System.out.println("Audio book '" + title + "' has been borrowed");
    }

    @Override
    public void returnResource(String title) {

        System.out.println("Audio book '" + title + "' has been returned");
    }

    @Override
    public String getType() {
        
        return "Audiobook";
    }
}
