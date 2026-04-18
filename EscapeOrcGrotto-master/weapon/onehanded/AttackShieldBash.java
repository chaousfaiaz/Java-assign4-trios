
package weapon.onehanded;
//special attack effect of block and regular attack

public class AttackShieldBash extends OneHanded{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Shield Bash";

    public AttackShieldBash(){
        super();
        Strike(initial);
    }

    public String GetAttack() {
        return this.attack;
    }
} // class