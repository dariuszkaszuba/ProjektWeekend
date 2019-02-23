package model;

import java.time.LocalDate;

public class Course {
    private String name_course;
    private String category;
    private int countOfParticipiant;
    private Participant listOfParticipiant;
    private LocalDate term;
    private String trainer;

    public void getParticipiant(){
//        listOfParticipiant.getName();
//        listOfParticipiant.getLastname();
        listOfParticipiant.toString();
    }

    public Course(String name_course, String category, Participant listOfParticipiant, LocalDate term) {
        this.name_course = name_course;
        this.category = category;
        this.listOfParticipiant = listOfParticipiant;
        this.term = term;
    }

    @Override
    public String toString() {
        return String.format("%10s | %10s | %10d | %20s | %10s | %10s", name_course, category, countOfParticipiant, listOfParticipiant,
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

    public Participant getListOfParticipiant() {
        return listOfParticipiant;
    }

    public void setListOfParticipiant(Participant listOfParticipiant) {
        this.listOfParticipiant = listOfParticipiant;
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

    public Course(String name_course, String category, int countOfParticipiant, Participant listOfParticipiant, LocalDate term, String trainer) {
        this.name_course = name_course;
        this.category = category;
        this.countOfParticipiant = countOfParticipiant;
        this.listOfParticipiant = listOfParticipiant;
        this.term = term;
        this.trainer = trainer;
    }
}
