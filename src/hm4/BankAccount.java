package hm4;

import java.util.Random;

public class BankAccount {
    private int ACCnumber;
    private float balance;

    BankAccount(){
        ACCnumber =(int) (Math.random()*(548999999-548000000+1)+548000000);
        balance=0.00f;
    }

    void addMoney(float sum){
        if(validation(sum)){
            if(balance+sum>1000000000) System.out.println("The balance is full.");
            else balance+=sum;
        }
        balanceInfo();
    }

    void withdraw(float sum){
        if(validation(sum)){
            if(balance-sum>=0.0){
                balance-=sum;
            } else System.out.println("Not enough funds!");
        }
        balanceInfo();
    }

    boolean validation(float sum){
        if(sum<1){
            System.out.println("Enter the correct amount of money(>=1)");
            return false;
        }
        return true;
    }

    void balanceInfo(){
        System.out.println("Account: "+ACCnumber);
        System.out.println("Balance: "+balance);
    }
}
