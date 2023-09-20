/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Quang Hau
 */
public class Fresher_Candidate  extends Candidate{
    private int graduatedTime;
    private String rankOfGraduation;
    private String university;

    public Fresher_Candidate() {
    }

    public Fresher_Candidate(int graduatedTime, String rankOfGraduation, String university, String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.graduatedTime = graduatedTime;
        this.rankOfGraduation = rankOfGraduation;
        this.university = university;
    }

    public int getGraduatedTime() {
        return graduatedTime;
    }

    public void setGraduatedTime(int graduatedTime) {
        this.graduatedTime = graduatedTime;
    }

    public String getRankOfGraduation() {
        return rankOfGraduation;
    }

    public void setRankOfGraduation(String rankOfGraduation) {
        this.rankOfGraduation = rankOfGraduation;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

//    @Override
//    public String toString() {
//        return "Fresher_Candidate{" + super.toString() +"graduatedTime=" + graduatedTime + ", rankOfGraduation=" + rankOfGraduation + ", university=" + university + '}';
//    }
}
