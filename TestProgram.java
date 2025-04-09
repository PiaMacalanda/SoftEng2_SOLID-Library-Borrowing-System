public class TestProgram {
    
    public static void main(String[] args) {

        System.out.println("🤖 Welcome to NEU Library📚!\n" +
                            "🤖 How can I help you?\n");

        Student student = new Student("Jose Marie Jackie Chan", "NEU-S12345");
        
        // Test with diff resource types
        LibraryResource book = Library.getResource("book");
        LibraryResource journal = Library.getResource("journal");
        LibraryResource thesis = Library.getResource("thesis");
        LibraryResource newspaper = Library.getResource("newspaper");
        LibraryResource audiobook = Library.getResource("audioBook");
        
        // Borrow resources
        student.borrowResource(book, "Design Patterns");
        student.borrowResource(journal, "IEEE Software Engineering");
        student.borrowResource(thesis, "Advanced Machine Learning Techniques");
        student.borrowResource(newspaper, "Releasing Cinamorrol x Ben 10");
        student.borrowResource(audiobook, "First, We Make the Beast Beautiful");
        
        System.out.println("\nReturning Resources...\n");
        
        // Return resources
        student.returnResource(book, "Design Patterns");
        student.returnResource(journal, "IEEE Software Engineering");
        
        // Demonstration of Extensibility...
        
        // If we want to add a new resource type, we just need to:
        // 1. Create a new class implementing LibraryResource
        // 2. Add it to the Library.java factory
        // 3. No changes needed to the Student class!
        
        // Let's simulate this with a "mock" AudioBook resource
        // System.out.println("Future extension with other type would work the same way");
        // student.borrowResource(audiobook, "First, We Make the Beast Beautiful");
        // Output would be: "John Doe (ID: S12345) borrowed AudioBook: The Great Gatsby"
    }
}