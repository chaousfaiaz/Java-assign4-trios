
package warrior.dunedain;

public class Dunedain extends warrior.Warrior{
  
  public int lowHealth = 180;
  public int highHealth = 220;
  public int lowAgility = 150;
  public int highAgility = 180;
  public int lowStamina = 220;
  public int highStamina = 280;
  public int lowMagic = 225;
  public int highMagic = 275;
  public String race = "Dunedain";


  public Dunedain() {
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