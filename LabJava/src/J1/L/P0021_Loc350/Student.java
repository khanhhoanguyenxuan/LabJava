/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.L.P0021_Loc350;

/**
 *
 * @author PC
 */
public class Student {

    private String Id;
    private String studentName;
    private String semester;
    private String courseName;

    public Student(String Id, String studentName, String semester, String courseName) {
        this.Id = Id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Id: " + Id + "\nName: " + studentName + "\n" + "Semester: " + semester + "\n" + "Course: " + courseName + "\n ";

    }
}
