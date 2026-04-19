
package armor.light;

public class Leather extends Light{

    private int pointLow = 150;
    private int pointHigh = 200;
    private int agilityBuffLow = 30;
    private int agilityBuffHigh = 40;
    private int staminaDebuffLow = 10;
    private int staminaDebuffHigh = 20;
    private String type = "Leather";

    public Leather() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh - pointLow) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh - agilityBuffLow) + agilityBuffLow);
        super.SetStaminaDebuff(super.randNum.nextInt(staminaDebuffHigh - staminaDebuffLow) + staminaDebuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class