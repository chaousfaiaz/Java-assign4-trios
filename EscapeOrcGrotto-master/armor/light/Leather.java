
package armor.light;
import warrior.*;


public class Leather extends Light{

    Warrior warrior = new Warrior();

    private int pointLow = 150;
    private int pointHigh = 200;
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 3;
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 4;
    private int stamina = warrior.GetStamina();
    private String type = "Leather";

    public Leather() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina - randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class