/**
 * HillG is short for Hill Giant.
 * Hill Giant is a type of Giant which is a type of Creature.
 * Hill Giant can roll for crit chance as shared by all Giants.
 * HillG also happens to be the superclass for Jairon.
 *
 * @author Don Santiago
 * @version 2024.11.15
 */
public class HillG extends Giant
{
    private static final int MAX_HILLG_HP = 110;
    private static final int MIN_HILLG_HP = 30;
    private static final int MAX_HILLG_STR = 35;
    private static final int MIN_HILLG_STR = 25;
    /**
     * Constructor for object of a class titled "HillG" -
     * We will assign randomly a strength value and a hit point value.
     * 
     * 
     * @param str, the strength value of a Hill Giant.
     * @param hp, the hp value of a Hill Giant.
     * 
     */
    public HillG(int str,int hp)
    {
        super(
            Randomizer.nextInt(MAX_HILLG_HP-MIN_HILLG_HP)+MIN_HILLG_HP,    
            Randomizer.nextInt(MAX_HILLG_STR-MIN_HILLG_STR)+MIN_HILLG_STR);
    }

    /**
    * Override command for attack inherited from creature.
    * Calculate and return a damage value.
    *
    * @return the damage dealt by this particular kind of creature. In the event of a critical hit add an additional 75 damage as per Giant Superclass.
    */
    public int attack(){
    int baseDamage=super.attack();
    return baseDamage;    
    }
    
    /**
     * Override command for name inherited from creature.
     * Replace the default name with whatever is written here in this field for each class.
     * 
     * @return a string that has a display name easily readable for non-machine folk.
     */
    public String getDisplayName(){
        return "Hill Giant";
    }
}
