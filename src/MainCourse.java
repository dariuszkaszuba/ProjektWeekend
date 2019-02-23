import controller.CourseController;

import java.time.LocalDate;

public class MainCourse {
    public static void main(String[] args) {
        CourseController cc= new CourseController();
        cc.addCourse("Java","Programowanie", LocalDate.of(2019,04,05));
        cc.addCourse("C#","Programowanie", LocalDate.of(2018,07,05));
        cc.addCourse("C++","Programowanie", LocalDate.of(2017,07,05));
        cc.addUser("Java","Janusz","Kowalski");
        cc.showCourse();
    }
}
