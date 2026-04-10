package ch03;

/**
 * Balance örneği: double ile bakiye, deposit/withdraw.
 */
public class AccountBalanceTest {
    public static void main(String[] args) {
        Account a = new Account("Alice", 50.00);
        Account b = new Account("Bob", -7.0); // negatif olamaz -> 0.0 olur

        a.deposit(25.50);
        a.withdraw(10.00);

        System.out.printf("%s balance: %.2f%n", a.getName(), a.getBalance());
        System.out.printf("%s balance: %.2f%n", b.getName(), b.getBalance());
    }
}

