public class Library {

    public static LibraryResource getResource(String resourceType) {

        switch (resourceType.toLowerCase()) {

            case "book":
                return new Book();

            case "journal":
                return new Journal();

            case "thesis":
                return new Thesis();

            case "newspaper":
                return new Newspaper();

            case "audiobook":
                return new Audiobook();

            default:
                throw new IllegalArgumentException("Unknown resource type: " + resourceType);
        }
    }
}