public class Student {

    private String name;
    private String id;
    
    public Student(String name, String id) {
    
        this.name = name;
        this.id = id;
    }
    
    public void borrowResource(LibraryResource resource, String title) {

        if (resource.isAvailable(title)) {
            resource.borrow(title);
            System.out.println("👤 " + name + " (ID: " + id + ") borrowed " + resource.getType() + ": " + title);
        } else {
            System.out.println("Sorry, " + resource.getType() + " '" + title + "' is not available.");
        }
    }
    
    public void returnResource(LibraryResource resource, String title) {

        resource.returnResource(title);
        System.out.println("👤 " + name + " (ID: " + id + ") returned " + resource.getType() + ": " + title);
    }

    public String getName() {

        return name;
    }

    public String getId() {

        return id;
    }
}