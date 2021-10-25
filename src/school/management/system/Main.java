package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*** We perform initialisation operations here for
         *      Student class
         *      Teacher class
         */


        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher victor = new Teacher(3, "Victor", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(victor);

        Student tamasha = new Student(1,"Tamasha",4);
        Student ricky = new Student(2,"Ricky", 12);
        Student morty = new Student(3, "Morty",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(ricky);
        studentList.add(morty);

        School ghs = new School(teacherList, studentList);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned() );







    }
}
