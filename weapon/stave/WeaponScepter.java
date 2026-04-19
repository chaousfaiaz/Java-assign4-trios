
package weapon.stave;
// highest dbh

public class WeaponScepter extends Stave{

    private int damagePerHit = 20;
    private String type = "Scepter";

    public WeaponScepter() {
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