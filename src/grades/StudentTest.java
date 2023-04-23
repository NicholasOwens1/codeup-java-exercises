package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jake");
        Student student2 = new Student("Molly");
        Student student3 = new Student("Detrayvion");
        Student student4 = new Student("Franklin");

//        System.out.println(student1.getName());
        student1.addGrade(82.4F);
        student1.addGrade(23.4F);
        student1.addGrade(99.99F);
        student2.addGrade(78.32F);
        student2.addGrade(98.12F);
        student2.addGrade(91.23F);
        student3.addGrade(70.00F);
        student3.addGrade(110.00F);
        student3.addGrade(100.00F);
        student4.addGrade(70.00F);
        student4.addGrade(80.00F);
        student4.addGrade(90.00F);
        student4.addGrade(100.00F);

        System.out.println(student1.grades);
//        System.out.println(student1.getGradeAverage());
//        student2.addGrade(92.3F);
//        student3.addGrade(100);
//        System.out.println(student3.grades);
    }
}