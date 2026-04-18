
package weapon.twohanded;
// lowest dph


public class WeaponLongSword extends TwoHanded{

    private int damagePerHit = 22;
    private String type = "Long Sword";

    public WeaponLongSword() {
        super();
        super.SetWeaponDamage(damagePerHit);
    }

    public int GetWeightBonus(){
        return 2;
    }

    public String GetType() {
        return this.type;
    }
} // class
