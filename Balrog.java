
/**
 * Balrog is going to pass up information to Demon which will pass up information to Creature
 * This particular demon is different because of its attack method.
 * 
 *
 * @author Don Santiago
 * @version 2024.11.11
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
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
     * @param totalDamage is the summation of two different instances of attack.
     * The print line test here is to verify that two different damage totals were added up and returned.
     */
    public int attack(){
        int totalDamage=0; //placeholder for damage
        
        totalDamage+=super.attack(); //swipe 1
        totalDamage+=super.attack();//swipe 2
        System.out.println("Balrog swipes with mighty claws!");
        return totalDamage;
    }
}
