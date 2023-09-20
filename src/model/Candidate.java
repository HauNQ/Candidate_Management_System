/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import common.Validation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Quang Hau
 */
public class Candidate {

    protected String id;
    protected String firstName;
    protected String lastName;
    protected int birthDate;
    protected String address;
    protected String phone;
    protected String email;
    protected int type;

    public Candidate() {
    }

    public Candidate(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    protected Candidate createCandidate(ArrayList<Candidate> list) {
        Validation val = new Validation();
        Candidate newCandidate = null;

        String newId = null;
        do {
            newId = val.getString("Enter id: ");
        } while (val.idIsExisting(list, newId));

        String newFirstName = val.getString("Enter first name: ");
        String newLastName = val.getString("Enter last name: ");
        int newBirthDate = val.getIntData("Enter birth year:", 1900, 2023);
        String newAddress = val.getString("Enter address: ");
        String newPhone = val.getString("Enter the phone number", "[0-9]{10,}");
        String newEmail = val.getString("Enter an email: ", "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        int newType = val.getIntData("-------Type------\n0. Experience.\n1. Fresher.\n2. Intern. \nEnter your selection: ", 0, 2);

        newCandidate = new Candidate(newId, newFirstName, newLastName, newBirthDate, newAddress, newPhone, newEmail, newType);

        return newCandidate;
    }

    protected void search(ArrayList<Candidate> list, String name) {
        for (Candidate candidate : list) {
            if (candidate.getFirstName().contains(name) || candidate.getLastName().contains(name)) {
                System.out.println(candidate);
            }
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | " + birthDate + " | " + address + " | " + phone + " | " + email;
    }

}
