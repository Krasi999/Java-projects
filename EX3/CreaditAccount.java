package EX3;

public class CreaditAccount extends  BankAccount{
    private int months;
    CreaditAccount(double sum, double procent, int months){
        super(sum, procent);
        this.months = months;
    }
    public int getMonths(){
        return months;
    }
    public void setMonths(int months){
        this.months = months;
    }
    public double pay(){
        return this.getSum()*(Math.pow((1 + this.getProcent()/100), this.getMonths()));
    }
}
