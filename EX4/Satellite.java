package EX4;

public class Satellite extends SpaceObject {
    public Satellite(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
    }

    @Override
    public void displayInfo() {
        System.out.println("Satellite: " + getName());
    }

    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectException {
        if (!(target instanceof Planet)) {
            throw new NotValidSpaceObjectException("Satellite can only orbit a planet.");
        }
        System.out.println(getName() + " is orbiting around " + target.getName());
    }
}