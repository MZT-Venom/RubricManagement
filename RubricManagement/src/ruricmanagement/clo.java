/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruricmanagement;
import java.util.*;
/**
 *
 * @author VENOM
 */
public class clo {
    private List<Rubric>rubricList=new ArrayList<>();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Rubric> getRubricList() {
        return rubricList;
    }

    public void setRubricList(Rubric r) {
        this.rubricList.add(r);
    }
      public void addRubric(Rubric r){
     this.rubricList.add(r);
     }
    
}
