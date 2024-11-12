
/**
 * Write a description of class Jairon here.
 *
 * @author Don Santiago
 * @version 2024.11.11
 */
public class Jairon extends HillG
{
    private static final int MAX_JAIRON_HP = 300;
    private static final int MIN_JAIRON_HP = 120;
    private static final int MAX_JAIRON_STR = 130;
    private static final int MIN_JAIRON_STR = 80;
    /**
     * Constructor for objects of class Jairon
     */
    public Jairon(int str,int hp)
    {
        super(
        
            Randomizer.nextInt(MAX_JAIRON_HP-MIN_JAIRON_HP)+MIN_JAIRON_HP,    
            Randomizer.nextInt(MAX_JAIRON_STR-MIN_JAIRON_STR)+MIN_JAIRON_STR
        );
    }

    /**
     * overrides
     */
    public int attack(){
        if (Math.random()<0.01){
            System.out.println("Feel the pain! As I rain blows on your brain!");
            return Integer.MAX_VALUE;
        }
        
    int baseDamage=super.attack();
    
    return baseDamage;
    }
}
