
package weapon.stave;
// most balanced right in the middle

public class WeaponTrident extends Stave{

    private int damagePerHit = 20;
    private String type = "Trident";

    public WeaponTrident() {
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