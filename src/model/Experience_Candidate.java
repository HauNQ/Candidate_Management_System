/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Quang Hau
 */
public class Experience_Candidate extends Candidate{
    private int ExplnYear;
    private String proSkill;

    public Experience_Candidate() {
    }

    public Experience_Candidate(int ExplnYear, String proSkill, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.ExplnYear = ExplnYear;
        this.proSkill = proSkill;
    }

    public int getExplnYear() {
        return ExplnYear;
    }

    public void setExplnYear(int ExplnYear) {
        this.ExplnYear = ExplnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return  super.toString() + " | "+ExplnYear + " | "+proSkill;
    }
    
    
}
