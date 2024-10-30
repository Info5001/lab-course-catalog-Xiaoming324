import model.CourseCatalog;
import model.Program;
import model.Course;

public class CourseCatalogMain {
  public static void main(String[] args) throws Exception {

    Program msisBridge = new Program("Masters of Information Systems", "Prof. Bugrara");

    CourseCatalog msisBridgeCatalog = msisBridge.getCourseCatalog();

    // Program whichProgramIsThis = msisBridgeCatalog.getProgram(); // ←----this is the same msisBridge program (CourseCatalog relates to program)

    Course info5001 = msisBridgeCatalog.createNewCourse("Info5001", "Application Modeling & Design", "We learn java basics and modeling here", true, 4);

    // Program whichProgramIsThis = info5001.getProgram(); // ←----this is the same msisBridge program (Course relates to program)

    // msisBridgeCatalog.deleteCourse(info5001);
    // msisBridgeCatalog.deleteCourse("Info5001");

    Course info5002 = msisBridgeCatalog.createNewCourse("Info5002", "Introduction to Python", "We learn python basics", true, 4);

    Course info6150 = msisBridgeCatalog.createNewCourse("Info6150", "Web Design and Engineering", "Introduction to front end", false, 4);

    Course info6250 = msisBridgeCatalog.createNewCourse("Info6250", "Enterprise Web", "How to build web back end", false, 4);

    msisBridgeCatalog.deleteCourse("Info6150");
  
    msisBridge.printProgramDetails();



  }
}
