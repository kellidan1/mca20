/**
 * Class 1 - University Parent Class -
 * It includes details about the university's name, location, and ranking.
*/

public class University {
    String name;
    String location;
    String affiliation;

    /**
         * Constructor for InstituteOfNationalImportance.
         *
         * @param name the name of the university
         * @param location the location of the university
         * @param affiliation the rank of the university
    */
    public University(String name, String location, String affiliation) {
        this.name = name;
        this.location = location;
        this.affiliation = affiliation;
    }

    /**
     * Displays the University's name
     */
    public  void displayInfo(){
        System.out.println("University Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Affliation: " + affiliation);
    }
}
