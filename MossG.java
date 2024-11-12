
/**
 * Write a description of class MossG here.
 *
 * @author Don Santiago
 * @version 2024.11.11
 */
public class MossG extends Giant
{
    private static final int MAX_MOSSG_HP = 120;
    private static final int MIN_MOSSG_HP = 40;
    private static final int MAX_MOSSG_STR = 50;
    private static final int MIN_MOSSG_STR = 30;
    /**
     * Constructor for objects of class StoneG
     */
    public MossG(int str,int hp)
    {
        super(
            Randomizer.nextInt(MAX_MOSSG_HP-MIN_MOSSG_HP)+MIN_MOSSG_HP,    
            Randomizer.nextInt(MAX_MOSSG_STR-MIN_MOSSG_STR)+MIN_MOSSG_STR);
    }

    /**
     *overrides
     */
    public int attack(){
    int baseDamage=super.attack();
    return baseDamage;    
    }
}
