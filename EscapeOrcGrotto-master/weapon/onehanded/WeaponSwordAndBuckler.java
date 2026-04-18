
package weapon.onehanded;
//lowest dph


public class WeaponSwordAndBuckler extends OneHanded{

    private int damagePerHit = 16;
    private String type = "Sword and Buckler";

    public WeaponSwordAndBuckler() {
        super();
        super.SetWeaponDamage(damagePerHit);
    }

    public int GetWeightBonus(){
        return 3;
    }

    public String GetType() {
        return this.type;
    }
} // class