package model;

import java.util.ArrayList;

public class CourseCatalog {
  private Program program;
  private ArrayList<Course> courseList;

  public CourseCatalog(Program p) {
    this.program = p;
    courseList = new ArrayList<Course>();
  }

  public Course createNewCourse(String id, String name, String description, boolean isRequired,
      int creditHours) {
    Course newCourse = new Course(id, name, description, program, isRequired, creditHours);
    courseList.add(newCourse);
    return newCourse;
  }



  public void printCourseCatalog() {
    System.out.println("Course Catalog for " + year);
    System.out.println("-----------------");
    for (Course everyCourse : courseList) {
      everyCourse.printCourseInfo();
      System.out.println("-----------------");
    }
  }
  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }
}
