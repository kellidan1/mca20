# Author Name: "Kellidan Fernandes"
# Roll No.: "20"

# Class 1 - University
class University:
    def __init__(self, name, location, affiliation):
        self.name = name
        self.location = location
        self.affiliation = affiliation
    
    def display_info(self):
        print("University Name:", self.name)
        print("Location:", self.location)
        print("Affiliation:", self.affiliation)

# Class 2 - Arts and Science Colleges
class ArtsScienceCollege:
    def __init__(self, name, location):
        self.name = name
        self.location = location
    
    def display_info(self):
        print("College Name:", self.name)
        print("Location:", self.location)

# Class 3 - Institute of National Importance
class InstituteOfNationalImportance:
    def __init__(self, name, location):
        self.name = name
        self.location = location
    
    def display_info(self):
        print("Institute Of National Importance Name:", self.name)
        print("Location:", self.location)

# Class 4 - Business School
class BusinessSchool:
    def __init__(self, name, location):
        self.name = name
        self.location = location
    
    def display_info(self):
        print("Name:", self.name)
        print("Location:", self.location)

# University Sub Class 1
class GoaUniversity(University):
    def __init__(self):
        super().__init__("Goa University", "Goa", "B++")
    
    def programmes_offered(self):
        print("\nProgrammes Offered:")
        print("Ph.D. in Commerce")
        print("MBA (EXECUTIVE)")
        print("M.SC. INTEGRATED (DATA SCIENCE)")
        print("MCA, M.SC. ARTIFICIAL INTELLIGENCE AND M.SC. DATA SCIENCE")
        print("MCA")
        print("M.SC. ARTIFICIAL INTELLIGENCE")
        print("M.SC. DATA SCIENCE")
        print("M.SC. ECONOMICS (INTEGRATED)")
        print("MBA (FINANCIAL SERVICES)")
        print("MBA (INTEGRATED) IN HOSPITALITY AND TOURISM")
        print("MASTER OF BUSINESS ADMINISTRATION (INTEGRATED)")
        print("MBA")
        print("M.SC. MARINE BIOTECHNOLOGY")
    
    def exams_conducted(self):
        print("\nExams Conducted:")
        print("GAT-B")
        print("GU-ART")
        print("GU-CLAT")
        print("GU-CLAT II")
        print("GU-CSAT")
    
    def degrees_granted(self):
        print("\nDegrees Granted:")
        print("Masters degree in Management Studies")
        print("Masters degree in Medicine")
        print("Masters degree in Science")
        print("Masters degree in Social Work")
        print("Masters degree in Arts")
        print("Masters degree in Commerce")
        print("Masters degree in Computer Application")
        print("Masters degree in Engineering")
        print("Masters degree in Fine Arts, Music & Performing Arts")
        print("Masters degree in Law")
        print("Masters degree in Library & Information Science")

# University Sub Class 2
class IITBombay(University):
    def __init__(self):
        super().__init__("IIT Bombay", "Mumbai, Maharashtra", "A++")
    
    def offer_courses(self):
        print("Offering undergraduate and postgraduate programs in engineering, science, and technology.")
    
    def conduct_exams(self):
        print("Administering exams for students.")
    
    def grant_degrees(self):
        print("Awarding degrees upon successful completion of programs.")

# University Sub Class 3
class DelhiUniversity(University):
    def __init__(self):
        super().__init__("Delhi University", "New Delhi", "Central University")
    
    def organize_workshops(self):
        print("Conducting workshops and seminars.")
    
    def evaluate_assignments(self):
        print("Assessing student assignments and projects.")
    
    def provide_facilities(self):
        print("Managing campus facilities for students and staff.")

# ArtsScience Sub Class 1
class StXaviersCollege(ArtsScienceCollege):
    def __init__(self):
        super().__init__("St. Xavier’s College", "Mumbai, Maharashtra")
        self.specialization = "Arts, science, and commerce education"
    
    def teach(self):
        print("Faculty members impart knowledge in various subjects.")
    
    def assess(self):
        print("Evaluating student performance through exams and assignments.")

# Ins of Nat Imp Sub Class 1
class AIIMS(InstituteOfNationalImportance):
    def __init__(self):
        super().__init__("AIIMS Delhi", "New Delhi")
        self.specialization = "Medical education and research"
    
    def medical_training(self):
        print("Training doctors, nurses, and medical professionals.")
    
    def clinical_research(self):
        print("Conducting medical research and clinical trials.")

# Business School Sub Class 1
class IIMAhmedabad(BusinessSchool):
    def __init__(self):
        super().__init__("IIM Ahmedabad", "Ahmedabad, Gujarat")
        self.specialization = "Management education"
    
    def MBA_program(self):
        print("Offering a rigorous MBA program.")
    
    def case_studies(self):
        print("Using case studies for teaching and analysis.")

# Main program
if __name__ == "__main__":
    # Uni sub1
    iit_bombay = IITBombay()
    iit_bombay.display_info()
    iit_bombay.offer_courses()
    iit_bombay.conduct_exams()
    iit_bombay.grant_degrees()
    print()

    # Uni sub2
    delhi_university = DelhiUniversity()
    delhi_university.display_info()
    delhi_university.organize_workshops()
    delhi_university.evaluate_assignments()
    delhi_university.provide_facilities()
    print()

    # Uni sub3
    gu = GoaUniversity()
    gu.display_info()
    gu.degrees_granted()
    gu.exams_conducted()
    gu.programmes_offered()
    print()

    # Institutes of National Importance
    aiims = AIIMS()
    aiims.display_info()
    aiims.medical_training()
    aiims.clinical_research()
    print()

    # Arts and Science Colleges
    st_xaviers = StXaviersCollege()
    st_xaviers.display_info()
    st_xaviers.teach()
    st_xaviers.assess()
    print()

    # Business Schools
    iim_ahmedabad = IIMAhmedabad()
    iim_ahmedabad.display_info()
    iim_ahmedabad.MBA_program()
    iim_ahmedabad.case_studies()
    
    
