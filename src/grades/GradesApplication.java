package grades;
import java.util.Scanner;
import java.util.Set;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Student student1 = new Student("Jake");
        HashMap<String, Student> students = new HashMap<>();
        Student student2 = new Student("FreddyFazbore");
        Student student3 = new Student("InsideOutBoy");
        Student student4 = new Student("MiseryBusiness");
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
        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);
        System.out.println(students.keySet());
        System.out.println("Which student would you like information about?");
//        Scanner scanner = new Scanner();
    }
}
