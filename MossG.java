
/**
 * MossG is short for Moss Giant.
 * Moss Giant is a type of Giant which is a type of Creature.
 * Moss Giant can roll for crit chance as shared by all Giants.
 *
 * @author Don Santiago
 * @version 2024.11.15
 */
public class MossG extends Giant
{
    private static final int MAX_MOSSG_HP = 120;
    private static final int MIN_MOSSG_HP = 40;
    private static final int MAX_MOSSG_STR = 50;
    private static final int MIN_MOSSG_STR = 30;
    /**
     * Constructor for object of a class titled "MossG" -
     * We will assign randomly a strength value and a hit point value.
     * 
     * 
     * @param str, the strength value of a moss giant.
     * @param hp, the hp value of a moss giant.
     * 
     */
    public MossG(int str,int hp)
    {
        super(
            Randomizer.nextInt(MAX_MOSSG_HP-MIN_MOSSG_HP)+MIN_MOSSG_HP,    
            Randomizer.nextInt(MAX_MOSSG_STR-MIN_MOSSG_STR)+MIN_MOSSG_STR);
    }

    /**
     * Override command for attack inherited from creature.
     * Calculate and return a damage value.
     *
     * @return the damage dealt by this particular kind of creature. In the event of a critical hit deal an additional 75 damage as per Giant Superclass.
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
        return "Moss Giant";
    }
}
