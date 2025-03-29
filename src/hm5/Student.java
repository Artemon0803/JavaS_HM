package hm5;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private float selfAvg;

    void addGrade(int grade){
        grades.add(grade);
    }

    float getSelfAvg(){
        calcSelfAvg();
        return selfAvg;
    }

    void calcSelfAvg(){
        int sum=0;
        for (Integer grade : grades) {
            sum+=grade;
        }
        selfAvg=((float)sum/grades.size());
    }
}
