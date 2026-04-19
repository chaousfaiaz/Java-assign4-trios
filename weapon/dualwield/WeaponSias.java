
package weapon.dualwield;
import warrior.*;

// fastest of dual wield

public abstract class WeaponSias extends DualWield{

    Warrior warrior = new Warrior();
    
    public int damagePerHit = 10;
    public String type = "Sias";

    public WeaponSias() {
        super();
        super.SetWeaponDamage(damagePerHit);
    }
    
    public int GetWeightBonus(){
        return 3;
    }

    public String GetDualType() {
        return this.type;
    }
} // class