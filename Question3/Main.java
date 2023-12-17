package Question3;
import java.util.Scanner;
 class Account {
     Scanner scan = new Scanner(System.in);
     private double Balance;

     public Account() {
         Balance = 0;
     }

     public Account(double initialbalance) {
         Balance = initialbalance;
     }

     public void deposit() {
         System.out.println("DEPOSIT:");
         double deposit = scan.nextDouble();
         Balance = Balance+deposit;
     }

     public void withdraw() {
         System.out.println("WITHDRAW:");
         double withdraw = scan.nextDouble();

         if (withdraw > 0) {
             if (withdraw < Balance) {
                 Balance = (Balance - withdraw);
             } else {
                 System.out.println("In sufficient ");
             }
         }
     }



     public void displayBalance(){
         System.out.println("BALANCE:");
         System.out.println(Balance);
     }

 }
public class Main {
    public static void main(String[] args) {
        Account account1=new Account();
        Account account2=new Account(3300);
        account1.deposit();
        account1.displayBalance();
        account1.withdraw();
        account1.displayBalance();

        /////////////////////////////
        account2.deposit();
        account2.displayBalance();
        account2.withdraw();
        account2.displayBalance();
    }

    }







