package EX4;

public class Resource {
    public double amount;
    public double harvestRate;

    public Resource(double amount, double harvestRate) {
        this.amount = amount;
        this.harvestRate = harvestRate;
    }

    public void harvest() {
        this.amount += harvestRate;
    }
}