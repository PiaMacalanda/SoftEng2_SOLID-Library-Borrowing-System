public class Thesis implements LibraryResource {
    
    @Override
    public boolean isAvailable(String title) {

        System.out.println("Checking if thesis '" + title + "' is available");
        return true;
    }

    @Override
    public void borrow(String title) {

        System.out.println("Thesis '" + title + "' has been borrowed");
    }

    @Override
    public void returnResource(String title) {

        System.out.println("Thesis '" + title + "' has been returned");
    }

    @Override
    public String getType() {

        return "Thesis";
    }
}