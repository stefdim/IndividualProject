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
public class Assignment {

    private String title;
    private String description;
    private double oralMark;
    private double totalMark;
    private LocalDate subDateTime;
    public ArrayList<Assignment> allAssList;

    public Assignment(String title, String description, LocalDate subDateTime) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
    }

    public Assignment(String title, String description, double oralMark, double totalMark) {
        this.title = title;
        this.description = description;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public Assignment(String title, String description, double totalMark) {
        this.title = title;
        this.description = description;
        this.totalMark = totalMark;
    }

    public Assignment(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Assignment(String title, double totalMark) {
        this.title = title;
        this.totalMark = totalMark;
    }

    public ArrayList<Assignment> getAllAssList() {
        return allAssList;
    }

    public void setAllAssList(ArrayList<Assignment> allAssList) {
        this.allAssList = allAssList;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public Assignment() {
    }

    public Assignment(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
