package hm3;

//L3HW #8

import java.util.Scanner;

public class NumMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, counter=0;

        System.out.println("Enter any number: ");
        number = scanner.nextInt();
        for(int i=(int)Math.sqrt(number);i>1;i--){
            if(number%i==0){
                counter++;
                if(counter==1) System.out.printf("%d is a product of:\n", number);
                int a, b;
                a=number/i;
                b=i;
                System.out.printf("%d and %d\n", a, b);
            }
        }
        if(counter==0) System.out.printf("The number %d has no multipliers, so it is a prime number. A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers.", number);
    }
}
