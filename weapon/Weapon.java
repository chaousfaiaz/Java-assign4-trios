
package weapon;
import warrior.*;


public abstract class Weapon{

    // take in class and sub class
    //take in block gives % health and % stamina back kinda like a rest
    //take in attacks regular and heavy + each classes unique
    // stave StaveBash
    // one handed shield bash
    public Warrior warrior = new Warrior();
    

    public Weapon() {}

    public int Strike(int strike){
        return strike;
    }

    //getters 
    public abstract int GetWeaponDamage();

    public abstract int GetWeightBonus();

    //setters
    public abstract void SetWeaponDamage(int damage);
       

}//class
