import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("✅ Deposited: " + amount + " | Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("❌ Insufficient Balance!");
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000); // initial balance

        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
