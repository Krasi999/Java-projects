package EX4;

import java.util.ArrayList;
import java.util.List;

public abstract class OrbitableSpaceObject extends SpaceObject {
    private List<SpaceObject> orbiters;

    public OrbitableSpaceObject(String name, double coordinateX, double coordinateY, double coordinateZ, double mass, List<SpaceObject> orbiters) {
        super(name, coordinateX, coordinateY, coordinateZ, mass);
        this.orbiters = (orbiters != null) ? orbiters : new ArrayList<>();
    }

    public List<SpaceObject> getOrbiters() {
        return orbiters;
    }

    public void setOrbiters(List<SpaceObject> orbiters) {
        this.orbiters = orbiters;
    }

    public void addOrbiter(SpaceObject orbiter) {
        orbiters.add(orbiter);
    }
}