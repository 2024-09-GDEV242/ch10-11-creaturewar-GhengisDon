
/**
 * Balrog is a boss varient creature similar to Jairon.
 * Balrog is a type of Demon which is a type of Creature.
 * Balrog attacks twice.
 * Balrog also can roll for crit chance as shared with all Demons.
 *
 * @author Don Santiago
 * @version 2024.11.15
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for object of a class titled "Balrog" -
     * We will assign randomly a strength value and a hit point value.
     * We will also assign its creature type here.
     * 
     * @param str, the strength value of a Balrog
     * @param hp, the hp value of a Balrog
     * 
     */
    public Balrog(int str, int hp)
    {
        super(
        
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }

    /**
     * Override command for attacks.
     * @return totalDamage is the summation of two different instances of attack.
     * The print line test here is to verify that two different damage totals were added up and returned.
     */
    public int attack(){
        int totalDamage=0; //placeholder for damage
        
        totalDamage+=super.attack(); //swipe 1
        totalDamage+=super.attack();//swipe 2
        System.out.println("Balrog swipes with mighty claws!");
        return totalDamage;
    }
    
    /**
     * Override command for name inherited from creature.
     * Replace the default name with whatever is written here in this field for each class.
     * 
     * @return a string that has a display name easily readable for non-machine folk.
     */
    public String getDisplayName(){
        return "Balrog";
    }
}