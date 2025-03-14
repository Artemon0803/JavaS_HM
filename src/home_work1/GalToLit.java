package home_work1;

//Task 1.1 from page 46

import hm2.LogicOpTableV2;

import java.io.IOException;
import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        double gallons, liters;

        System.out.println("Enter volume in gallons: ");
        gallons=scanner.nextDouble();

        liters=gallons*3.7854;

        System.out.println(gallons+" gallons = "+liters+" liters ");
    }
}
