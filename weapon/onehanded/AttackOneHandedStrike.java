
package weapon.onehanded;
// regular attack

public class AttackOneHandedStrike extends OneHanded{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Strike";

    public AttackOneHandedStrike(){
        super();
        Strike(initial);
    }

    public String GetAttack() {
        return this.attack;
    }
} // class