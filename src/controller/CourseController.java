package controller;

import model.Course;
import model.Participant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseController {
    List<Course> cours = new ArrayList<>();

    public void addCourse(String name_course, String category, LocalDate term) {
        String nc = name_course.toUpperCase();
        Course c = new Course(nc, category, term);
        cours.add(c);
        System.out.println("Dodano kurs: " + c);
    }

    public void showCourse() {
        cours.forEach(course -> System.out.println(course));
    }

    public int countOfCourse(String name_course) {
        int counter = 0;
        for (int i = 0; i < cours.size(); i++) {
            if ((name_course.equals(cours.get(i).getName_course()))) {
                counter++;
            }
        }
        return counter;
    }

    public void chooseDate(String name_course, LocalDate term) {
        for (int i = 0; i < cours.size(); i++) {
            if ((name_course.equals(cours.get(i).getName_course())) && term.equals(cours.get(i).getTerm())) {
                cours.get(i).setName_course(name_course);
                cours.get(i).setTerm(term);
            }
        }
    }

    public void chooseDate(String name_course) {
        boolean[] list = new boolean[cours.size()];
        for (int i = 0; i < cours.size(); i++) {
            if ((name_course.equals(cours.get(i).getName_course()))) {
//                System.out.println("Podany kurs jest w terminach: " + cours.get(i).getTerm());
                System.out.println((i + 1) + ". Wybierz kurs: " + cours.get(i).getTerm());
                list[i] = true;
//                Scanner sc= new Scanner(System.in);
//                int decision= sc.nextInt();
//                switch (decision){
//                        case 1:
//                            cours.contains(cours.get(i).getTerm());
//                            break;
//                }
            }
        }
//        return list;
//        Scanner sc= new Scanner(System.in);
//        int decision = -1;
//        switch (decision) {
//            case 1:
//
//                break;
//            case 2:
//                cours.get(2).getName_course();
//                break;
//            case 3:
//                cours.get(3).getName_course();
//                break;
//            case 4:
//                cours.get(4).getName_course();
//                break;
//        }
    }

    public boolean addUser(String name_course, String name, String lastname, String term) {
        String name_courseToUpper = name_course.toUpperCase();
        LocalDate ld = LocalDate.parse(term);
        for (int i = 0; i < cours.size(); i++) {
            if ((name_courseToUpper.equals(cours.get(i).getName_course())) && ld.equals(cours.get(i).getTerm())) {
//                if ( cours.) {
//                    Participant p = new Participant(name, lastname);
//                    cours.get(i).setListOfParticipiant(p);
//                }
                cours.get(i).setName_course(name_courseToUpper);
                cours.get(i).setTerm(ld);
                Participant p = new Participant(name, lastname);
                cours.get(i).getListOfParticipiant().add(p);
                System.out.println("Dodano uzytkownika: " + name + " " + lastname);
                return true;
            }
        }
        System.out.println("Nie ma kursu: " + name_courseToUpper + " w podanym teriminie " + ". Nie dodano uzytkownika: " + name + " " + lastname);
        return false;
    }

    public boolean deleteUser(String name_course, String name, String lastname) {
        String name_courseToUppercase = name_course.toUpperCase();
        Participant p = new Participant(name, lastname);

        for (int i = 0; i < cours.size(); i++) {
            if (name_courseToUppercase.equals(cours.get(i).getName_course())&&
//                    cours.get(i).getListOfParticipiant().contains(name) && cours.get(i).getListOfParticipiant().contains(lastname)) {
                name.equals((cours.get(i).getListOfParticipiant().get(0)))&& lastname.equals((cours.get(i).getListOfParticipiant().get(0))) ){
//                if(name_courseToUppercase.equals(cours.get(i).getName_course())&&name.equals(cours.get(i).getListOfParticipiant().getName())&&
//                        lastname.equals(cours.get(i).getListOfParticipiant().getLastname())){
//            if(name_course.equals(cours.get(i).getName_course())&&p.equals(cours.get(i).getListOfParticipiant())){
                System.out.println(name + " " + lastname + " zostal usuniety z kursu " + cours.get(i).getName_course());
                cours.get(i).getListOfParticipiant().remove(i);
                return true;
            }
        }
        System.out.println(name + " " + lastname + " NIE zostal usuniety z kursu ");
        return false;
    }
}
