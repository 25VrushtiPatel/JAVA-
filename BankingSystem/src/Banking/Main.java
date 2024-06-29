package Banking;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        CheckingAccount checkingAccount = new CheckingAccount(500.0);

        Transaction transaction = new Transaction();

        transaction.performTransaction(savingsAccount, 500.0, true);
        transaction.performTransaction(checkingAccount, 200.0, false);

        savingsAccount.displayAccountInfo();
        checkingAccount.displayAccountInfo();

        System.out.println("Total Accounts: " + Bank.getTotalAccounts());
    }
}