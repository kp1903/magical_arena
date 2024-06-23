import java.util.Random;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Player opponent) {
        int attackRoll = rollDie();
        int attackDamage = attack * attackRoll;
        opponent.defend(attackDamage);
    }

    public void defend(int damage) {
        int defendRoll = rollDie();
        int defendValue = strength * defendRoll;
        int netDamage = Math.max(damage - defendValue, 0);
        health = Math.max(health - netDamage, 0);
    }

    private int rollDie() {
        return random.nextInt(6) + 1;
    }
}