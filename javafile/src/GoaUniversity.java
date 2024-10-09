/**
 * University Sub Class 1 - Goa Uni
 * Creates constructor and 3 methods - programmesoffered, examsconducted and degreesgranted
*/
public class GoaUniversity extends University {
    /**
     * Constructor which also initializes variables of parent class
     */
    public GoaUniversity() {
        super("Goa University", "Goa", "B++");
    }
    
    /**
     * Function 1 of Goa Uni
     */
    public  void programmesOffered() {
        System.out.println("\nProgrammes Offered:");
        System.out.println("Ph.D. in Commerce");
        System.out.println("MBA (EXECUTIVE)");
        System.out.println("M.SC. INTEGRATED (DATA SCIENCE)");
        System.out.println("MCA, M.SC. ARTIFICIAL INTELLIGENCE AND M.SC. DATA SCIENCE");
        System.out.println("MCA");
        System.out.println("M.SC. ARTIFICIAL INTELLIGENCE");
        System.out.println("M.SC. DATA SCIENCE");
        System.out.println("M.SC. ECONOMICS (INTEGRATED)");
        System.out.println("MBA (FINANCIAL SERVICES)");
        System.out.println("MBA (INTEGRATED) IN HOSPITALITY AND TOURISM");
        System.out.println("MASTER OF BUSINESS ADMINISTRATION (INTEGRATED)");
        System.out.println("MBA");
        System.out.println("M.SC. MARINE BIOTECHNOLOGY");
    }

    /**
     * Function 2 of Goa Uni
     */
    public  void examsconducted() {
        System.out.println("\nExams Conducted:");
        System.out.println("GAT-B");
        System.out.println("GU-ART");
        System.out.println("GU-CLAT");
        System.out.println("GU-CLAT II");
        System.out.println("GU-CSAT"); 
    }

    /**
     *Function 3 of Goa Uni\
    */
    public  void degreesgranted() {
        System.out.println("\nDegrees Granted:");
        System.out.println("Masters degree in Management Studies");
        System.out.println("Masters degree in Medicine");
        System.out.println("Masters degree in Science");
        System.out.println("Masters degree in Social Work");
        System.out.println("Masters degree in Arts");
        System.out.println("Masters degree in Commerce");
        System.out.println("Masters degree in Computer Application");
        System.out.println("Masters degree in Engineering");
        System.out.println("Masters degree in Fine Arts, Music & Performing Arts");
        System.out.println("Masters degree in Law");
        System.out.println("Masters degree in Library & Information Science");
    }
}
