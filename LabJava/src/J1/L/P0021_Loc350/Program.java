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
public class Program {

    static Scanner sc = new Scanner(System.in);
    static Manager ma = new Manager();

    static void nhapStudent() {

        System.out.println("----nhap thong tin sinh vien----");
        System.out.print("nhap Id ");
        String id = sc.next().trim();
        System.out.print("nhap Name ");
        sc.nextLine();
        String name = sc.nextLine().trim();
        System.out.print("nhap semester ");
        String semester = sc.nextLine().trim();
        System.out.print("nhap courseName ");
        String courseName = sc.nextLine().trim();
        while (!(courseName.equalsIgnoreCase("Java") || courseName.equalsIgnoreCase(".Net")
                || courseName.equalsIgnoreCase("C/C++"))) {
            System.out.println("Just Enter Java or .Net or C/C++");
            courseName = sc.nextLine().trim();
        }

        Student student = new Student(id, name, semester, courseName);
        ma.addStudent(student);

    }

    static class SortByName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getStudentName().compareTo(o2.getStudentName());
        }
    }

    static void timStudent() {
        ArrayList<Student> array = new ArrayList<Student>();

        System.out.println("nhap student Name:");
        sc.nextLine();
        String name = sc.nextLine().trim();

        array = ma.FindStudentByName(name);
        Collections.sort(array, new SortByName());
        if (array.size() == 0) {
            System.out.println("Khong co ten trong list");
        }
        for (Student s : array) {
            System.out.println(s);
        }

    }

    static void sortStudent() {
        if (ma.list.size() == 0) {
            System.out.println("Chua nhap thong tin Student");
        }
        Collections.sort(ma.list, new SortByName());
        for (Student s : ma.list) {
            System.out.println(s);
        }
    }

    static Student timById() {
        System.out.println("Find Student By Id");
        sc.nextLine();
        System.out.println("nhap id:");
        String id = sc.nextLine().trim();

        Student s = ma.findStudentById(id);
        if (s == null) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println(s);
            return s;
        }
        return null;
    }


    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n(J1.L.P0021_Loc350) WELCOME TO STUDENT MANAGEMENT\n");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.print("choose function:");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    do {
                        nhapStudent();
                    } while (ma.list.size() < 3);
                    String choose;
                    do {
                        System.out.println("Do you want to continue(Y/N)");
                        choose = sc.nextLine().trim();
                        while (!(choose.equalsIgnoreCase("y") || choose.equalsIgnoreCase("n"))) {
                            System.out.println("Just enter Y/N:");
                            choose = sc.nextLine().trim();
                        }
                        if (choose.equalsIgnoreCase("y")) {
                            nhapStudent();
                        }

                    } while (choose.equalsIgnoreCase("y"));

                    break;
                }
                case 2: {
                    System.out.print("Find or Sort(enter F/S):");
                    String chon = sc.next().trim();
                    
                    while(!(chon.equalsIgnoreCase("f")||chon.equalsIgnoreCase("s"))){
                        System.out.println("Just enter F/S");
                        chon = sc.next().trim();
                    }
                        
                    if (chon.equalsIgnoreCase("f")) {
                        timStudent();
                    } else {
                        sortStudent();
                    }
                    break;
                }
                case 3: {
                    Student result = timById();
                    
                    if (result != null) {
                        System.out.println("Do you want to update(U) or delete(D) student:");
                        String choose = sc.nextLine().trim();
                        
                        if (choose.equalsIgnoreCase("U")) {
                            ma.update(result);
                        } else {
                            ma.xoa(result);
                            System.out.println("Da xoa student nay.");
                        }
                        
                    }
                    
                    break;
                }
                case 4:
                    break;

            }
        } while (choice >= 1 && choice <= 4);

    }
}
