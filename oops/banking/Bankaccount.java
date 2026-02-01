
package OOPS.banking;

import java.util.*;

// Parent class - Base Bank Account
class BankAccountBase {
    int account_no;
    String Holder_name;
    double balance;

    // Constructor with all parameters
    BankAccountBase(int account_no, String Holder_name, double balance) {
        this.account_no = account_no;
        this.Holder_name = Holder_name;
        this.balance = balance;
    }

    // Deposit method
    public void deposite(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Display account info
    public void displayInfo() {
        System.out.println("Account No: " + account_no);
        System.out.println("Holder Name: " + Holder_name);
        System.out.println("Balance: " + balance);
    }
}

// Child class - Saving Account
class SavingAccount extends BankAccountBase {
    double interestRate = 4.0; // 4% interest rate for savings

    public SavingAccount(int accountNumber, String Holder_name, double balance) {
        super(accountNumber, Holder_name, balance);
    }

    // Additional method for savings account - calculate interest
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance = balance + interest;
        System.out.println("Interest added: " + interest);
        System.out.println("New Balance: " + balance);
    }
}

// Child class - Current Account
class CurrentAccount extends BankAccountBase {
    double overdraftLimit = 5000; // Overdraft facility for current account

    public CurrentAccount(int accountNumber, String Holder_name, double balance) {
        super(accountNumber, Holder_name, balance);
    }

    // Override withdraw to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > (balance + overdraftLimit)) {
            System.out.println("Exceeds overdraft limit! Cannot withdraw.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

// Main class to run the program
public class Bankaccount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= BANKING SYSTEM =======");
        System.out.println("Enter 1 for Saving Account");
        System.out.println("Enter 2 for Current Account");
        int choice = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        if (choice == 1) {
            // Saving Account
            SavingAccount SA = new SavingAccount(accNo, name, initialBalance);
            System.out.println("\n--- Saving Account Created ---");

            boolean running = true;
            while (running) {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Add Interest");
                System.out.println("5. Display Info");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int c = sc.nextInt();

                switch (c) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmt = sc.nextDouble();
                        SA.deposite(depositAmt);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmt = sc.nextDouble();
                        SA.withdraw(withdrawAmt);
                        break;
                    case 3:
                        SA.checkBalance();
                        break;
                    case 4:
                        SA.addInterest();
                        break;
                    case 5:
                        SA.displayInfo();
                        break;
                    case 6:
                        running = false;
                        System.out.println("Thank you for using Banking System!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } else if (choice == 2) {
            // Current Account
            CurrentAccount CA = new CurrentAccount(accNo, name, initialBalance);
            System.out.println("\n--- Current Account Created ---");

            boolean running = true;
            while (running) {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Display Info");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int c = sc.nextInt();

                switch (c) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmt = sc.nextDouble();
                        CA.deposite(depositAmt);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmt = sc.nextDouble();
                        CA.withdraw(withdrawAmt);
                        break;
                    case 3:
                        CA.checkBalance();
                        break;
                    case 4:
                        CA.displayInfo();
                        break;
                    case 5:
                        running = false;
                        System.out.println("Thank you for using Banking System!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } else {
            System.out.println("Invalid account type!");
        }

        sc.close();
    }
}
