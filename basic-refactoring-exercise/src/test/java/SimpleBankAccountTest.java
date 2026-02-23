import example.model.AccountHolder;
import example.model.BankAccount;
import example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest {

    public static final double DEFAULT_BALANCE = 0;
    public static final double DEFAULT_DEPOSIT = 100;
    public static final int FAKE_USER_ID = 2;
    public static final int USER_ID = 1;
    private AccountHolder accountHolder;
    private BankAccount bankAccount;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", USER_ID);
        bankAccount = new SimpleBankAccount(accountHolder, DEFAULT_BALANCE);
    }

    @Test
    void testInitialBalance() {
        assertEquals(DEFAULT_BALANCE, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(accountHolder.id(), DEFAULT_DEPOSIT);
        assertEquals(DEFAULT_DEPOSIT, bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        bankAccount.deposit(accountHolder.id(), DEFAULT_DEPOSIT);
        double depositAmount = 50;
        bankAccount.deposit(FAKE_USER_ID, depositAmount);
        assertEquals(DEFAULT_DEPOSIT, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.deposit(accountHolder.id(), DEFAULT_DEPOSIT);
        double withdrawAmount = 70;
        double expectedAmount = 29;
        bankAccount.withdraw(accountHolder.id(), withdrawAmount);
        assertEquals(expectedAmount, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        bankAccount.deposit(accountHolder.id(), DEFAULT_DEPOSIT);
        double withdrawAmount = 70;
        bankAccount.withdraw(FAKE_USER_ID, withdrawAmount);
        assertEquals(DEFAULT_DEPOSIT, bankAccount.getBalance());
    }
}
