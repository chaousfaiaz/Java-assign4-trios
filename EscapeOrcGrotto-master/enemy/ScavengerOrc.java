
package enemy;


public class ScavengerOrc extends Enemy{

    public int lowHealth = 200;
    public int highHealth = 230;
    public int damageLow = 80;
    public int damageHigh = 100;
    public String type = "Scavenger Orc";


    public ScavengerOrc() {
        super();
        super.SetHealth((randNum.nextInt(highHealth)+ lowHealth) * 2);
        super.SetEnemyDamage(randNum.nextInt(damageHigh) + damageLow);
    }

    public String GetType() {
        return this.type;
    }
} // class