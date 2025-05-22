package hm5;

import java.util.Scanner;

public class Pension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MIN_AGE = 0;
        final int MAX_AGE = 120;
        final int MALE_PENSION_AGE = 70;
        final int FEMALE_PENSION_AGE = 65;
        int age;
        char gender;

        do {
            System.out.println("Enter your gender(M or F): ");
            gender = Character.toUpperCase(scanner.next().charAt(0));

            if (gender == 'M' || gender == 'F') break;

            System.out.println("Please enter one of the following options (M or F)!");
        } while(true);

        do {
            System.out.println("Enter your age(0 - 120): ");
            age = scanner.nextInt();

            if(age>=MIN_AGE && age<=MAX_AGE) break;

            System.out.println("Please enter one of the following options [0 - 120]!");
        } while(true);

        if(gender=='M')
            System.out.println("Years "+((age<MALE_PENSION_AGE) ? "to" : "after")+" retirement: "+((age<MALE_PENSION_AGE) ? MALE_PENSION_AGE-age : age-MALE_PENSION_AGE));
        else
            System.out.println("Years "+((age<FEMALE_PENSION_AGE) ? "to" : "after")+" retirement: "+((age<FEMALE_PENSION_AGE) ? FEMALE_PENSION_AGE-age : age-FEMALE_PENSION_AGE));
    }
}
