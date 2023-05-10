package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jake");
        Student student2 = new Student("Molly");
        Student student3 = new Student("Detrayvion");
        Student student4 = new Student("Franklin");
        student1.addGrade(82);
        student1.addGrade(23);
        student1.addGrade(99);
        student2.addGrade(78);
        student2.addGrade(98);
        student2.addGrade(91);
        student3.addGrade(70);
        student3.addGrade(110);
        student3.addGrade(100);
        student4.addGrade(70);
        student4.addGrade(80);
        student4.addGrade(90);
        student4.addGrade(100);
        System.out.println(student2.getGradeAverage());
        student2.addGrade(92);
        System.out.println(student2.getGradeAverage());
    }
}