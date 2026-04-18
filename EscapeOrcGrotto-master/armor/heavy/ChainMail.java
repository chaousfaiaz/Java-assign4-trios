
package armor.heavy;
import warrior.*;


public class ChainMail extends Heavy{

    Warrior warrior = new Warrior();

    private int pointLow = 400;
    private int pointHigh = 450;
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 1;
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 2;
    private int stamina = warrior.GetStamina();
    private String armorType = "Chainmail";

    public ChainMail() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina - randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetType() {
        return this.armorType;
    }
} // class