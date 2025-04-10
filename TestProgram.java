import library.*;
public class TestProgram {
    
    public static void main(String[] args) {

        System.out.println("🤖 Welcome to NEU Library📚!\n" +
                            "🤖 How can I help you?\n");

        LibraryFacade libraryFacade = new LibraryFacade();
        Student student = new Student("Jose Marie Jackie Chan", "NEU-S12345", libraryFacade);

        // Student borrows resources
        student.borrowResource("book", "Design Patterns");
        student.borrowResource("journal", "IEEE Software Engineering");
        student.borrowResource("thesis", "Advanced Machine Learning Techniques");
        student.borrowResource("newspaper", "Releasing Cinamorrol x Ben 10");
        student.borrowResource("audiobook", "First, We Make the Beast Beautiful");
        
        System.out.println("\nReturning Resources...\n");
        
        // Student returns some resources
        student.returnResource("book", "Design Patterns");
        student.returnResource("journal", "IEEE Software Engineering");
    }
}