package EX4;

public class Scout extends SpaceShip {
    private double sensorRange;

    public Scout(String name, double speed, double sensorRange,
                 double coordinateX, double coordinateY, double coordinateZ, double mass) {
        // Call the SpaceShip constructor with necessary parameters
        super(name, "Scout", speed, 0, 0, coordinateX, coordinateY, coordinateZ, mass);
        this.sensorRange = sensorRange;
    }

    // Getter and setter for sensorRange
    public double getSensorRange() {
        return sensorRange;
    }

    public void setSensorRange(double sensorRange) {
        this.sensorRange = sensorRange;
    }

    // Method for exploring, specific to Scout
    public void explore() {
        System.out.println(getName() + " is exploring with a sensor range of " + sensorRange);
    }

    // Method to report resources on a given Planet
    public void reportResources(Planet target) {
        System.out.println("Reporting resources on " + target.getName() + ":");
        target.printResources();
    }

    // Override displayInfo to include Scout-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call SpaceShip's displayInfo first
        System.out.println("Scout specific details: Sensor Range = " + sensorRange);
    }
}