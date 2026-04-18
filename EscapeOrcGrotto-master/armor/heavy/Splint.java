
package armor.heavy;
import warrior.*;

public class Splint extends Heavy{
    
    Warrior warrior = new Warrior();

    private int pointLow = 450;
    private int pointHigh = 500;
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 3;
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 4;
    private int stamina = warrior.GetStamina();
    private String armorType = "Splint";

    public Splint() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina - randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetArmorType() {
        return this.armorType;
    }
} // class