package EX4;

public class SpaceShip extends SpaceObject implements Fly {
    protected String type;
    protected double speed;
    protected double cargoCapacity;
    protected double weaponPower;

    public SpaceShip(String name, String type, double speed, double cargoCapacity, double weaponPower,
                     double coordinateX, double coordinateY, double coordinateZ, double mass) {
        // Call the parent (SpaceObject) constructor
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.type = type;
        this.speed = speed;
        this.cargoCapacity = cargoCapacity;
        this.weaponPower = weaponPower;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Display basic SpaceObject info
        System.out.println("Type: " + type + ", Speed: " + speed +
                ", Cargo Capacity: " + cargoCapacity + ", Weapon Power: " + weaponPower);
    }

    // Implement the flyTo method from the Fly interface
    @Override
    public void flyTo(SpaceObject destination) {
        System.out.println(getName() + " is flying to " + destination.getName() +
                " at a speed of " + speed + " units.");
    }

    // Define harvestResource method for interaction with Planet objects
    public void harvestResource(Planet target) {
        target.metal.harvest();
        System.out.println(getName() + " harvested resources from " + target.getName());
    }

    // Implement orbit method as required by SpaceObject
    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectException {
        if (!(target instanceof Planet || target instanceof Star)) {
            throw new NotValidSpaceObjectException("SpaceShip can only orbit a planet or a star.");
        }
        System.out.println(getName() + " is orbiting around " + target.getName());
    }
}