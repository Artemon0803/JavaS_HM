package hm4;

public class Bank {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        BankAccount user3 = new BankAccount();

        user1.balanceInfo();
        user1.addMoney(5000);

        user2.addMoney(60000);
        user2.withdraw(62000);
        user2.withdraw(15000);
        user2.addMoney(1000);

        user3.addMoney(5000);
        user3.withdraw(-300);
        user3.addMoney(-500);
    }
}
