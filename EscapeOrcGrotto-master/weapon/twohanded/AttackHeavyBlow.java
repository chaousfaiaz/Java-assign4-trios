
package weapon.twohanded;
// regular

public class AttackHeavyBlow extends TwoHanded{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Blow";

    public AttackHeavyBlow(){
        super();
        Strike(magical * 2);
    }

    public String GetAttack() {
        return this.attack;
    }
} // class