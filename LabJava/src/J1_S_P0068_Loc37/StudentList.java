/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1_S_P0068_Loc37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author PC
 */
public class StudentList {

    ArrayList<Student> ar = new ArrayList<>();

    public void addStudent(Student s) {
        ar.add(s);
    }

    class sortName implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public void show() {
        int count = 0;
        Collections.sort(ar, new sortName());
        for (int i = 0; i < ar.size(); i++) {
            count += 1;
            System.out.println("----------------Student " + count + "-------------------");
            System.out.println(ar.get(i));
        }
       
    }

}
