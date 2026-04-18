
package warrior.dwarf;


public abstract class Dwarf extends warrior.Warrior{
    
    public int lowHealth = 160;
    public int highHealth = 200;
    public int lowAgility = 100;
    public int highAgility = 120;
    public int lowStamina = 250;
    public int highStamina = 300;
    public int lowMagic = 200;
    public int highMagic = 250;
    public String race = "Dwarf";


    public Dwarf() {
        super();
        super.SetHealth(randNum.nextInt(highHealth)+ lowHealth);
        super.SetAgility(randNum.nextInt(highAgility)+ lowAgility);
        super.SetStamina(randNum.nextInt(highStamina)+ lowStamina);
        super.SetMagic(randNum.nextInt(highMagic)+ lowMagic);
    }

    public String GetRace() {
        return this.race;
    }


    
}//class