import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println("Enter Savings Account details:");
        System.out.print("Account Number: ");
        String savingsAccountNumber = scanner.nextLine();
        System.out.print("Account Holder: ");
        String savingsAccountHolder = scanner.nextLine();
        System.out.print("Balance: ");
        double savingsBalance = scanner.nextDouble();
        System.out.print("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        savingsAccount.setAccountDetails(savingsAccountNumber, savingsAccountHolder, savingsBalance);
        savingsAccount.setSavingsAccountDetails(interestRate);

        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println("\nEnter Checking Account details:");
        System.out.print("Account Number: ");
        String checkingAccountNumber = scanner.nextLine(); // Consume newline
        checkingAccountNumber = scanner.nextLine();
        System.out.print("Account Holder: ");
        String checkingAccountHolder = scanner.nextLine();
        System.out.print("Balance: ");
        double checkingBalance = scanner.nextDouble();
        System.out.print("Overdraft Limit: ");
        double overdraftLimit = scanner.nextDouble();
        checkingAccount.setAccountDetails(checkingAccountNumber, checkingAccountHolder, checkingBalance);
        checkingAccount.setCheckingAccountDetails(overdraftLimit);

        System.out.println("\nPerform Transactions:");
        System.out.print("Deposit amount into Savings Account: ");
        double depositAmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmount);
        System.out.print("Withdraw amount from Checking Account: ");
        double withdrawAmount = scanner.nextDouble();
        checkingAccount.withdraw(withdrawAmount);

        System.out.println("\nSavings Account Information:");
        System.out.println("-----------------------------");
        savingsAccount.displayAccountInfo();
        System.out.println("-----------------------------");

        System.out.println("\nChecking Account Information:");
        System.out.println("-----------------------------");
        checkingAccount.displayAccountInfo();
        System.out.println("-----------------------------");

        scanner.close();
    }
}
