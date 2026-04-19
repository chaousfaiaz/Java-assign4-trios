
package weapon.onehanded;



public class OneHanded extends weapon.Weapon{

    private int weaponDamage;
    // basic intake for the one handed weapons
    //offered when medium player model is selected
    // block bonus goes here since one handed will have a shield all the same bonus too

    public OneHanded() {}

    //getters
    @Override
    public int GetWeaponDamage() {
        return this.weaponDamage;
    }
    
    //setters
    @Override
    public void SetWeaponDamage(int damage) {
        this.weaponDamage = damage;
    }

    public int GetWeightBonus() {
        return 0;
    }
}//class