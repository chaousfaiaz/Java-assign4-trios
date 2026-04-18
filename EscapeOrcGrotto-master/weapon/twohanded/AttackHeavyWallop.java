
package weapon.twohanded;
// heavy

public class AttackHeavyWallop extends TwoHanded{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public String attack = "Wallop";

    public AttackHeavyWallop(){
        super();
        Strike(magical * 2);
    }

    public String GetAttack() {
        return this.attack;
    }
} // class