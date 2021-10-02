package indprojecta;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Course {
private String title;
private String stream;
private String type;
private LocalDate startDate;
private LocalDate endDate;
public ArrayList<Student> studentList;
public ArrayList<Student> studentPerTypeList;
public ArrayList<Trainer> trainerList;
public ArrayList<Assignment> assiList;
public ArrayList<Course> allList;

    public Course() {
    }

    public Course(String title, String stream, String type) {
        this.title = title;
        this.stream = stream;
        this.type = type;
    }

    public ArrayList<Assignment> getAssiList() {
        return assiList;
    }

    public void setAssiList(ArrayList<Assignment> assiList) {
        this.assiList = assiList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(ArrayList<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentPerTypeList() {
        return studentPerTypeList;
    }

    public void setStudentPerTypeList(ArrayList<Student> studentPerTypeList) {
        this.studentPerTypeList = studentPerTypeList;
    }

    public ArrayList<Course> getAllList() {
        return allList;
    }

    public void setAllList(ArrayList<Course> allList) {
        this.allList = allList;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", startDate=" + startDate + ", endDate=" + endDate + ", studentList=" + studentList + ", studentPerTypeList=" + studentPerTypeList + ", trainerList=" + trainerList + ", assiList=" + assiList + ", allList=" + allList + '}';
    }

  




   
}
