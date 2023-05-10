package grades;

import java.util.ArrayList;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    private ArrayList<Integer> grades = new ArrayList<>();

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public Student(){
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }
    public float getGradeAverage() {
        float i = 0;
        for (float grade : grades) {
            i += grade;
        }
        return i / grades.size();
    }
}