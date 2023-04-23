package grades;

import java.util.ArrayList;

public class Student {
    ArrayList<Float> grades;
    private String name;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        }

        public float getGradeAverage() {
        float i = 0;
        for( float grade : grades ) {
            i += grade;
        } return i/grades.size();
        }


    public void addGrade(float grade){
        grades.add(grade);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
