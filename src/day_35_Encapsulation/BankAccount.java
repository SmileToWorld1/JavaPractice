package day_35_Encapsulation;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance<0){
            System.err.println("Invalid balance: "+balance);
            return;
        }
        this.balance = balance;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void deposit(double deposit){
        if (deposit<0){
            System.err.println("Invalid deposit: "+deposit);
             return;
        }
        balance += deposit;
    }
    public void withdraw(double withdraw){
        if (balance-withdraw<0||withdraw<0){
            System.err.println("insufficient balance");
            return;
        }
        balance -= withdraw;
    }
    public double checkBalance(){
        return getBalance();
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
