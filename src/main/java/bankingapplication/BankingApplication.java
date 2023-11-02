package bankingapplication;
import java.util.Scanner;
public class BankingApplication {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345","susan");
        bankAccount.ShowMenu();


    }
}
    class BankAccount {

        int balance=0;
        int previousTransaction;
        String CustomerName;
        String CustomerId;

        BankAccount(String CID, String CName) {
            CustomerName = CName;
            CustomerId = CID;
        }

        void withdraw(int amount2) {
           /* if(amount2<balance){
                System.out.println("You do not have enough cash to withdraw  " + amount2);
            }
            else{
                balance= balance-amount2;
                System.out.println("balance is "+ balance);
            }
        }
            if (amount != 0) {

                balance = balance - amount;
                previousTransaction = -amount;

            }*/

        }

        void deposit (int amount) {
          /* if (amount != 0) {
                balance = balance + amount;
                previousTransaction = amount;
            }*/

        }

        public void getPreviousTransaction() {
            if (previousTransaction < 0) {
                System.out.println("deposited" + previousTransaction);

            } else if (previousTransaction > 0) {
                System.out.println("withdrawn: " + Math.abs(previousTransaction));

            } else {
                System.out.println("No transaction occured");

            }

        }

        void ShowMenu() {
            char option = '\0';
            Scanner myScanner = new Scanner(System.in);
            System.out.println("welcome " + CustomerName);
            System.out.println("your ID Number is : " + CustomerId);
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B : Deposit");
            System.out.println("C: Withdrawal");
            System.out.println("D: Previous transaction");
            System.out.println("E: Exit");


            do {
                System.out.println("----------------------------------");
                System.out.println("Enter an option");
                System.out.println("------------------------------------");
                option = myScanner.next().charAt(0);
                System.out.println("\n");
                switch (option) {
                    case 'A':
                        System.out.println("-----------------------");
                        System.out.println("balance = " + balance);
                        System.out.println("-----------------------");
                        break;
                    case 'B':
                        System.out.println("------------------");
                        System.out.println("Enter an amount to deposit");
                        int amount = myScanner.nextInt();

                        System.out.println("Amount = " + amount);
                         balance=0;
                        balance=balance+amount;
                        System.out.println("balance is " + balance);


                        System.out.println("-----------------------");
                        break;

                    case 'C':
                        System.out.println("-----------------");
                        System.out.println("Enter an amount to withdraw");
                        int amount2 = myScanner.nextInt();
                        System.out.println("withdraw Amount= " + amount2);
                        balance=balance;
                        if(amount2>balance){
                            System.out.println("You do not have enough cash to withdraw " + amount2);

                        }
                        else {
                            balance=balance-amount2;
                            System.out.println("Your balance is " + balance);
                        }

                        System.out.println("---------------------------");
                        break;
                    case 'D':
                        System.out.println("---------------");
                        getPreviousTransaction();
                        System.out.println("----------------");
                        break;
                    case 'E':
                        System.out.println("--------------");
                    default:
                        System.out.println("invalid choice! please try again");

                        break;
                }
            } while (option != 'E');
            System.out.println("Thank you for your services");
        }

    }




