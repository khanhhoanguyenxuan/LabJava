/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1_S_P0068_Loc37;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    static StudentList list = new StudentList();

    static void nhapStudent() {
        Scanner sc = new Scanner(System.in);
        String choose;
        System.out.println("(Loc37)=======Collection Sort Program===========");
        do {

            System.out.println("Please input student information");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Classes: ");
            String classes = sc.nextLine();
            System.out.print("Mark:");
            float mark = sc.nextFloat();
            sc.nextLine();
            Student student = new Student(name, mark, classes);
            list.addStudent(student);
            System.out.println("Do you want to enter more student information?(Y/N): ");
            choose = sc.nextLine();

        } while (choose.equalsIgnoreCase("Y"));

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        nhapStudent();
        list.show();
    }
}
