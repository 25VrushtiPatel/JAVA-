package Banking;

public class Transaction {
    private final double transactionFee = 0.5;

    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount - transactionFee);
        } else {
            account.withdraw(amount + transactionFee);
        }
    }
}