package JustExercises;

public class Orc extends Character implements Playable{
    Orc(String name, int health, int damage){
        super(name, health, damage);
    }

    @Override
    public int takeDamage(int amount) {
        if (getHealth() > amount) {
            setHealth(getHealth() - amount);
            System.out.println(getName() + " has " + getHealth() + "health");
            return getHealth();
        } else {
            System.out.println("The character is dead!");
            return 0;
        }
    }

    @Override
    public  boolean isAlive(){
        if (getHealth() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void useAbility(Character target){
        target.setDamage(target.getDamage() + 10);
        System.out.println("The orc special ability increase his damage with 10points!");
    }

    @Override
    public void attack(Character target){
        System.out.println(getName() + " attacks " + target.getName() + " for " + getDamage() + " damage!");
        target.takeDamage(getDamage());
    }

    @Override
    public void ShowInfo(){
        super.ShowInfo();
    }

    public void Winner(Character char1, Character char2) {
        if (getHealth() > char1.getHealth() && getHealth() > char2.getHealth()) {
            System.out.println(getName() + " is the winner!");
        }
    }
}
