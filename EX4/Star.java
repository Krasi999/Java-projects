package EX4;

import java.util.List;

public class Star extends OrbitableSpaceObject {
    public Star(String name, double coordinateX, double coordinateY, double coordinateZ, double mass,
                List<SpaceObject> orbiters) {
        super(name, coordinateX, coordinateY, coordinateZ, mass, orbiters);
    }

    @Override
    public void displayInfo() {
        System.out.println("Star: " + getName() + " at coordinates (" + getCoordinateX() + ", " + getCoordinateY() +
                ", " + getCoordinateZ() + ") with mass " + getMass());
    }

    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectException {
        throw new NotValidSpaceObjectException("Stars cannot orbit other objects.");
    }
}