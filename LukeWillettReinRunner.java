
/**
 * Write a description of class LukeWillettReinRunner here.
 *
 * @author (Luke Willett)
 * @version (1/8/20)
 */
public class LukeWillettReinRunner
{
    public static void main(String[] args)
    {
        //create a new reindeer
        Reindeer frank = new Reindeer("Frank", false, 20);
        System.out.println("A reindeer has been created");
        
        //what is the reindeer's name
        System.out.println("Name is " + frank.getName());
        
        //does the reindeer's nose glow
        System.out.println("Nose glows: " + frank.doesNoseGlow());
        
        //what is the reindeer's energy level
        System.out.println("Energy = " + frank.getEnergyLevel());
        
        //describe Frank the Reindeer
        System.out.println(frank.toString());
        
        //Frank lost some energy
        frank.changeEnergy(-5);
        System.out.println("Energy = " + frank.getEnergyLevel());
        
        //change frank's name to Marty
        frank.changeName("Marty");
        System.out.println("Name is " + frank.getName());
        
        //Marty's nose can now glow
        frank.setNoseAbility(true);
        System.out.println("Nose glows: " + frank.doesNoseGlow());
        
        //Marty now has more energy
        frank.changeEnergy(10);
        System.out.println("Energy = " + frank.getEnergyLevel());
        
        //describe Marty the Reindeer
        System.out.println(frank.toString());
        
        //create a new reindeer
        Reindeer scooby = new Reindeer("Scooby", true, 18);
        System.out.println("A reindeer has been created");
        
        //describe Scooby the reindeer
        System.out.println(scooby.toString());
        
        //are Marty and Scooby happy
        System.out.println(frank.determineTeamHappiness());
        
        //scooby loses energy
        scooby.changeEnergy(-8);
        System.out.println("Scooby's Energy = " + scooby.getEnergyLevel());
        
        //are Marty and Scooby happy
        System.out.println(scooby.determineTeamHappiness());
    }
}
