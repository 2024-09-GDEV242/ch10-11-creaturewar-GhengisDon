
/**
 * Cyber is going to pass up information to Demon super class which will pass up information to the Creature super class.
 * There is nothing wildly different here with the exception of the the constructor.
 * For housekeeping every creature class regardless of area in the hierarchy will be stored as 
 * public variety (int str,int hp).
 *
 * @author Don Santiago
 * @version 2024.11.11
 */
public class Cyber extends Demon
{
    private static final int MAX_CYBER_HP = 100;
    private static final int MIN_CYBER_HP = 25;
    private static final int MAX_CYBER_STR = 40;
    private static final int MIN_CYBER_STR = 20;

    /**
     * Constructor for objects of class Cyber
     */
    public Cyber(int str,int hp)
    {
        super(Randomizer.nextInt(MAX_CYBER_HP-MIN_CYBER_HP)+MIN_CYBER_HP,    
            Randomizer.nextInt(MAX_CYBER_STR-MIN_CYBER_STR)+MIN_CYBER_STR);
    }

    /**
     *Override command for attacks
     */
    public int attack(){
    int baseDamage=super.attack();
    return baseDamage;    
    }
}
