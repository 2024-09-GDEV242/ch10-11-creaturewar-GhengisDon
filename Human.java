/**
 * Human is a kind of creature.
 * 
 * @author Don Santiago
 * @version 2024.11.15
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
     * We will assign randomly a strength value and a hit point value.
     * We will also assign its creature type here.
     * 
     * @param str, the strength value of a human
     * @param hp, the hp value of a human
     * 
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
     *Override command for attack inherited from creature.
     *Calculate and return a damage value.
     *
     *@return the damage dealt by this particular kind of creature.
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
        return "Human";
    }
}
