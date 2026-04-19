
package warrior;
import java.util.Random;

public class Warrior{

    public Warrior() {}

    protected int health;
    protected int agility;
    protected int stamina;
    protected int magic;
    protected int weaponEffect;
    public String warriorType;
    public String race;
    protected Random randNum = new Random();
    private int detriment;


    public int TakeDamage(int amount) {
        return this.health -= amount;
    }// returning how much health is left after taking damage

    public int Detriment(int attackChoice) {
        if(attackChoice == 1){
            detriment = 25;
        }else if(attackChoice == 2) {
            detriment = 15;
        }
        return this.stamina -= detriment;
    }

    //getters
    public int GetHealth() {
        return this.health;
    }
    public int GetAgility() {
        return this.agility;
    }
    public int GetStamina() {
        return this.stamina;
    }
    public int GetMagic() {
        return this.magic;
    }
    public int GetWeaponEffect() {
        return this.weaponEffect;
    }

    public String GetWarriorType() {
        return this.warriorType;
    }
    public String GetRace() {
        return this.race;
    }

    //Setters
    public void SetHealth(int health){
        this.health = health;
    }
    public void SetAgility(int agility){
        this.agility = agility;
    }
    public void SetStamina(int stamina){
        this.stamina = stamina;
    }
    public void SetMagic(int magic){
        this.magic = magic;
    }
    public void SetWeaponEffect(int weaponEffect){
        this.weaponEffect = weaponEffect;
    }    
} // class