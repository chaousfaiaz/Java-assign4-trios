
package armor.heavy;
import warrior.*;
import java.util.Random;

public class Heavy extends armor.Armor{

    Warrior warrior = new Warrior();
    protected Random randNum = new Random();
    private int armourPoints;
    private int agilityBuffer;
    private int staminaDebuff;
    
    public Heavy() {}
    
    //getters 
    public int GetArmorPoints() {
        return this.armourPoints;
    }
    
    public int GetAgilityBuffer() {
        return this.agilityBuffer;
    }

    public int GetStaminaDebuff(){
        return this.staminaDebuff;
    }
    
    //setters
    @Override
    public void SetArmorPoints(int armorPoints) {
        this.armourPoints = armorPoints;
    }

    @Override
    public void SetAgilityBuffer(int agilityBuffer) {
        this.agilityBuffer = agilityBuffer;
    }

    @Override
    public void SetStaminaDebuff(int staminaDebuff){
        this.staminaDebuff = staminaDebuff;
    }
} // class