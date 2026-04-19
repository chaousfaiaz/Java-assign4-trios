
package enemy;

public class ShamanOrc extends Enemy{

    public int lowHealth = 170;
    public int highHealth = 200;
    public int damageLow = 80;
    public int damageHigh = 100;
    public String type = "Shaman Orc";


    public ShamanOrc() {
        super();
        super.SetHealth(randNum.nextInt(highHealth - lowHealth) + lowHealth);
        super.SetEnemyDamage(randNum.nextInt(damageHigh - damageLow) + damageLow);
    }

    public String GetType() {
        return this.type;
    }
} // class