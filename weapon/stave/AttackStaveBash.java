
package weapon.stave;


public class AttackStaveBash extends Stave{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    
    public String attack = "Stave Bash";

    public AttackStaveBash(){
        super();
        Strike(magical);
        //no attack taken
    }

    public String GetAttack() {
        return this.attack;
    }
} // class
