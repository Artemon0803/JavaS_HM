package hm3;

//L3HW #6

import java.util.Scanner;

public class LangChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] hello = {
                "Hello world!",
                "Привет мир!",
                "Hallo Welt!",
                "Bonjour tout le monde!"
        };
        int choice;

        System.out.println("Languages: ");
        System.out.println("1. En");
        System.out.println("2. Ru");
        System.out.println("3. De");
        System.out.println("4. Fr");

        System.out.print("\nSelect a language: ");
        choice = scanner.nextInt();

        if(choice>=1 & choice<=4) System.out.println(hello[choice-1]);
        else System.out.println("\nThere is no such option.");
    }
}
