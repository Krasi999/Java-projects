package JustExercises;

public class Elf extends Character  implements Playable{
    Elf(String name, int health, int damage) {
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
        target.setDamage(target.getDamage() - 20);
        System.out.println("The elf special ability decrease his take damage with 20 point!");
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

