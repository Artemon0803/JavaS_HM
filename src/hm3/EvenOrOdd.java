package hm3;

//L3HW #7

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = scanner.nextInt();

        System.out.printf("Number %d is "+((number%2==0) ? "even" : "odd"), number);
    }
}
