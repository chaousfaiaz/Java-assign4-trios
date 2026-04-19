

package weapon.stave;

public class Stave extends weapon.Weapon{

    private int weaponDamage;
    // basic intake for the staves
    // offered when magical player model is selected

    public Stave() {}

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