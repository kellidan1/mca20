/**
 * Class 3 - Institute of National Importance Parent Class
 * It includes details about the institutes's name and location.
*/

public class InstituteOfNationalImportance {
    String name;
    String location;

    /**
        * Constructor for InstituteOfNationalImportance.
        *
        * @param name the name of the institute
        * @param location the location of the institute
    */
    public InstituteOfNationalImportance(String name, String location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Method to display the Institute's name and location
     */
    public void displayInfo() {
        System.out.println("Institute Of National Importance Name: " + name);
        System.out.println("Location: " + location);
    }
}
