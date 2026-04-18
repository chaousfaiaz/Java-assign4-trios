
package weapon.twohanded;


public class TwoHanded extends weapon.Weapon{

    private int weaponDamage;
    // basic intake for the heavy weapons
    // offered when heavy player model is selected
    public TwoHanded() {
    }

    //getters 
    @Override
    public int GetWeaponDamage() {
        return this.weaponDamage;
    }

    @Override
    //setters
    public void SetWeaponDamage(int damage) {
        this.weaponDamage = damage;
    }

    public int GetWeightBonus() {
        return 0;
    }
}//class