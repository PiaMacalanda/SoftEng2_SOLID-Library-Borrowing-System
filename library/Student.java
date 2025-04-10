package library;

public class Student {

    private String name;
    private String id;
    private LibraryFacade libraryFacade;
    
    public Student(String name, String id, LibraryFacade libraryFacade) {

        this.name = name;
        this.id = id;
        this.libraryFacade = libraryFacade;
    }
    
    public void borrowResource(String resourceType, String title) {

        libraryFacade.borrowResource(this, resourceType, title);
    }
    
    public void returnResource(String resourceType, String title) {

        libraryFacade.returnResource(this, resourceType, title);
    }
    
    public String getName() {

        return name;
    }
    
    public String getId() {

        return id;
    }
}