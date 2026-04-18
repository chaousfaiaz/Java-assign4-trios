
package weapon.twohanded;
// highest dph


public class WeaponWarHammer extends TwoHanded{

    private int damagePerHit = 26;
    private String type = "War Hammer";

    public WeaponWarHammer() {
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
