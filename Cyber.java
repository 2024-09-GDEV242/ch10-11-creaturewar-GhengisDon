
/**
 * Cyber is a type of Demon.
 * Cyber gets the ability to roll for crit chance that all Demon types share.
 * @author Don Santiago
 * @version 2024.11.15
 */

public class Cyber extends Demon
{
    private static final int MAX_CYBER_HP = 100;
    private static final int MIN_CYBER_HP = 25;
    private static final int MAX_CYBER_STR = 40;
    private static final int MIN_CYBER_STR = 20;

    /**
     * Constructor for object of a class titled "Cyber" -
     * We will assign randomly a strength value and a hit point value.
     * 
     * 
     * @param str, the strength value of a cyber demon.
     * @param hp, the hp value of a cyber demon.
     * 
     */
    public Cyber(int str,int hp)
    {
        super(Randomizer.nextInt(MAX_CYBER_HP-MIN_CYBER_HP)+MIN_CYBER_HP,    
            Randomizer.nextInt(MAX_CYBER_STR-MIN_CYBER_STR)+MIN_CYBER_STR);
    }

    /**
     *Override command for attack inherited from creature.
     *Calculate and return a damage value.
     *
     *@return the damage dealt by this particular kind of creature. In the event of a critical hit deal an additional 50 points of damage as per Demon superclass.
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
        return "Cyber Demon";
    }
}
