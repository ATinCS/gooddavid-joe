/**
 * Write a description of class JackWinslowReinRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JackWinslowReinRunner
{
    // instance variables - replace the example below with your own

    public static void main(String[] args)
    {
        Reindeer geoffrey = new Reindeer("Geoffrey", true, 15);
        
        System.out.println("getName() returns: " + geoffrey.getName());
        
        System.out.println("doesNoseGlow() returns: " + geoffrey.doesNoseGlow());
        
        System.out.println("getEnergyLevel() returns: " + geoffrey.getEnergyLevel());
        
        System.out.println();
        
        System.out.println("Changing name based on changeName()...");
        
        System.out.println();
        
        geoffrey.changeName("Nelson");
        
        System.out.println("Name changed to: " + geoffrey.getName());
        
        System.out.println("Setting nose ability based on setNoseAbility()...");
        
        System.out.println();
        
        geoffrey.setNoseAbility(false);
        
        System.out.println("Nose ability changed to: " + geoffrey.doesNoseGlow());
        
        System.out.println();
        
        System.out.println("Changing energy based on changeEnergy()...");
        
        System.out.println();
        
        geoffrey.changeEnergy(27);
        
        System.out.println("Energy changed to: " + geoffrey.getEnergyLevel());
        
        System.out.println();
        
        System.out.println("twoString() returns:");
        
        System.out.println(geoffrey.toString());
        
        System.out.println("Is the team happy?");
        
        System.out.println(geoffrey.determineTeamHappiness());
        
        
        
        
        
        
    }
}
