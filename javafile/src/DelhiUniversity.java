/**
 * University Sub Class 3 - Delhi Uni
 * Creates constructor and 3 methods - organizeworkshops, evaluateasignements and providefacilities
*/
public class DelhiUniversity extends University {
    /**
     * Constructor which also initializes variables of parent class
     */
    public DelhiUniversity() {
        super("Delhi University", "New Delhi", "Central University");
    }

    /**
     * Function 1 of Delhi Uni
     */
    public void organizeWorkshops() {
        System.out.println("Conducting workshops and seminars.");
    }

    /**
     * Function 2 of Delhi Uni
     */
    public void evaluateAssignments() {
        System.out.println("Assessing student assignments and projects.");
    }

    /**
     * Function 3 of Delhi Uni
     */
    public void provideFacilities() {
        System.out.println("Managing campus facilities for students and staff.");
    }
}
