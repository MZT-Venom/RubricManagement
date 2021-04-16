/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruricmanagement;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author VENOM
 */
public class Result {

    public static List<Student> studentList = new ArrayList<>();
    public static clo []arr=new clo[3];

    /**
     * 
     * @param s 
     */
    public void addStudent(Student s) {
        studentList.add(s);
    }

    /**
     * 
     * @param regNo 
     */
    public void delStudent(String regNo) {
        int i = 0;
        for (i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getRegNo().equals(regNo)) {
                studentList.remove(i);
                break;
            }
        }
        if (i == studentList.size()) {
            JOptionPane.showMessageDialog(null, "Student NOt Found!!!!!");
        }

    }
    
     public List<Student> searchStd(String name){
         List<Student>list=new ArrayList<>();
     for(int i=0;i<studentList.size();i++){
     if(studentList.get(i).getName().contains(name)){
     list.add(studentList.get(i));
     }
     }
     return list;
     }
    
}
