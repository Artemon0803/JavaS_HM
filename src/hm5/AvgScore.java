package hm5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AvgScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students;
        int count;

        do {
            System.out.println("Enter number of students: ");
            count=scanner.nextInt();

            if(count>0) break;

            System.out.println("Number of students must be > 0 !");
        } while(true);

        students = new Student[count];

        int i=0;
        do{
            students[i]=new Student();
            System.out.println("Enter grades of student "+(i+1)+"\nTo stop enter 111:");
            int tmp_score;
            do{
                System.out.print("\nEnter grade(0 - 10):");
                tmp_score=scanner.nextInt();
                if(tmp_score<0 || tmp_score>10){
                    if(tmp_score==111) break;
                    System.out.println("Please enter grade in range: 0 - 10");
                    continue;
                }
                students[i].addGrade(tmp_score);
            }while(true);
            i++;
        }while(i<count);

        float groupAvg, sum=0;
        for (Student student : students) {
            sum+=student.getSelfAvg();
        }
        groupAvg=sum/count;
        System.out.println("Average group grade: "+groupAvg);
    }
}
