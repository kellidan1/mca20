#include <iostream>
#include <string>
#include <vector>

using namespace std;

// Class 1 - University
class University {
protected:
    string name;
    string location;
    string affiliation;

public:
    University(string name, string location, string affiliation)
        : name(name), location(location), affiliation(affiliation) {}

    void displayInfo() {
        cout << "University Name: " << name << endl;
        cout << "Location: " << location << endl;
        cout << "Affiliation: " << affiliation << endl;
    }
};

// Class 2 - Arts and Science Colleges
class ArtsScienceCollege {
protected:
    string name;
    string location;

public:
    ArtsScienceCollege(string name, string location)
        : name(name), location(location) {}

    void displayInfo() {
        cout << "College Name: " << name << endl;
        cout << "Location: " << location << endl;
    }
};

// Class 3 - Institute of National Importance
class InstituteOfNationalImportance {
protected:
    string name;
    string location;

public:
    InstituteOfNationalImportance(string name, string location)
        : name(name), location(location) {}

    void displayInfo() {
        cout << "Institute Of National Importance Name: " << name << endl;
        cout << "Location: " << location << endl;
    }
};

// Class 4 - Business School
class BusinessSchool {
protected:
    string name;
    string location;

public:
    BusinessSchool(string name, string location)
        : name(name), location(location) {}

    void displayInfo() {
        cout << "Name: " << name << endl;
        cout << "Location: " << location << endl;
    }
};

// University Sub Class 1
class GoaUniversity : public University {
public:
    GoaUniversity()
        : University("Goa University", "Goa", "B++") {}

    void programmesOffered() {
        cout << "\nProgrammes Offered:" << endl;
        cout << "Ph.D. in Commerce" << endl;
        cout << "MBA (EXECUTIVE)" << endl;
        cout << "M.SC. INTEGRATED (DATA SCIENCE)" << endl;
        cout << "MCA, M.SC. ARTIFICIAL INTELLIGENCE AND M.SC. DATA SCIENCE" << endl;
        cout << "MCA" << endl;
        cout << "M.SC. ARTIFICIAL INTELLIGENCE" << endl;
        cout << "M.SC. DATA SCIENCE" << endl;
        cout << "M.SC. ECONOMICS (INTEGRATED)" << endl;
        cout << "MBA (FINANCIAL SERVICES)" << endl;
        cout << "MBA (INTEGRATED) IN HOSPITALITY AND TOURISM" << endl;
        cout << "MASTER OF BUSINESS ADMINISTRATION (INTEGRATED)" << endl;
        cout << "MBA" << endl;
        cout << "M.SC. MARINE BIOTECHNOLOGY" << endl;
    }

    void examsConducted() {
        cout << "\nExams Conducted:" << endl;
        cout << "GAT-B" << endl;
        cout << "GU-ART" << endl;
        cout << "GU-CLAT" << endl;
        cout << "GU-CLAT II" << endl;
        cout << "GU-CSAT" << endl;
    }

    void degreesGranted() {
        cout << "\nDegrees Granted:" << endl;
        cout << "Masters degree in Management Studies" << endl;
        cout << "Masters degree in Medicine" << endl;
        cout << "Masters degree in Science" << endl;
        cout << "Masters degree in Social Work" << endl;
        cout << "Masters degree in Arts" << endl;
        cout << "Masters degree in Commerce" << endl;
        cout << "Masters degree in Computer Application" << endl;
        cout << "Masters degree in Engineering" << endl;
        cout << "Masters degree in Fine Arts, Music & Performing Arts" << endl;
        cout << "Masters degree in Law" << endl;
        cout << "Masters degree in Library & Information Science" << endl;
    }
};

// University Sub Class 2
class IITBombay : public University {
public:
    IITBombay()
        : University("IIT Bombay", "Mumbai, Maharashtra", "A++") {}

    void offerCourses() {
        cout << "Offering undergraduate and postgraduate programs in engineering, science, and technology." << endl;
    }

    void conductExams() {
        cout << "Administering exams for students." << endl;
    }

    void grantDegrees() {
        cout << "Awarding degrees upon successful completion of programs." << endl;
    }
};

// University Sub Class 3
class DelhiUniversity : public University {
public:
    DelhiUniversity()
        : University("Delhi University", "New Delhi", "Central University") {}

    void organizeWorkshops() {
        cout << "Conducting workshops and seminars." << endl;
    }

    void evaluateAssignments() {
        cout << "Assessing student assignments and projects." << endl;
    }

    void provideFacilities() {
        cout << "Managing campus facilities for students and staff." << endl;
    }
};

// ArtsScience Sub Class 1
class StXaviersCollege : public ArtsScienceCollege {
public:
    StXaviersCollege()
        : ArtsScienceCollege("St. Xavier's College", "Mumbai, Maharashtra") {}

    void teach() {
        cout << "Faculty members impart knowledge in various subjects." << endl;
    }

    void assess() {
        cout << "Evaluating student performance through exams and assignments." << endl;
    }
};

// Ins of Nat Imp Sub Class 1
class AIIMS : public InstituteOfNationalImportance {
public:
    AIIMS()
        : InstituteOfNationalImportance("AIIMS Delhi", "New Delhi") {}

    void medicalTraining() {
        cout << "Training doctors, nurses, and medical professionals." << endl;
    }

    void clinicalResearch() {
        cout << "Conducting medical research and clinical trials." << endl;
    }
};

// Business School Sub Class 1
class IIMAhmedabad : public BusinessSchool {
public:
    IIMAhmedabad()
        : BusinessSchool("IIM Ahmedabad", "Ahmedabad, Gujarat") {}

    void MBAProgram() {
        cout << "Offering a rigorous MBA program." << endl;
    }

    void caseStudies() {
        cout << "Using case studies for teaching and analysis." << endl;
    }
};

int main() {
    // Uni sub1
    IITBombay iitBombay;
    iitBombay.displayInfo();
    iitBombay.offerCourses();
    iitBombay.conductExams();
    iitBombay.grantDegrees();
    cout << endl;

    // Uni sub2
    DelhiUniversity delhiUniversity;
    delhiUniversity.displayInfo();
    delhiUniversity.organizeWorkshops();
    delhiUniversity.evaluateAssignments();
    delhiUniversity.provideFacilities();
    cout << endl;

    // Uni sub3
    GoaUniversity gu;
    gu.displayInfo();
    gu.degreesGranted();
    gu.examsConducted();
    gu.programmesOffered();
    cout << endl;

    // Institutes of National Importance
    AIIMS aiims;
    aiims.displayInfo();
    aiims.medicalTraining();
    aiims.clinicalResearch();
    cout << endl;

    // Arts and Science Colleges
    StXaviersCollege stXaviers;
    stXaviers.displayInfo();
    stXaviers.teach();
    stXaviers.assess();
    cout << endl;

    // Business Schools
    IIMAhmedabad iimAhmedabad;
    iimAhmedabad.displayInfo();
    iimAhmedabad.MBAProgram();
    iimAhmedabad.caseStudies();

    return 0;
}
