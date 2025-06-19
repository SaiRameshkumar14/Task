
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {

    private double balance;

    public Account(double initialAmount) {
        this.balance = initialAmount;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankApp {

    public static void main(String[] args) {
        Account account = new Account(1000);
        account.displayBalance();
        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        account.displayBalance();
    }
}
