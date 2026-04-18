
package warrior.human;


public class Human extends warrior.Warrior{
    
    public int lowHealth = 200;
    public int highHealth = 240;
    public int lowAgility = 140;
    public int highAgility = 180;
    public int lowStamina = 200;
    public int highStamina = 250;
    public int lowMagic = 200;
    public int highMagic = 250;
    public String race = "Human";


    public Human() {
        super();
        super.SetHealth(randNum.nextInt(highHealth)+ lowHealth);
        super.SetAgility(randNum.nextInt(highAgility)+ lowAgility);
        super.SetStamina(randNum.nextInt(highStamina)+ lowStamina);
        super.SetMagic(randNum.nextInt(highMagic)+ lowMagic);
    }

    public String GetRaceType() {
        return this.race;
    }
}//class