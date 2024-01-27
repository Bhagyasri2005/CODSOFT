package bhagya;
import java.util.Scanner;

public class ATM {

    private static Scanner currency = new Scanner(System.in);
    private static double balance = 10000; 
    public static void main(String[] args) 
    {
    	int AccountNumber = 0;
        if (true) {
            System.out.println("Please Insert your account number:");
            AccountNumber = currency.nextInt();

            if (AccountNumber == 0) {
                System.out.println("Account number is Invalid! Retry.");
              
            }

            System.out.println("Please Provide your PIN:");
            int pin = currency.nextInt();

            if (pin == 0) {
                System.out.println("Your PIN is Invalid. Retry.");
               
            }
            System.out.println("Greetings! Feel at ease as you use our ATM!");
           
        }
        while (true) {
            showMenu();
            int choice = getUserInput();

            switch (choice) {
                case 1:
                    NetBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void showMenu() {
        System.out.println("\nApproaches:");
        System.out.println("1. Display The Remaining Balance");
        System.out.println("2. Deposit The Money");
        System.out.println("3. Withdrawl Of Money");
        System.out.println("4. Exit The Atm");
    }

    private static int getUserInput() {
        System.out.print("Please Pick your choice: ");
        return currency.nextInt();
    }

    private static void NetBalance() {
        System.out.println("Your Netbalance in the account: $" + balance);
    }

    private static void deposit() {
        System.out.print("Enter the amount you want to  deposit: $");
        double amount = currency.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("your amount is Deposited successfully. Your Current  Netbalance in the account is : $" + balance);
        } else {
            System.out.println("Your amount can't be deposited.");
        }
    }

    private static void withdraw() {
        System.out.print("Enter the amount of withdrawal: $");
        double amount = currency.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of amount is completed.  Your Current  Netbalance in the account is: $" + balance);
        } else {
            System.out.println("Your amount can't be withdrawed or insufficient money.");
        }
    }
    private static void exit() {
        System.out.println("Your banking is our pleasure!\n");
        System.out.println("We thank you for choosing our ATM services!");
        System.exit(0);
     }
        
}
    
    
    

