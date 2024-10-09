/**
 * Class 4 - Business School Parent Class -
 * It includes details about the Business School's name and location.
*/
public class BusinessSchool {
    String name;
    String location;
    /**
         * Constructor for InstituteOfNationalImportance.
         *
         * @param name the name of the institute
         * @param location the location of the institute
     */
    public BusinessSchool(String name, String location) {
        this.name = name;
        this.location = location;
    }
    /**
     * Displays Information of the Business School
     */
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }

}
