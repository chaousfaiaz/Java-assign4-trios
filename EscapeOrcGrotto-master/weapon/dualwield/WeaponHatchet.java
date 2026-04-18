
package weapon.dualwield;
import warrior.*;

//most dph stats of the dual wield

public class WeaponHatchet extends DualWield{

    Warrior warrior = new Warrior();
    
    public int damagePerHit = 14;
    private String type = "Hatchet";

    public WeaponHatchet() {
        super();
        super.SetWeaponDamage(damagePerHit);
    }
    
    public int GetWeightBonus(){
        return 1;
    }

    public String GetDualType() {
        return this.type;
    }
}//class