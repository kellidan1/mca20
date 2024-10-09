/**
 * Ins of Nat Imp Sub Class 1 Child Class - AIIMS
 * Creates constructor and 2 methods - medicalTraining and clinicalReseach
*/
public class AIIMS extends InstituteOfNationalImportance {
    String specialization;
    /**
     * Constructor which also initializes variables of parent class
     */
    public AIIMS() {
        super("AIIMS Delhi", "New Delhi");
        this.specialization = "Medical education and research";
    }
    /**
     * Function 1 of AIIMS
     */
    public void medicalTraining() {
        System.out.println("Training doctors, nurses, and medical professionals.");
    }
    /**
     * Function 2 of AIIMS
     */
    public void clinicalResearch() {
        System.out.println("Conducting medical research and clinical trials.");
    }
}

