
package armor.heavy;

public class Splint extends Heavy{

    private int pointLow = 450;
    private int pointHigh = 500;
    private int agilityBuffLow = 15;
    private int agilityBuffHigh = 25;
    private int staminaDebuffLow = 30;
    private int staminaDebuffHigh = 40;
    private String armorType = "Splint";

    public Splint() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh - pointLow) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh - agilityBuffLow) + agilityBuffLow);
        super.SetStaminaDebuff(super.randNum.nextInt(staminaDebuffHigh - staminaDebuffLow) + staminaDebuffLow);
    }

    public String GetArmorType() {
        return this.armorType;
    }
} // class