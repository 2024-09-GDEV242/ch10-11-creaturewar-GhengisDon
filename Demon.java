
/**
 * Write a description of class Demon here.
 *
 * @author Don Santiago
 * @version 2024.11.5
 */
public class Demon extends Creature
{
    private static final int MAX_DEMON_HP = 30;
    private static final int MIN_DEMON_HP = 10;
    private static final int MAX_DEMON_STR = 12;
    private static final int MIN_DEMON_STR = 4;
    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str, int hp)
    {
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }

}
