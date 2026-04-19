
package warrior;

public class DunedainAbility extends Warrior {
//regain small % of mana/stamina and small % of health 
    Warrior warrior = new Warrior();
    public static String abilityType1 = "Repose";
    public static String abilityType2 = "Magical Repose";

    public DunedainAbility(){
        if(warrior.GetWarriorType().equals("SoothSayer") || warrior.GetWarriorType().equals("SoothSayer") || warrior.GetWarriorType().equals("LoreMaster") || warrior.GetWarriorType().equals("Mage")){
           // add GetMagic * .25
           // add GetHealth * .25
        }else {
            // add GetStamina * .25
           // add GetHealth * .25
        }

    }


    
}//class