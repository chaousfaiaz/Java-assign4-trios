
package armor.medium;

public class Hide extends Medium{

    private int pointLow = 250;
    private int pointHigh = 300;
    private int agilityBuffLow = 25;
    private int agilityBuffHigh = 35;
    private int staminaDebuffLow = 10;
    private int staminaDebuffHigh = 20;
    private String type = "Hide";

    public Hide() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh - pointLow) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh - agilityBuffLow) + agilityBuffLow);
        super.SetStaminaDebuff(super.randNum.nextInt(staminaDebuffHigh - staminaDebuffLow) + staminaDebuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class