package hm5;

import java.util.Scanner;

public class Discount {
    final static int SUM_FOR_TEN_DISCOUNT = 1000;
    final static int SUM_FOR_TWENTY_DISCOUNT = 10000;
    static double discount(double sum){
        if(sum>SUM_FOR_TWENTY_DISCOUNT) return sum*0.2;
        else return sum*0.1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=0;
        int count=1;

        System.out.println("Start enter prices\nTo stop enter 'q': ");
        do{
            String inp;
            System.out.println("Price of item "+count+": ");
            inp=scanner.next();
            if(inp.charAt(0)=='q'){
                if(sum>SUM_FOR_TEN_DISCOUNT){
                    System.out.printf("Congratulations! You’ve saved %f $", discount(sum));
                    break;
                } else {
                    System.out.printf("Spend %f $ more to get the discount. Do you want to continue?\n(Y or N)", SUM_FOR_TEN_DISCOUNT-sum);
                    if(scanner.next().charAt(0)=='N') break;
                    else continue;
                }
            }
            sum+=Double.valueOf(inp);
            count++;
        }while(true);
    }
}
