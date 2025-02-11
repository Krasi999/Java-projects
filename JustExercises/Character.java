package JustExercises;

public abstract class Character {
    private String  name;
    private int health;
    private int damage;

    public Character(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract int takeDamage(int amount);
    public abstract boolean isAlive();
    public abstract void useAbility(Character target);

    public void ShowInfo(){
        System.out.println("Name:" + getName() + "; Health:" + getHealth() + "; Damage:" + getDamage());
    }
    public abstract void Winner(Character char1, Character char2);

}
