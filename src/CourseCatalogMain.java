import model.CourseCatalog;
import model.Program;
import model.Course;

public class CourseCatalogMain {
  public static void main(String[] args) throws Exception {

    Program msisBridge = new Program("Masters of Information Systems", "Prof. Bugrara");


    CourseCatalog msisBridgeCatalog = msisBridge.getCourseCatalog();

    Course info5001 = msisBridgeCatalog.createNewCourse("Info5001", "Application Modeling and Design", "We learn java here", True)




  }
}
