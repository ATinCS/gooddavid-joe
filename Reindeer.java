/**
 * class Reindeer 
 * Learn GitHub version control for collaborative projects
 * Dillon Aldrich, Andrew Poirier, Jackson Winslow, Luke Willet: 
 * December 19, 2019
 */
public class Reindeer
{
    // class variables (AKA member variables)
    private static int numOfReindeer = 0;
    private static int totalLights = 0;
    private static int totalEnergy = 0;
    
    // instance variables (AKA fields or attributes)
    private String name; 
    private boolean noseGlows;
    private int energy;  // 1 - 5 with 5 as the highest
    
    
    /**
     * 3-Args Constructor for objects of class Reindeer
     */
    public Reindeer(String theName, boolean theNoseGlows, int theEnergy)
    {
        // TO DO: initialise the reindeer's attributes
        name = theName;
        noseGlows = theNoseGlows;
        energy = theEnergy;
        
        
        // TO DO: update the class (static variables)
        numOfReindeer++;
        if(noseGlows)
        {
            totalLights++;
        }
        totalEnergy += energy;
    }
    
    // TODO: Write a getter method for each instance variable
    public String getName()
    {
        // TODO: code here
        return name;
    }
    
    public boolean doesNoseGlow()
    {
        // TODO: code here
        return noseGlows;
    }
    
    public int getEnergyLevel()
    {
        // TODO: code here
        return energy;
    }
    
    // TODO: Write a setter method for each instance variable
    public void changeName(String name)
    {
        // TODO: code here
        this.name = name;
    }
    
    public void setNoseAbility(boolean nG)
    {
        // TODO: code here (don't forget to also update totalLights)
        noseGlows = nG;
        if(noseGlows != nG)
        {
            if(nG == false)
            {
                totalLights--;
            }
            else
            {
                totalLights++;
            }
        }
        
    }
    
    public void changeEnergy(int amountOfChange)
    {
        // TODO: code here (don't forget to also update totalEnergy)
        energy = energy + amountOfChange;
        totalEnergy = totalEnergy + amountOfChange;
    }
    
    // interesting description of the reindeer
    public String toString()
    {
        // TODO: code here
        String starter = "This reindeer is named " + name + ".\n";
        if(noseGlows == true)
        {
            starter += name + "'s nose glows!!\n";
        }
        else{
            starter += name + "'s nose doesn't glow :(\n";
        }
        return starter;
    }
    
    
    // method that returns the happiness of the entire team
    // of reindeer, based on any old combination of conditions
    // and or formulas using totalNumOfReindeer, totalLights
    public String determineTeamHappiness()
    {
        // TODO: code here
        if(noseGlows = true)
        {
            return "This is one happy reindeer!";
        }
        else{
            return "This reindeer is sad:(\nChange its nose ability!";
        }
    }
        
}
