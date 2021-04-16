/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruricmanagement;

import javax.swing.*;

/**
 *
 * @author VENOM
 */
public class Rubric {
    private String rubricName;
    private double rubricLevel;
    private double obtRuricLevel;

    public String getRubricName() {
        return rubricName;
    }

    public double getRubricLevel() {
        return rubricLevel;
    }

    public double getObtRuricLevel() {
        return obtRuricLevel;
    }

    public boolean setRubricName(String rubricName) {
        boolean flag=false;
       if(rubricName.length()>=3&&rubricName.length()<=15){
       for(int i=0;i<rubricName.length();i++){
       if(rubricName.charAt(i)>='A'&&rubricName.charAt(i)<='Z'||rubricName.charAt(i)>='a'&&rubricName.charAt(i)<='z'||rubricName.charAt(i)==' '){
       flag=true;
       }
       else{
       flag=false;
       break;
       }
       }
       }
       if(flag==true)
        this.rubricName = rubricName;
       else{
       JOptionPane.showMessageDialog(null, "Invalid Rubric Name.....");
       }
       return flag;
    }

    public void setRubricLevel(double rubricLevel) {
        this.rubricLevel = rubricLevel;
    }

    public void setObtRuricLevel(double obtRuricLevel) {
        this.obtRuricLevel = obtRuricLevel;
    }
    
    
}
