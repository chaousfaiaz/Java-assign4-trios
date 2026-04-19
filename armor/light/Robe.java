
package armor.light;

public class Robe extends Light{

    private int pointLow = 100;
    private int pointHigh = 150;
    private int agilityBuffLow = 35;
    private int agilityBuffHigh = 45;
    private int staminaDebuffLow = 5;
    private int staminaDebuffHigh = 15;
    private String type = "Robe";

    public Robe() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh - pointLow) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh - agilityBuffLow) + agilityBuffLow);
        super.SetStaminaDebuff(super.randNum.nextInt(staminaDebuffHigh - staminaDebuffLow) + staminaDebuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class