/**
 * ArtsScience Sub Class 1
 * Creates constructor and 2 methods - teach and assess
*/
public class StXaviersCollege extends ArtsScienceCollege {
    String specialization;

    /**
     * Constructor which also initializes variables of parent class
     */
    public StXaviersCollege() {
        super("St. Xavier’s College", "Mumbai, Maharashtra");
        this.specialization = "Arts, science, and commerce education";
    }

    /**
     * Function 1 of StrXaviersCollege
     */
    public void teach() {
        System.out.println("Faculty members impart knowledge in various subjects.");
    }

    /**
     * Function 2 of StXaviersCollege
     */
    public void assess() {
        System.out.println("Evaluating student performance through exams and assignments.");
    }
}