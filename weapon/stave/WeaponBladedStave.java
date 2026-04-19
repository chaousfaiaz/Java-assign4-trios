
package weapon.stave;
//lowest dph

public class WeaponBladedStave extends Stave{

    private int damagePerHit = 18;
    private String type = "Bladed Stave";

    public WeaponBladedStave() {
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