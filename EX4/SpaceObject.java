package EX4;

public abstract class SpaceObject {
    private String name;
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    private double mass;

    public SpaceObject(String name, double coordinateX, double coordinateY, double coordinateZ, double mass) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.mass = mass;
    }

    // Getters for each field
    public String getName() {
        return name;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public double getMass() {
        return mass;
    }

    // Setter methods if needed
    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    // Basic displayInfo method; can be overridden by subclasses
    public void displayInfo() {
        System.out.println("SpaceObject: " + getName() +
                ", Coordinates: (" + coordinateX + ", " + coordinateY + ", " + coordinateZ + ")" +
                ", Mass: " + mass);
    }

    // Placeholder method for orbit; subclasses will override
    public abstract void orbit(SpaceObject target) throws NotValidSpaceObjectException;
}