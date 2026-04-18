
package armor.heavy;
import warrior.*;

public class Plate extends Heavy{

    Warrior warrior = new Warrior();

    private int pointLow = 500;
    private int pointHigh = 550;
    // agilityBuff calculated by % of full agility * buff increase
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 5; 
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 6;
    private int stamina = warrior.GetStamina();
    private String armorType = "Plate";

    public Plate() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina - randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetArmorType() {
        return this.armorType;
    }
} // class