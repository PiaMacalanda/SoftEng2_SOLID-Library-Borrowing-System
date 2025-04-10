package library;

public class LibraryFacade {

    public LibraryResource getResource(String resourceType) {
        
        return Library.createResource(resourceType);
    }
    
    public boolean checkAvailability(String resourceType, String title) {

        LibraryResource resource = getResource(resourceType);
        return resource.isAvailable(title);
    }
    
    public void borrowResource(Student student, String resourceType, String title) {

        LibraryResource resource = getResource(resourceType);

        if (resource.isAvailable(title)) {

            resource.borrow(title);
            System.out.println("👤 " + student.getName() + " (ID: " + student.getId() + ") borrowed " + 
                               resource.getType() + ": " + title);
        } else {
            System.out.println("Sorry, " + resource.getType() + " '" + title + "' is not available.");
        }
    }
    
    public void returnResource(Student student, String resourceType, String title) {

        LibraryResource resource = getResource(resourceType);
        resource.returnResource(title);

        System.out.println("👤 " + student.getName() + " (ID: " + student.getId() + ") returned " + 
                           resource.getType() + ": " + title);
    }
}