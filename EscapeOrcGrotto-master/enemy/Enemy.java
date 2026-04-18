
package enemy;
import java.util.Random;

public class Enemy {

    private int enemyDamage;
    protected int health;
    public String type;
    protected Random randNum = new Random();

    public Enemy() {}

    public int TakeDamage(int amount) {
        return this.health -= amount;
    } // returning how much health is left after taking damage

    // getters
    public int GetHealth() {
        return this.health;
    }
    
    public String GetType() {
        return this.type;
    }

    public int GetEnemyDamage() {
        return this.enemyDamage;
    }

    // setters
    public void SetEnemyDamage(int damage) {
        this.enemyDamage = damage;
    }

    public void SetHealth(int health){
        this.health = health;
    }
} // class
