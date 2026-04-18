
package weapon.stave;
//heavy attack

public class AttackMagicExplosion extends Stave{
    public int initial = GetWeaponDamage() / ((warrior.GetStamina() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));
    public int magical = GetWeaponDamage() / ((warrior.GetMagic() / 300) * (GetWeightBonus()) + (warrior.GetAgility() / 200));

    public String attack = "Magical Explosion";

    public AttackMagicExplosion(){
        super();
        Strike(magical * 2);
    }

    public String GetAttack() {
        return this.attack;
    }
} // class