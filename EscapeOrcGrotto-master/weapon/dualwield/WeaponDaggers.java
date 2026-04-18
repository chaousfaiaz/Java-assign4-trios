
package weapon.dualwield;
import warrior.*;

// middle stats of dual wield

public class WeaponDaggers extends DualWield{
    Warrior warrior = new Warrior();
    
    public static int damagePerHit = 12;

    private String type = "Daggers";

    public WeaponDaggers() {
        super();
        super.SetWeaponDamage(damagePerHit);
    }

    public int GetWeightBonus(){
        return 2;
    }

    public String GetDualType() {
        return this.type;
    }
} // class