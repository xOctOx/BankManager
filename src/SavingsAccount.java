public class SavingsAccount extends BankAccount {
    private int limit;

    public SavingsAccount(String account, int balance, int limit) {
        super(account, balance);
        this.limit = limit;
    }
}
