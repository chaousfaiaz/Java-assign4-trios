
package warrior.elf;


public abstract class Elf extends warrior.Warrior{

    public int lowHealth = 100;
    public int highHealth = 140;
    public int lowAgility = 150;
    public int highAgility = 200;
    public int lowStamina = 150;
    public int highStamina = 200;
    public int lowMagic = 250;
    public int highMagic = 300;
    public String race = "Elf";


    public Elf() {
        super();
        super.SetHealth(randNum.nextInt(highHealth)+ lowHealth);
        super.SetAgility(randNum.nextInt(highAgility)+ lowAgility);
        super.SetStamina(randNum.nextInt(highStamina)+ lowStamina);
        super.SetMagic(randNum.nextInt(highMagic)+ lowMagic);
    }

    public String GetRace() {
        return this.race;
    } 
} // class