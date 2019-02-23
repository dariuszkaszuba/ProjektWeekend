package controller;

import model.Course;
import model.Participant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseController {
    List<Course> cours = new ArrayList<>();

    public void addCourse(String name_course, String category, LocalDate term) {
        Course c = new Course(name_course, category, term);
        cours.add(c);
        System.out.println("Dodano kurs: " + c);
    }

    public void showCourse() {
        cours.forEach(course -> System.out.println(course));
    }

    public void addUser(String name_course, String name, String lastname) {
        for (int i = 0; i < cours.size(); i++) {
            if (name_course.equals(cours.get(i).getName_course())) {
                String category=cours.get(i).getCategory();
                LocalDate term=cours.get(i).getTerm();
                Participant p = new Participant(name,lastname);
                Course c = new Course(name_course,category, p,term);
                cours.add(c);
                System.out.println("Dodano uzytkownika: "+name+" "+lastname);
                break;
            }
        }
        System.out.println("Nie dodal");
    }
}
