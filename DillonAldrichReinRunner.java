
/**
 * Write a description of class DillonAldrichReinRunner here.
 *
 * @author (Dillon Aldrich)
 * @version (01/08/2020)
 */
public class DillonAldrichReinRunner
{
    public static void main(String[] args)
    {
        // create new objects of the Reindeer class
        // fields are String name, boolean noseGlows, and int theEnergy
        Reindeer joe = new Reindeer("Joe", true, 5);
        Reindeer calvin = new Reindeer("Calvin", false, 1);
        Reindeer candice = new Reindeer("Candice", true, 4);
        
        // test the instance variable getter methods
        System.out.println("Joe's name: " + joe.getName());
        System.out.println("Calvin's nose glow? " + calvin.doesNoseGlow());
        System.out.println("Candice's energy level: " + candice.getEnergyLevel());
        
        // test the instance variable setter methods
        System.out.println("Calvin's name: " + calvin.getName());
        calvin.changeName("Andrew");
        System.out.println("Calvin's name: " + calvin.getName());
        
        System.out.println("Joe's nose glow? " + joe.doesNoseGlow());
        joe.setNoseAbility(false);
        System.out.println("Joe's nose glow? " + joe.doesNoseGlow());
        
        System.out.println("Candice's energy level: " + candice.getEnergyLevel());
        candice.changeEnergy(1);
        System.out.println("Candice's energy level: " + candice.getEnergyLevel());
        
        // test the toString() method
        System.out.println(calvin.toString());
        
        // test the determineTeamHappiness() method
        System.out.print(joe.determineTeamHappiness());
        
        
    }
}
