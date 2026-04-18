
package weapon.twohanded;
//middle stats of the heavy class


public class WeaponBattleAxe extends TwoHanded{

    private int damagePerHit = 24;
    private String type = "Battle Axe";

    public WeaponBattleAxe() {
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