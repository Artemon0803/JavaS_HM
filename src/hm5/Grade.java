package hm5;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;

        do {
            System.out.println("Enter your score: ");
            score=scanner.nextInt();

            if(getGrade(score)=='e') {
                System.out.println("Invalid score! Must be: 0 - 100");
            } else {
                System.out.println("Your grade is: "+getGrade(score));
                break;
            }
        } while(true);
    }

    private static char getGrade(int score){
        if(score>100) return 'e';
        else if(score>=90) return 'A';
        else if(score>=80) return 'B';
        else if(score>=70) return 'C';
        else if(score>=60) return 'D';
        else if(score<60 & score>=0) return 'F';
        return 'e';
    }
}
