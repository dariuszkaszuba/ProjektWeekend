import controller.CourseController;

import java.time.LocalDate;
import java.util.Scanner;

public class MainCourse {
    public static void main(String[] args) {
        CourseController cc = new CourseController();

        Scanner sc = new Scanner(System.in);
        int decision = -1;
        while (decision != 0) {
            System.out.println("1. Dodaj kurs \n2. Pokaż dostępne szkolenia \n3. Dodaj użytkownika \n4. Usuń użytkownika \n5. Wyjscie");
            decision = sc.nextInt();
            sc.nextLine();
            switch (decision) {
                case 1:
                    System.out.println("Podaj nazwe kursu");
                    String name_course = sc.nextLine();
                    System.out.println("Podaj kategorie kursu");
                    String category = sc.nextLine();
                    System.out.println("Podaj date kursu (YYYY-MM-DD");
                    String date = sc.nextLine();
                    ;
                    LocalDate ld = LocalDate.parse(date);
                    cc.addCourse(name_course, category, ld);
                    break;
                case 2:
                    cc.showCourse();
                    break;
                case 3:
                    System.out.println("Podaj nazwe kursu");
                    String name_course2 = sc.nextLine();
                    System.out.println("Podaj imię");
                    String name = sc.nextLine();
                    System.out.println("Podaj nazwisko");
                    String lastname = sc.nextLine();
                    System.out.println("Podaj date kursu (YYYY-MM-DD");
                    String date2 = sc.nextLine();
                    cc.addUser(name_course2, name, lastname, date2);
                    break;
                case 4:
                    System.out.println("Podaj nazwe kursu");
                    String name_course3 = sc.nextLine();
                    System.out.println("Podaj imię");
                    String name2 = sc.nextLine();
                    System.out.println("Podaj nazwisko");
                    String lastname2 = sc.nextLine();
                    cc.deleteUser(name_course3, name2, lastname2);
                case 0:
                    break;
                default:
                    break;
            }

//        cc.addCourse("CCCC","Programowanie", LocalDate.of(2019,04,23));
//        cc.addCourse("C#","Programowanie", LocalDate.of(2018,07,05));
//        cc.addCourse("Java","Programowanie", LocalDate.of(2017,04,23));
//        cc.addCourse("C++","Programowanie", LocalDate.of(2017,07,05));
//        cc.addUser("JaVa","Janusz","Kowalski","2017-04-23");
//        cc.addUser("JAVA","Jan","Kowalski","2019-08-23");
//        cc.showCourse();
//        cc.deleteUser("Java","Janusz","Kowalski");
//        cc.showCourse();
        }
    }
}
