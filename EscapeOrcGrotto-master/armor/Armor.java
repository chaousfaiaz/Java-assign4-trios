
package armor;
//done

public abstract class Armor{
//agility makes armor more effective
//staminaDebuff lower dependent on agilityBuffer
//armor points


public Armor() {}

//getters 
public abstract int GetArmorPoints();
public abstract int GetAgilityBuffer();
public abstract int GetStaminaDebuff();

//setters
public abstract void SetArmorPoints(int armorPoints);
public abstract void SetAgilityBuffer(int agilityBuffer);
public abstract void SetStaminaDebuff(int staminaDebuff);


}//class