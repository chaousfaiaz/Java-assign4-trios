
package armor.heavy;

public class Plate extends Heavy{

    private int pointLow = 500;
    private int pointHigh = 550;
    private int agilityBuffLow = 25;
    private int agilityBuffHigh = 30;
    private int staminaDebuffLow = 40;
    private int staminaDebuffHigh = 50;
    private String armorType = "Plate";

    public Plate() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh - pointLow) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh - agilityBuffLow) + agilityBuffLow);
        super.SetStaminaDebuff(super.randNum.nextInt(staminaDebuffHigh - staminaDebuffLow) + staminaDebuffLow);
    }

    public String GetArmorType() {
        return this.armorType;
    }
} // class