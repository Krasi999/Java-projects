package EX3;

public class DebitAccount extends BankAccount{
    DebitAccount(double sum, double procent){
        super(sum, procent);
    }

    public double pay(){
        return this.getSum() + this.getSum()*this.getProcent();
    }
}
