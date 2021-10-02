/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indprojecta;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Trainer {
    private String firstName;
   private String lastName;
   public ArrayList<Trainer> allTrainerList;
 
    public Trainer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Trainer() {
    }

    public ArrayList<Trainer> getAllTrainerList() {
        return allTrainerList;
    }

    public void setAllTrainerList(ArrayList<Trainer> allTrainerList) {
        this.allTrainerList = allTrainerList;
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

    
   
}
