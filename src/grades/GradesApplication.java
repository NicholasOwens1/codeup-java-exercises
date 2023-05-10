package grades;
import java.sql.SQLOutput;
import java.util.*;

public class GradesApplication {
    // Create a method that outputs student info
    public static void outputStudentInfo(String userInput, HashMap<String, Student> students){
//        if the input matches one of the keys in the students HashMap, assign a Student object to the value attached to the key that matches the input.
        if (students.containsKey(userInput)){
            Student student = students.get(userInput);
            System.out.printf("Name: %s, Username: %s%n, GPA: %.1f%n", student.getName(), userInput, student.getGradeAverage());
        } else {
            System.out.println("No user with that username was found.");
        }
    }
    public static void seeAnotherUser(String response) {
        System.out.println("Would you like to see another student?");
    }

    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();
        Student Jake = new Student("JakeKicks");
        Student Mikey = new Student("FreddyFazbore");
        Student Elizabeth = new Student("InsideOutBoy");
        Student Alejandro = new Student("MiseryBusiness");
        students.put("FreddyFazbore", Mikey);
        students.put("JakeKicks", Jake);
        students.put("InsideOutBoy", Elizabeth);
        students.put("MiseryBusiness", Alejandro);
        Jake.addGrade(82);
        Jake.addGrade(23);
        Jake.addGrade(99);
        Mikey.addGrade(78);
        Mikey.addGrade(98);
        Mikey.addGrade(91);
        Elizabeth.addGrade(70);
        Elizabeth.addGrade(110);
        Elizabeth.addGrade(100);
        Alejandro.addGrade(70);
        Alejandro.addGrade(80);
        Alejandro.addGrade(90);
        Alejandro.addGrade(100);

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        Set<String> userNames = students.keySet();
        System.out.println(userNames);
        System.out.println("Which student would you like information about? Enter one of the usernames above.");
        String userInput = scanner.nextLine();
        outputStudentInfo(userInput, students);
        while (true){
            System.out.println("Would you like to see another student? (yes/no)");
            String userChoice = scanner.nextLine().toLowerCase();
            if (userChoice.equals("no") || userChoice.equals("n")){
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            } else {
                System.out.println("What student would you like to see  more information on?");
                System.out.println(userNames);
                System.out.println("");
                userInput = scanner.nextLine();
                outputStudentInfo(userInput, students);
            }
//        Scanner scanner = new Scanner(System.in);
//        Set<String> userNames = students.keySet();
//        System.out.println(userNames);
//        System.out.println("Which student would you like information about? Enter one of the usernames above.");
//        String input = scanner.nextLine();
//        if (Objects.equals(input, Jake.getName()) || Objects.equals(input, Elizabeth.getName()) ||
//                Objects.equals(input, Alejandro.getName()) || Objects.equals(input, Mikey.getName()))
//        {
        }


    }
}
