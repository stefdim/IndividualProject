/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indprojecta;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Student extends Course {

    private String firstName;
    private String lastName;
    private int tuitionFees;
    private LocalDate dateOfBirth;
    public ArrayList<Assignment> asPerStudList;
    public ArrayList<Student> allStudList;

    public Student() {
    }

    public Student(String firstName, String lastName, int tuitionFees, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tuitionFees = tuitionFees;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public ArrayList<Student> getAllStudList() {
        return allStudList;
    }

    public void setAllStudList(ArrayList<Student> allStudList) {
        this.allStudList = allStudList;
    }

    public ArrayList<Assignment> getAsPerStudList() {
        return asPerStudList;
    }

    public void setAsPerStudList(ArrayList<Assignment> asPerStudList) {
        this.asPerStudList = asPerStudList;
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

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
