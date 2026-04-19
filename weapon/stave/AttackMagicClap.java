
package weapon.stave;
//regular attack for magic group

public class AttackMagicClap extends Stave{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Magical Clap";

    public AttackMagicClap(){
        super();
        Strike(magical);
    }

    public String GetAttack() {
        return this.attack;
    }
} // class