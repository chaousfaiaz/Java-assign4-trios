
package weapon.onehanded;
// highest dph

public class WeaponMaceAndBuckler extends OneHanded{

    private int damagePerHit = 20;
    private String type = "Mace and Buckler";

    public WeaponMaceAndBuckler() {
        super();
        super.SetWeaponDamage(damagePerHit);
    }

    public int GetWeightBonus(){
        return 1;
    }

    public String GetType() {
        return this.type;
    }
} // class