
package weapon.dualwield;
//special attack effect of dodge and regular attack

public class AttackDualTusk extends DualWield{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Dual Tusk";

    public AttackDualTusk(){
        Strike(initial);
        //enemy no attack this round
    }
    
    public String GetAttack() {
        return this.attack;
    }
} // class