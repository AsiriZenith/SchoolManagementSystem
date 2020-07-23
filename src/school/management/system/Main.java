package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1,"lizzy",3000);
        Teacher teacher2 = new Teacher(2,"Mellisa",6000);
        Teacher teacher3 = new Teacher(3,"vanderhorn",5500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);

        Student student1 = new Student(1,"tamasha",4);
        Student student2 = new Student(2,"rakshith", 12);
        Student student3 = new Student(3,"rabbi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        School AnandaCollage = new School(studentList,teacherList);

        student1.payFees(5000);

        System.out.println("Ananda Collage earned: "+AnandaCollage.getTotelMoneyEarned());

        student2.payFees(2000);

        System.out.println("Ananda Collage earned: "+AnandaCollage.getTotelMoneyEarned());

        student3.payFees(4000);

        System.out.println("Ananda Collage earned: "+AnandaCollage.getTotelMoneyEarned());

        System.out.println("----Making School pay Salary----");

        teacher1.receivedSalary(teacher1.getSalary());

        System.out.println("School has spent for pay salary :"+teacher1.getName() +
                " and now has "+ AnandaCollage.getTotelMoneyEarned());

        teacher3.receivedSalary(teacher3.getSalary());

        System.out.println("School has spent for pay salary :"+teacher3.getName() +
                " and now has "+ AnandaCollage.getTotelMoneyEarned());

        System.out.println(student2);

        System.out.println(teacher3);
    }
}
