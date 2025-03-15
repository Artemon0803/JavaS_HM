package hm3;

//L3HW #5

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double int1, int2, sum, avg;

        System.out.print("Enter first number: ");
        int1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        int2 = scanner.nextDouble();

        sum = int1+int2;
        avg=(sum)/2;

        System.out.printf("Сумма чисел %f и %f = %f", int1, int2, sum);
        System.out.printf("\nСреднее значение чисел %f и %f = %f", int1, int2, avg);
        System.out.printf("\nЧисло %f"+((int1==int2) ? " = " : (int1>int2) ? " > " : " < ")+"%f", int1, int2);
    }
}
