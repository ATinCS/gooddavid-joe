
/**
 * Write a description of class AndrewReinRunner here.
 *
 * @Andrew Poirier
 * @1/8/19
 */
public class AndrewReinRunner
{
    public static void main (String args[])
    {
        //initialize a Reindeer object called "AndrewJoe" with a glowing nose
        //and 5 energy
        Reindeer andrewJoe = new Reindeer("AndrewJoe", true, 5);
        
        //initialize a couple other Reindeer objects
        Reindeer goofy = new Reindeer("Goofy", false, 2);
        Reindeer marcus = new Reindeer("Marcus", true, 1);
        Reindeer dimmy = new Reindeer("Dimmy", true, 9);
        
        //now test some methods!
        System.out.println("AndrewJoe's name: " + andrewJoe.getName());
        System.out.println("Does marcus' nose glow? " + marcus.doesNoseGlow());
        System.out.println("Get dimmy's energy level: " + dimmy.getEnergyLevel());
        
        //change goofy's name!
        goofy.changeName("John");
        System.out.println("We just changed goofy's name to: " + goofy.getName());
        
        //change marcus' nose glow-ability!
        marcus.setNoseAbility(false);
        System.out.println("We just changed marcus' nose glow-ability to: " + marcus.doesNoseGlow());
        
        //change dimmy's energy level!
        dimmy.changeEnergy(8);
        System.out.println("We just changed dimmy's energy level to: " + dimmy.getEnergyLevel());
        
        //check the toString method
        System.out.println(andrewJoe.toString());
        
        System.out.println(andrewJoe.determineTeamHappiness());
        
        
    }
}
