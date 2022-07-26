import java.util.Scanner;

public class CheckingAccount extends BankAccount {
    double interestRate;

    @Override
    public void withdrawal(double amount) {
        double bal = getAccountBalance();
        bal -= amount;

        if(bal < 0) {
            bal -= 30;
        }
        setAccountBalance(bal);
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public CheckingAccount(String firstName, String lastName, int accountId, double interestRate) {
        super(firstName, lastName, accountId);
        this.interestRate = interestRate;
    }

    public void processWithdrawal(int amount) {
        double bal = getAccountBalance();
        bal -= amount;
        setAccountBalance(bal);
    }

    public void displayAccount() {
        System.out.println("Hello " + getFirstName() + " " + getLastName());
        System.out.println("Your account ID: " + getAccountId());
        System.out.println("Your account balance: " + getAccountBalance());
        System.out.println("Your interest rate: " + getInterestRate());
    }
}
