
package weapon.onehanded;
//heavy attack

public class AttackOneHandedHack extends OneHanded{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Hack";

    public AttackOneHandedHack(){
        super();
        Strike(initial * 2);
    }

    public String GetAttack() {
        return this.attack;
    }


}//class