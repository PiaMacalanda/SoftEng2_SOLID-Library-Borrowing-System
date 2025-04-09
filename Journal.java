public class Journal implements LibraryResource {

    @Override
    public boolean isAvailable(String title) {

        System.out.println("Checking if journal '" + title + "' is available");
        return true;
    }

    @Override
    public void borrow(String title) {

        System.out.println("Journal '" + title + "' has been borrowed");
    }

    @Override
    public void returnResource(String title) {

        System.out.println("Journal '" + title + "' has been returned");
    }

    @Override
    public String getType() {
        
        return "Journal";
    }
}