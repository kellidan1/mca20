using System;

// Class 1 - University
class University
{
    protected string name;
    protected string location;
    protected string affiliation;

    public University(string name, string location, string affiliation)
    {
        this.name = name;
        this.location = location;
        this.affiliation = affiliation;
    }

    public void DisplayInfo()
    {
        Console.WriteLine("University Name: " + name);
        Console.WriteLine("Location: " + location);
        Console.WriteLine("Affiliation: " + affiliation);
    }
}

// Class 2 - Arts and Science Colleges
class ArtsScienceCollege
{
    protected string name;
    protected string location;

    public ArtsScienceCollege(string name, string location)
    {
        this.name = name;
        this.location = location;
    }

    public void DisplayInfo()
    {
        Console.WriteLine("College Name: " + name);
        Console.WriteLine("Location: " + location);
    }
}

// Class 3 - Institute of National Importance
class InstituteOfNationalImportance
{
    protected string name;
    protected string location;

    public InstituteOfNationalImportance(string name, string location)
    {
        this.name = name;
        this.location = location;
    }

    public void DisplayInfo()
    {
        Console.WriteLine("Institute Of National Importance Name: " + name);
        Console.WriteLine("Location: " + location);
    }
}

// Class 4 - Business School
class BusinessSchool
{
    protected string name;
    protected string location;

    public BusinessSchool(string name, string location)
    {
        this.name = name;
        this.location = location;
    }

    public void DisplayInfo()
    {
        Console.WriteLine("Name: " + name);
        Console.WriteLine("Location: " + location);
    }
}

// University Sub Class 1
class GoaUniversity : University
{
    public GoaUniversity()
        : base("Goa University", "Goa", "B++")
    {
    }

    public void ProgrammesOffered()
    {
        Console.WriteLine("\nProgrammes Offered:");
        Console.WriteLine("Ph.D. in Commerce");
        Console.WriteLine("MBA (EXECUTIVE)");
        Console.WriteLine("M.SC. INTEGRATED (DATA SCIENCE)");
        Console.WriteLine("MCA, M.SC. ARTIFICIAL INTELLIGENCE AND M.SC. DATA SCIENCE");
        Console.WriteLine("MCA");
        Console.WriteLine("M.SC. ARTIFICIAL INTELLIGENCE");
        Console.WriteLine("M.SC. DATA SCIENCE");
        Console.WriteLine("M.SC. ECONOMICS (INTEGRATED)");
        Console.WriteLine("MBA (FINANCIAL SERVICES)");
        Console.WriteLine("MBA (INTEGRATED) IN HOSPITALITY AND TOURISM");
        Console.WriteLine("MASTER OF BUSINESS ADMINISTRATION (INTEGRATED)");
        Console.WriteLine("MBA");
        Console.WriteLine("M.SC. MARINE BIOTECHNOLOGY");
    }

    public void ExamsConducted()
    {
        Console.WriteLine("\nExams Conducted:");
        Console.WriteLine("GAT-B");
        Console.WriteLine("GU-ART");
        Console.WriteLine("GU-CLAT");
        Console.WriteLine("GU-CLAT II");
        Console.WriteLine("GU-CSAT");
    }

    public void DegreesGranted()
    {
        Console.WriteLine("\nDegrees Granted:");
        Console.WriteLine("Masters degree in Management Studies");
        Console.WriteLine("Masters degree in Medicine");
        Console.WriteLine("Masters degree in Science");
        Console.WriteLine("Masters degree in Social Work");
        Console.WriteLine("Masters degree in Arts");
        Console.WriteLine("Masters degree in Commerce");
        Console.WriteLine("Masters degree in Computer Application");
        Console.WriteLine("Masters degree in Engineering");
        Console.WriteLine("Masters degree in Fine Arts, Music & Performing Arts");
        Console.WriteLine("Masters degree in Law");
        Console.WriteLine("Masters degree in Library & Information Science");
    }
}

