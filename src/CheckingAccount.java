public class CheckingAccount extends BankAccount {
    private int limit;

    public CheckingAccount(String account, int balance, int limit) {
        super(account, balance);
        this.limit = limit;
    }
}
