/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Validation;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Quang Hau
 */
public class InternCandidateManagement {
    private ArrayList<Candidate> list;
    
    public InternCandidateManagement() {
      list = new ArrayList<>();
    }

    public ArrayList<Candidate> getList() {
        return list;
    }

    public void setList(ArrayList<Candidate> list) {
        this.list = list;
    }

    public int getSize() {
        return list.size();
    }

    
    public boolean add(){
        
        try {
            Validation val = new Validation();
            Intern_Candidate interC = new Intern_Candidate();
            new Candidate().createCandidate((Candidate)interC, list);
            
            interC.setType(2);
            interC.setMajor(val.getString("Enter major: "));
            interC.setSemester(val.getString("Enter semester: "));
            interC.setUniversity(val.getString("Enter univeristy: ")); 
            
            list.add((Candidate)interC);
            
        } catch (Exception e) {
            return false;
        }
        
        
        return true;
    }
    
    public void nameDisplay(){
        System.out.println("===========Intern CANDIDATE============");
        for (Candidate candidate : list) {
            System.out.println(candidate.getFirstName()+" "+candidate.getLastName());
        }
    }
    
    public void display(int from, int to){
         System.out.println("===========Intern CANDIDATE============");
         if(!list.isEmpty() && from >=0 && to > 0){
              for(int i = from; i < to; i++){
                  System.out.println((Intern_Candidate)list.get(i));
              }
         }
    }
    
     public void searchByName(){
         Validation val = new Validation();
         String name = val.getString("Enter searched Name: ");
         new Candidate().search(list, name);
     }
    
}
