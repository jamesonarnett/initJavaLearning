public class BankAccount {
    private String firstName;
    private String lastName;
    private int accountId;
    private double accountBalance;

    //constructor
    public BankAccount(String firstName, String lastName, int accountId)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountId = accountId;
        this.accountBalance = 0;
    }

    //setters
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setLastName(String name) {
        this.lastName = name;
    }
    public void setAccountId(int Id) {
        this.accountId = Id;
    }
    public void setAccountBalance(double amount) {
        if(amount > 0) {
            this.accountBalance = amount;
        }
    }

    //getters
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public double getAccountId() {
        return this.accountId;
    }
    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.accountBalance += amount;
        }
    }

    public void withdrawal(double amount) {
        if(this.getAccountBalance() >= amount) {
            this.accountBalance -= amount;
        }
    }

    //account details output
    public void accountSummary() {
        System.out.println("Hello " + this.getFirstName() +  " " + this.getLastName());
        System.out.println("Your account ID is: " + this.getAccountId());
        System.out.println("Your current balance is: " + this.getAccountBalance());
    }
}
