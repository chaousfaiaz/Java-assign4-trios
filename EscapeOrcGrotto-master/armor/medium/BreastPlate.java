
package armor.medium;
import warrior.*;


public class BreastPlate extends Medium{

    Warrior warrior = new Warrior();

    private int pointLow = 350;
    private int pointHigh = 400;
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 1;
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 2;
    private int stamina = warrior.GetStamina();
    private String type = "Breast Plate";

    public BreastPlate() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina - randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class