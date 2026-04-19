
package weapon.onehanded;
// most balanced weapon for melee

public class WeaponHandAxeAndBuckler extends OneHanded{

    private int damagePerHit = 18;
    private String type = "Hand Axe and Buckler";

    public WeaponHandAxeAndBuckler() {
        super();
        super.SetWeaponDamage(damagePerHit);
    }

    public int GetWeightBonus(){
        return 1;
    }

    public String GetType() {
        return this.type;
    }
}//class