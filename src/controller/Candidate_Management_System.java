/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.BorderLayout;
import model.ExpCandidateManagement;
import model.FresherCandidateManagement;
import model.InternCandidateManagement;
import view.Menu;

/**
 *
 * @author Nguyen Quang Hau
 */
public class Candidate_Management_System extends Menu<String> {

    private static String title = "CANDIDATE MANAGEMENT SYSTEM";
    private static String options[] = {"Experience", "Fresher", "Internship", "Searching"};
    private ExpCandidateManagement exList;
    private FresherCandidateManagement freList;
    private InternCandidateManagement intList;

    public Candidate_Management_System() {
        super(title, options);
        exList = new ExpCandidateManagement();
        freList = new FresherCandidateManagement();
        intList = new InternCandidateManagement();
    }

    @Override
    public void excute(int n) {
        String choice = "";
        int startingSize = 0;
        switch (n) {
            case 1:
                startingSize = exList.getSize();
                do {
                    exList.add();
                    choice = val.getString("Do you want to continue (Y/N): ", "Y|N|y|n");
                } while (choice.equalsIgnoreCase("y"));
                exList.display(startingSize, exList.getSize());
                break;
            case 2:
                startingSize = freList.getSize();

                do {
                    freList.add();
                    choice = val.getString("Do you want to continue (Y/N): ", "Y|N|y|n");
                } while (choice.equalsIgnoreCase("y"));

                freList.display(startingSize, freList.getSize());
                break;

            case 3:
                startingSize = intList.getSize();

                do {
                    intList.add();
                    choice = val.getString("Do you want to continue (Y/N): ", "Y|N|y|n");
                } while (choice.equalsIgnoreCase("y"));

                intList.display(startingSize, intList.getSize());
                break;

            case 4:
                System.out.println("List of candidate: \n");
                exList.nameDisplay();
                freList.nameDisplay();
                intList.nameDisplay();

                int type = val.getIntData("-------Type------\n0. Experience.\n1. Fresher.\n2. Intern. \nEnter your selection: ", 0, 2);

                switch (type) {
                    case 0:
                        exList.searchByName();
                        break;
                    case 1:
                        freList.searchByName();
                        break;
                    default:
                        intList.searchByName();
                        break;
                }

                break;

            default:
                throw new AssertionError();
        }
    }

}
