
/**
 * Write a description of class HillG here.
 *
 * @author Don Santiago
 * @version 2024.11.11
 */
public class HillG extends Giant
{
    private static final int MAX_HILLG_HP = 110;
    private static final int MIN_HILLG_HP = 30;
    private static final int MAX_HILLG_STR = 35;
    private static final int MIN_HILLG_STR = 25;
    /**
     * Constructor for objects of class SandG
     */
    public HillG(int str,int hp)
    {
        super(
            Randomizer.nextInt(MAX_HILLG_HP-MIN_HILLG_HP)+MIN_HILLG_HP,    
            Randomizer.nextInt(MAX_HILLG_STR-MIN_HILLG_STR)+MIN_HILLG_STR);
    }

    /**
     *overrides
     */
    public int attack(){
    int baseDamage=super.attack();
    return baseDamage;    
    }
}
