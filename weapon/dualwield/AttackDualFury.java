
package weapon.dualwield;
//regular attack

public class AttackDualFury extends DualWield{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Dual Furry";

    public AttackDualFury(){
        Strike(initial);
    }

    public String GetAttack() {
        return this.attack;
    }
}//class