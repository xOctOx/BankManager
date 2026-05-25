public class COD extends BankAccount{
    private int limit;
    
    public COD(String account, int balance, int limit) {
        super(account, balance);
        this.limit = limit;
    }
}
