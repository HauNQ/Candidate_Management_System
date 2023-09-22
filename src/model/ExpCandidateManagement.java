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
public class ExpCandidateManagement {

    private ArrayList<Candidate> list;

    public ExpCandidateManagement() {
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

    public boolean add() {
        try {
            Experience_Candidate exC = new Experience_Candidate();
            new Candidate().createCandidate((Candidate) exC,list);
            Validation val = new Validation();
            exC.setType(0);
            exC.setExplnYear(val.getIntData("Enter year of experience: ", 0, 100));
            exC.setProSkill(val.getString("Enter profesional skills: "));

            list.add((Candidate) exC);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public void nameDisplay() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate candidate : list) {
            System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
        }
    }

    public void display(int from, int to) {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        if (!list.isEmpty() && from >= 0 && to > 0) {
            for (int i = from; i < to; i++) {
                System.out.println((Experience_Candidate)list.get(i));
            }
        }
    }

    public void searchByName() {
        Validation val = new Validation();
        String name = val.getString("Enter searched Name: ");
        new Candidate().search(list, name);
    }
}
