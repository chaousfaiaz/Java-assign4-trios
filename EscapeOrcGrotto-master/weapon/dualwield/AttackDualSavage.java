
package weapon.dualwield;
//heavy attack

public class AttackDualSavage extends DualWield{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Dual Savage";

    public AttackDualSavage(){
        Strike(initial * 2);
    }

    public String GetAttack() {
        return this.attack;
    }
}//class