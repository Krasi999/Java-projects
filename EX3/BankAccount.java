package EX3;

public abstract class BankAccount implements Payabal{

    private double sum;
    private double procent;

    BankAccount(double sum, double procent){
        this.sum = sum;
        this.procent = procent;
    }

    public double getSum() {
        return sum;
    }

    public double getProcent() {
        return procent;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setProcent(double procent) {
        this.procent = procent;
    }

    public abstract double pay();
}
