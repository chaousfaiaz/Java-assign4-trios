
package armor.medium;
import warrior.*;


public class Hide extends Medium{

    Warrior warrior = new Warrior();

    private int pointLow = 250;
    private int pointHigh = 300;
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 5;
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 6;
    private int stamina = warrior.GetStamina();
    private String type = "Hide";

    public Hide() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina - randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class