// University Sub Class 2
class IITBombay : University
{
    public IITBombay()
        : base("IIT Bombay", "Mumbai, Maharashtra", "A++")
    {
    }

    public void OfferCourses()
    {
        Console.WriteLine("Offering undergraduate and postgraduate programs in engineering, science, and technology.");
    }

    public void ConductExams()
    {
        Console.WriteLine("Administering exams for students.");
    }

    public void GrantDegrees()
    {
        Console.WriteLine("Awarding degrees upon successful completion of programs.");
    }
}

// University Sub Class 3
class DelhiUniversity : University
{
    public DelhiUniversity()
        : base("Delhi University", "New Delhi", "Central University")
    {
    }

    public void OrganizeWorkshops()
    {
        Console.WriteLine("Conducting workshops and seminars.");
    }

    public void EvaluateAssignments()
    {
        Console.WriteLine("Assessing student assignments and projects.");
    }

    public void ProvideFacilities()
    {
        Console.WriteLine("Managing campus facilities for students and staff.");
    }
}

// ArtsScience Sub Class 1
class StXaviersCollege : ArtsScienceCollege
{
    public StXaviersCollege()
        : base("St. Xavier’s College", "Mumbai, Maharashtra")
    {
    }

    public void Teach()
    {
        Console.WriteLine("Faculty members impart knowledge in various subjects.");
    }

    public void Assess()
    {
        Console.WriteLine("Evaluating student performance through exams and assignments.");
    }
}

// Ins of Nat Imp Sub Class 1
class AIIMS : InstituteOfNationalImportance
{
    public AIIMS()
        : base("AIIMS Delhi", "New Delhi")
    {
    }

    public void MedicalTraining()
    {
        Console.WriteLine("Training doctors, nurses, and medical professionals.");
    }

    public void ClinicalResearch()
    {
        Console.WriteLine("Conducting medical research and clinical trials.");
    }
}

// Business School Sub Class 1
class IIMAhmedabad : BusinessSchool
{
    public IIMAhmedabad()
        : base("IIM Ahmedabad", "Ahmedabad, Gujarat")
    {
    }

    public void MBAProgram()
    {
        Console.WriteLine("Offering a rigorous MBA program.");
    }

    public void CaseStudies()
    {
        Console.WriteLine("Using case studies for teaching and analysis.");
    }
}

class Program
{
    static void Main()
    {
        // Uni sub1
        IITBombay iitBombay = new IITBombay();
        iitBombay.DisplayInfo();
        iitBombay.OfferCourses();
        iitBombay.ConductExams();
        iitBombay.GrantDegrees();
        Console.WriteLine();

        // Uni sub2
        DelhiUniversity delhiUniversity = new DelhiUniversity();
        delhiUniversity.DisplayInfo();
        delhiUniversity.OrganizeWorkshops();
        delhiUniversity.EvaluateAssignments();
        delhiUniversity.ProvideFacilities();
        Console.WriteLine();

        // Uni sub3
        GoaUniversity gu = new GoaUniversity();
        gu.DisplayInfo();
        gu.DegreesGranted();
        gu.ExamsConducted();
        gu.ProgrammesOffered();
        Console.WriteLine();

        // Institutes of National Importance
        AIIMS aiims = new AIIMS();
        aiims.DisplayInfo();
        aiims.MedicalTraining();
        aiims.ClinicalResearch();
        Console.WriteLine();

        // Arts and Science Colleges
        StXaviersCollege stXaviers = new StXaviersCollege();
        stXaviers.DisplayInfo();
        stXaviers.Teach();
        stXaviers.Assess();
        Console.WriteLine();

        // Business Schools
        IIMAhmedabad iimAhmedabad = new IIMAhmedabad();
        iimAhmedabad.DisplayInfo();
        iimAhmedabad.MBAProgram();
        iimAhmedabad.CaseStudies();

    }
}
