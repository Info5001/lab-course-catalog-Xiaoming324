package model;

public class Program {
    String name;
    String nameOfHead;
    CourseCatalog programCourseCatalog;



    public Program(String name, String head) {
        this.name = name;
        this.nameOfHead = head;
        this.programCourseCatalog = new CourseCatalog(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfHead() {
        return nameOfHead;
    }

    public void setNameOfHead(String nameOfHead) {
        this.nameOfHead = nameOfHead;
    }

    public CourseCatalog getCourseCatalog() {
        return programCourseCatalog;
    }

    public void setCourseCatalog(CourseCatalog programCourseCatalog) {
        this.programCourseCatalog = programCourseCatalog;
    }

    public void printProgramDetails(){
        // TODO print program details
    }



}
