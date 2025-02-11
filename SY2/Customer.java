package SY2;

public class Customer {
    private String name;
    private  String idNumber;
    private double balance;
    private double creditLimit;
    private static int totalNumberOfCustomers;
    private  boolean isActive;

    public Customer(){
        totalNumberOfCustomers++;
    }

    public Customer(String name, String idNumber, double balance, double creditLimit){
        this.name = name;
        this.idNumber = idNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
        totalNumberOfCustomers++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    public static int getTotalNumberOfCustomers() {
        return totalNumberOfCustomers;
    }
    public static void setTotalNumberOfCustomers(int totalNumberOfCustomers) {
        Customer.totalNumberOfCustomers = totalNumberOfCustomers;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", ID: " + idNumber + ", Balance: " + balance + ", Credit Limit: " + creditLimit;
    }
}
