public class Account {
    private double currentBalance;
    private String accountName;

    private static double allAccountBalance = 0;
    private static final double MIN_BALANCE = 0;

    public Account(String name){
        accountName = name;
        currentBalance = 0;
    }

    public Account(String name, double initialDeposit){
        accountName = name;
        currentBalance = 0;
        deposit(initialDeposit);
    }

    public void deposit(double amount){
        currentBalance += amount;
        allAccountBalance += amount;
    }

    public void withdraw(double amount){
        double amountAvailable = Math.max(0, currentBalance - amount);
        currentBalance -= amountAvailable;
        allAccountBalance -= amountAvailable;
    }

    public void setCurrentBalance(double amount){
        allAccountBalance += amount - currentBalance;
        currentBalance = amount;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }

    public String getAccountName(){
        return accountName;
    }

    public String toString(){
        return String.format("%s: $%.2f", accountName, currentBalance);
    }

    public static double getAllAccountBalance(){
        return allAccountBalance;
    }
}
