
package armor.heavy;

public class ChainMail extends Heavy{

    private int pointLow = 400;
    private int pointHigh = 450;
    private int agilityBuffLow = 10;
    private int agilityBuffHigh = 20;
    private int staminaDebuffLow = 25;
    private int staminaDebuffHigh = 35;
    private String armorType = "Chainmail";

    public ChainMail() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh - pointLow) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh - agilityBuffLow) + agilityBuffLow);
        super.SetStaminaDebuff(super.randNum.nextInt(staminaDebuffHigh - staminaDebuffLow) + staminaDebuffLow);
    }

    public String GetType() {
        return this.armorType;
    }
} // class