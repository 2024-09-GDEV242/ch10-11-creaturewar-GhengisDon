/**
 * Jairon is a boss varient creature similar to Balrog.
 * Jairon is a type of Hill Giant which is a type of a Giant which is a type of Creature.
 * Jairon features a 1% chance to OHKO an opponent
 * Jairon can roll for crit chance as shared with all Giants.
 * Jairon is a child class of HillG.
 *
 * @author Don Santiago
 * @version 2024.11.15
 */
public class Jairon extends HillG
{
    private static final int MAX_JAIRON_HP = 300;
    private static final int MIN_JAIRON_HP = 120;
    private static final int MAX_JAIRON_STR = 130;
    private static final int MIN_JAIRON_STR = 80;
    /**
     * Constructor for object of a class titled "Jairon" -
     * We will assign randomly a strength value and a hit point value.
     * 
     * 
     * @param str, the strength value of a Jairon.
     * @param hp, the hp value of a Jairon.
     * 
     */
    public Jairon(int str,int hp)
    {
        super(Randomizer.nextInt(MAX_JAIRON_HP-MIN_JAIRON_HP)+MIN_JAIRON_HP,    
            Randomizer.nextInt(MAX_JAIRON_STR-MIN_JAIRON_STR)+MIN_JAIRON_STR
        );
    }

    /**
     *Override command for attack inherited from creature.
     *Calculate and return a damage value.
     *
     *@return the damage dealt by this particular kind of creature. In the event of OHKO trigger, return (@code Interger.MAX_VALUE). In the event of a critical hit return an additional 75 damage as per Giant Superclass.
     */
    public int attack(){
        if (Math.random()<0.01){
            System.out.println("Feel the pain! As I rain blows on your brain!");
            return Integer.MAX_VALUE;
        }
        
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
        return "Jairon";
    }
}
