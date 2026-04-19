
package enemy;
//heavyweight enemy will have a variance of stats using random

public class ChieftonOrc extends Enemy{

    public int lowHealth = 230;
    public int highHealth = 260;
    public int damageLow = 80;
    public int damageHigh = 100;
    public String type = "Cheifton Orc";


    public ChieftonOrc() {
        super();
        super.SetHealth(randNum.nextInt(highHealth - lowHealth) + lowHealth);
        super.SetEnemyDamage(randNum.nextInt(damageHigh - damageLow) + damageLow);
    }

    public String GetType() {
        return this.type;
    }
}//class