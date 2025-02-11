package EX4;

public abstract class BaseBuilding {
    protected String name;
    protected int level;
    protected int constructionTime;
    protected double metalRequired, crystalRequired, gasRequired, uraniumRequired;

    public BaseBuilding(String name, int level, int constructionTime, double metalRequired, double crystalRequired, double gasRequired, double uraniumRequired) {
        this.name = name;
        this.level = level;
        this.constructionTime = constructionTime;
        this.metalRequired = metalRequired;
        this.crystalRequired = crystalRequired;
        this.gasRequired = gasRequired;
        this.uraniumRequired = uraniumRequired;
    }

    public abstract void applyEffect(Planet target);

    public void upgrade() {
        level++;
        System.out.println(name + " upgraded to level " + level);
    }
}
