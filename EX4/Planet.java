package EX4;

import java.util.ArrayList;
import java.util.List;

public abstract class Planet extends OrbitableSpaceObject {
    public Resource metal, gas, crystal, uranium;
    private List<BaseBuilding> buildings;

    public Planet(String name, double coordinateX, double coordinateY, double coordinateZ, double mass, List<SpaceObject> orbiters) {
        super(name, coordinateX, coordinateY, coordinateZ, mass, orbiters);
        this.metal = new Resource(100, 1.0);
        this.gas = new Resource(100, 0.5);
        this.crystal = new Resource(100, 0.2);
        this.uranium = new Resource(100, 0.1);
        this.buildings = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Planet: " + getName());
    }

    @Override
    public void orbit(SpaceObject target) throws NotValidSpaceObjectException {
        if (!(target instanceof Star)) {
            throw new NotValidSpaceObjectException("Planet can only orbit a star.");
        }
        System.out.println(getName() + " is orbiting around " + target.getName());
    }

    public void addBuilding(BaseBuilding building) {
        buildings.add(building);
    }

    public void printResources() {
        System.out.println("Resources on " + getName() + ":");
        System.out.println("Metal: " + metal.amount + ", Gas: " + gas.amount + ", Crystal: " + crystal.amount + ", Uranium: " + uranium.amount);
    }
}