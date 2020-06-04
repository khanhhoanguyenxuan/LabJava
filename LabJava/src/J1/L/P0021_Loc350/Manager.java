/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.L.P0021_Loc350;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Manager {

    ArrayList<Student> list = new ArrayList<>();

    public void addStudent(Student student) {
        list.add(student);
    }

    public ArrayList FindStudentByName(String name) {
        ArrayList<Student> ar = new ArrayList<Student>();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getStudentName().contains(name)
                    || list.get(i).getStudentName().equalsIgnoreCase(name)) {
                ar.add(list.get(i));
            }
        }

        return ar;
    }

    public Student findStudentById(String id) {
        for (Student s : list) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }

    public void xoa(Student s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s)) {
                list.remove(list.get(i));
            }
        }
    }

    public void update(Student s) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s)) {
                System.out.println("Update Student:");
                System.out.println("nhap ID can update:");
                String id = sc.nextLine().trim();
                System.out.println("nhap Student Name:");
                String name = sc.nextLine().trim();
                System.out.println("nhap semester:");
                String semester = sc.nextLine().trim();
                System.out.print("nhap courseName ");
                String courseName = sc.nextLine().trim();
                while (!(courseName.equalsIgnoreCase("Java") || courseName.equalsIgnoreCase(".Net")
                        || courseName.equalsIgnoreCase("C/C++"))) {
                    System.out.println("Just Enter Java or .Net or C/C++");
                    courseName = sc.nextLine().trim();
                }
                list.get(i).setCourseName(courseName);
                list.get(i).setId(id);
                list.get(i).setSemester(semester);
                list.get(i).setStudentName(name);
            }
        }

    }
}
