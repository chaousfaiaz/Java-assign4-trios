
package weapon.twohanded;



public class AttackHeavySweep extends TwoHanded{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Sweep";

    public AttackHeavySweep(){
        super();
        Strike(initial);
    }

    public String GetAttack() {
        return this.attack;
    }
} // class