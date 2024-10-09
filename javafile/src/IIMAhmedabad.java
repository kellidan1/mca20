/**
 * Buisness School Sub Class 1 - IIM Ahmedabad
 * Creates constructor and 2 methods - MBAProgram and CaseStudies
*/
public class IIMAhmedabad extends BusinessSchool {
    String specialization;

    /**
     * Constructor which also initializes variables of parent class
     */
    public IIMAhmedabad() {
        super("IIM Ahmedabad", "Ahmedabad, Gujarat");
        this.specialization = "Management education";
    }

    /**
     * Function 1 of IIM Ahmedabad
     */
    public void MBAProgram() {
        System.out.println("Offering a rigorous MBA program.");
    }

    /**
     * Function 2 of IIM Ahmedabad
     */
    public void caseStudies() {
        System.out.println("Using case studies for teaching and analysis.");
    }
}
