public interface LibraryResource {
    
    boolean isAvailable(String title);
    void borrow(String title);
    void returnResource(String title);
    String getType();
}