/**
 * University Sub Class 2 - IIT Bombay
 * Creates constructor and 3 methods - offercourses, conductexams and grantdegrees
*/

public class IITBombay extends University {
    /**
     * Constructor which also initializes variables of parent class
     */
    public IITBombay() {
        super("IIT Bombay", "Mumbai, Maharashtra", "A++");
    }

    /**
     * Function 1 of IIT Bombay
     */
    public void offerCourses() {
        System.out.println("Offering undergraduate and postgraduate programs in engineering, science, and technology.");
    }

    /**
     * Function 2 of IIT Bombay
     */
    public void conductExams() {
        System.out.println("Administering exams for students.");
    }

    /**
     * Function 3 of IIT Bombay
     */
    public void grantDegrees() {
        System.out.println("Awarding degrees upon successful completion of programs.");
    }
}
