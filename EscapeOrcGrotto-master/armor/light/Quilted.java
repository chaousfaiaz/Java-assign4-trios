
package armor.light;
import warrior.*;


public class Quilted extends Light{

    Warrior warrior = new Warrior();

    private int pointLow = 200;
    private int pointHigh = 250;
    private int agilityBuffLow = (warrior.GetAgility() / 200) * 1;
    private int agilityBuffHigh = (warrior.GetAgility() / 200) * 2;
    private int stamina = warrior.GetStamina();
    private String type = "Quilted";

    public Quilted() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
        super.SetStaminaDebuff(stamina - randNum.nextInt(agilityBuffHigh) + agilityBuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class