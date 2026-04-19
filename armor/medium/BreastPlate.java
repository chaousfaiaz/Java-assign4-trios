
package armor.medium;

public class BreastPlate extends Medium{

    private int pointLow = 350;
    private int pointHigh = 400;
    private int agilityBuffLow = 15;
    private int agilityBuffHigh = 25;
    private int staminaDebuffLow = 20;
    private int staminaDebuffHigh = 30;
    private String type = "Breast Plate";

    public BreastPlate() {
        super();
        super.SetArmorPoints(super.randNum.nextInt(pointHigh - pointLow) + pointLow);
        super.SetAgilityBuffer(super.randNum.nextInt(agilityBuffHigh - agilityBuffLow) + agilityBuffLow);
        super.SetStaminaDebuff(super.randNum.nextInt(staminaDebuffHigh - staminaDebuffLow) + staminaDebuffLow);
    }

    public String GetType() {
        return this.type;
    }
} // class