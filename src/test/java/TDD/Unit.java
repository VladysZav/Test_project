package TDD;

public class Unit {

    private int health;
    private final int damage;

    public int getHealth(){
        return health;
    }


    public Unit(int health, int damage){
        this.health = health;
        this.damage = damage;

    }

    public void takeDamage(int damage){
        health -= damage;
    }

    public void addDamage(Unit unitTom){
        unitTom.takeDamage(damage);
    }
}
