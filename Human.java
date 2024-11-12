/**
 * Human is a kind of creature category. The private in formation here dictates the stat floor.
 * Additionally within the constructor there lies a creatureType string to reference that the object is whatever the specified is.
 * 
 * @author Don Santiago
 * @version 2024.11.11
 */
public class Human extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_HUMAN_HP = 18;
    private static final int MIN_HUMAN_HP = 10;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;
    private String creatureType;

    /**
     * Constructor for object of a class titled "Human" -
     * specifically we will store str value as well as hp value
     * additionally we will also specify the creature type as a Human which may be referenced later down the line
     */
    public Human(int str, int hp)
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_HUMAN_HP-MIN_HUMAN_HP)+MIN_HUMAN_HP,    
            Randomizer.nextInt(MAX_HUMAN_STR-MIN_HUMAN_STR)+MIN_HUMAN_STR);
            
            this.creatureType="Human";
    }
    
    /**
     *Override command for attacks
     */
    public int attack(){
    int baseDamage=super.attack();
    return baseDamage;    
    }
}
