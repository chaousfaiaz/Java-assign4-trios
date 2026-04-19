
package enemy;

// Eog

public class OrcBoss extends Enemy{

    public int health = 300;
    public int damageLow = 100;
    public int damageHigh = 120;
    public String type = "Eog";


    public OrcBoss() {
        super();
        super.SetHealth(health);
        super.SetEnemyDamage((randNum.nextInt(damageHigh) + damageLow));
    }

    public String GetType() {
        return this.type;
    }
} // class