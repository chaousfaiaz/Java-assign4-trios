
package armor.medium;
import warrior.*;


public class Scale extends Medium{

    Warrior warrior = new Warrior();

    private int pointLow = 300;
    private int pointHigh = 350;
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 3;
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 4;
    private int stamina = warrior.GetStamina();
    private String type = "Scale";

    public Scale() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina / randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class