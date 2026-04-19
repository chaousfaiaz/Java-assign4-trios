
package weapon.dualwield;

public class DualWield extends weapon.Weapon{

    private int weaponDamage;

    // basic intake for the dual wield
    // offered when rogue player model is selected
    public DualWield() {}

    //getters 
    
    public int GetWeaponDamage() {
        return this.GetWeaponDamage();
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