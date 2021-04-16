/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruricmanagement;

import javax.swing.JOptionPane;

/**
 *
 * @author VENOM
 */
public class Student {

    private String name = "";
    private String regNo = "";

  /**
   * 
   * @param name
   * @return 
   */
    public boolean setName(String name) {
        boolean flag = false;
        if (name.length() >= 4 && name.length() <= 25) {
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' || name.charAt(i) >= 'a' && name.charAt(i) <= 'z' || name.charAt(i) == ' ') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) {
            this.name = name;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Student Name.....");
        }
        return flag;

    }

    /**
     * 
     * @param regNo
     * @return 
     */
    public boolean setRegNo(String regNo) {
        boolean flag = false;
        if (regNo.length() >= 9 && regNo.length() <= 11) {
            if (regNo.charAt(0) == '2' && regNo.charAt(1) == '0' && regNo.charAt(2) >= '0' && regNo.charAt(2) <= '9' && regNo.charAt(3) >= '0' && regNo.charAt(1) <= '9') {
                if (regNo.charAt(4) == '-' && regNo.charAt(5) == 'C' && regNo.charAt(6) == 'S' && regNo.charAt(7) == '-') {
                    for (int i = 8; i < regNo.length(); i++) {
                        if (regNo.charAt(i) >= '0' && regNo.charAt(i) <= '9') {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }
        }
        if (flag == true) {
            this.regNo = regNo;
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Students' Regidtration Number.....");
        }
        return flag;
    }
   

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getRegNo() {
        return regNo;
    }

}
