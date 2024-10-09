/**
 * Class 2 - Arts and Science Colleges Parent Class -
 * It includes details about the Arts and Science Colleges's name and location.
*/
public class ArtsScienceCollege {
    String name;
    String location;
    /**
         * Constructor for InstituteOfNationalImportance.
         *
         * @param name the name of the institute
         * @param location the location of the institute
    */
    public ArtsScienceCollege(String name, String location) {
        this.name = name;
        this.location = location;
    }
    /**
     * Displays the Arts and Science College's Name
     */
    public void displayInfo() {
        System.out.println("College Name: " + name);
        System.out.println("Location: " + location);
    }
}
