package example.model;

public class FeeBankAccount extends SimpleBankAccount{
    public static final int FEE = 1;

    public FeeBankAccount(final AccountHolder holder, final double balance) {
        super(holder, balance);
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            this.balance -= (amount + FEE);
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance > amount;
    }
}
