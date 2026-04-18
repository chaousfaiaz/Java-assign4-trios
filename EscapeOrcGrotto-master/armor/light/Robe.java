
package armor.light;
import warrior.*;

public class Robe extends Light{

    Warrior warrior = new Warrior();

    private int pointLow = 100;
    private int pointHigh = 150;
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 5;
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 6;
    private int stamina = warrior.GetStamina();
    private String type = "Robe";

    public Robe() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina - randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class