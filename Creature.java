import java.util.Random;

/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str).
 * 
 * we had to import the Random package so we can utilize a few new commands.
 * 
 * @author Don Santiago
 * @version 2024-11-11
 */

public abstract class Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // The current numberof hit points the creature has
    private Random random;  // This is to check and make sure that random values can be added.
    
    /**
     * default constructor - this should never actually run.
     * It is the job of dervived classes to set up the proper number of hit points and 
     * strength for the subclass
     */
    public Creature (){
        str=10;
        hp=10;
        max_hp = hp;
        random=new Random();
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * @param str// the strength of the creature, used to calculate damage
     * @param hp// the health of the creature at the start of the simulation, and the current health levels during battle
     * @param max_hp// this maximum hp of the creature
     * @param random// this will automatically assign random values within the realm of constraints of the class, and therefore the type of creature
     */
    public Creature (int str, int hp) {
        this.str=str;
        this.hp=hp;
        this.max_hp=hp;
        this.random=new Random();
    }
    
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        return random.nextInt(str)+1;
    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        return this.hp > 0;
    }
    
    /**
     * Is this creature knockedOut?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isKnockedOut() {
        return this.hp<=0;
    }
    
    /**
     * Get the current hp value of the creature
     * @return the current hp value
     */
    public int getHp(){
        return hp;
    }
    
    /**
     * Get a display name
     * @return display name that is easily readable for people
     */
    public String getDisplayName(){
        return this.getClass().getSimpleName();
    }
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * the if the damage value sets to anything negative it'll rewrite it zero (0)
     * the reason for this is to keep things tidy, also it's easier to change states if we only have to check for zero (0)
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        hp-=damage;
        if (hp<0){
            hp=0;
        }
    }
}
