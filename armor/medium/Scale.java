
package armor.medium;

public class Scale extends Medium{

    private int pointLow = 300;
    private int pointHigh = 350;
    private int agilityBuffLow = 20;
    private int agilityBuffHigh = 30;
    private int staminaDebuffLow = 15;
    private int staminaDebuffHigh = 25;
    private String type = "Scale";

    public Scale() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh - pointLow) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh - agilityBuffLow) + agilityBuffLow);
        super.SetStaminaDebuff(super.randNum.nextInt(staminaDebuffHigh - staminaDebuffLow) + staminaDebuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class