package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name_course;
    private String category;
    private int countOfParticipiant;
    private LocalDate term;
    private String trainer;

    private List<Participant> listOfParticipiant= new ArrayList<>();


    public List<Participant> getListOfParticipiant() {
        return listOfParticipiant;
    }

    public void setListOfParticipiant(String name, String lastname) {
        this.listOfParticipiant = listOfParticipiant;
    }

//    public void getParticipiant(){
////        listOfParticipiant.getName();
////        listOfParticipiant.getLastname();
//        listOfParticipiant.toString();
//    }


    public Course(String name_course, String category, List listOfParticipiant, LocalDate term) {
        this.name_course = name_course;
        this.category = category;
        this.listOfParticipiant = listOfParticipiant;
        this.term = term;
    }

    @Override
    public String toString() {
        return String.format("%15s | %15s | %15d | %20s | %10s | %10s", name_course, category, countOfParticipiant, listOfParticipiant,
        term,trainer);
    }

    public String getName_course() {
        return name_course;
    }

    public void setName_course(String name_course) {
        this.name_course = name_course;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCountOfParticipiant() {
        return countOfParticipiant;
    }

    public void setCountOfParticipiant(int countOfParticipiant) {
        this.countOfParticipiant = countOfParticipiant;
    }



    public LocalDate getTerm() {
        return term;
    }

    public void setTerm(LocalDate term) {
        this.term = term;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public Course() {
    }

    public Course(String name_course, String category, LocalDate term) {
        this.name_course = name_course;
        this.category = category;
        this.term = term;
    }

    public Course(String name_course, String category, int countOfParticipiant, List listOfParticipiant, LocalDate term, String trainer) {
        this.name_course = name_course;
        this.category = category;
        this.countOfParticipiant = countOfParticipiant;
        this.listOfParticipiant = listOfParticipiant;
        this.term = term;
        this.trainer = trainer;
    }
}
