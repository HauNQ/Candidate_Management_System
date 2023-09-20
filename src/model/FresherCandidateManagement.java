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
public class FresherCandidateManagement {
    private ArrayList<Candidate> list;

    public FresherCandidateManagement() {
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
            Candidate c = new Candidate();
            c = c.createCandidate(list);
            Fresher_Candidate fresherC = new Fresher_Candidate();
            fresherC.setId(c.getId());
            fresherC.setFirstName(c.getFirstName());
            fresherC.setLastName(c.getLastName());
            fresherC.setAddress(c.getAddress());
            fresherC.setBirthDate(c.getBirthDate());
            fresherC.setType(c.getType());
            fresherC.setEmail(c.getEmail());
            fresherC.setPhone(c.getPhone());
            fresherC.setGraduatedTime(val.getIntData("Enter graduated time: ", 1900, 2023));
            fresherC.setUniversity(val.getString("Enter univeristy: "));
            
            int  intRank = val.getIntData("-----Rank-----\n1. Excellence\n2. Good\n3. Fair\n4. Poor\nEnter rank: ", 1, 4);
            String rank = "";
            
            if(intRank == 1) rank = "Excellence";
            else if(intRank == 2) rank = "Good";
            else if(intRank == 3) rank = "Fair";
            else rank = "Poor";
            
            fresherC.setRankOfGraduation(rank);
            
            list.add((Candidate)fresherC);
            
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }
     
     
     public void nameDisplay(){
        System.out.println("===========Fresher CANDIDATE============");
        for (Candidate candidate : list) {
            System.out.println(candidate.getFirstName()+" "+candidate.getLastName());
        }
    }
     
   
    public void display(int from, int to){
         System.out.println("===========Fresher CANDIDATE============");
         if(!list.isEmpty() && from >=0 && to > 0){
              for(int i = from; i < to; i++){
                  System.out.println(list.get(i));
              }
         }
    }
    
     public void searchByName(){
         Validation val = new Validation();
         String name = val.getString("Enter searched Name: ");
         new Candidate().search(list, name);
     }
    
    
}
