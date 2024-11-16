
/**
 * Demon is a child class to Creature.
 * Demon is the parent class to both Cyber and Balrog.
 * Demon has a 5% chance to land a crit.
 * Superclasses such as this and Giant do not need to have override methods for names.
 *
 * @author Don Santiago
 * @version 2024.11.15
 */
public class Demon extends Creature
{
    private static final double APF=0.05;
    private String creatureType;

    /**
     * Constructor for objects of class Demon
     */
    public Demon(int str,int hp)
    {
        super(str,hp);
        this.creatureType="Demon";
    }
    
    /**
     * Override command for attacks.
     * This one offers a critical that does an additional flat fifty (50) damage to enemy available to every creature that inherits Demon classification.
     */
    public int attack(){
        int baseDamage=super.attack();
        
        if (Math.random()<APF){
            System.out.println("GGGRRRRRRRAAAAAWWWWGGGG");
            return baseDamage+50;
        }
        return baseDamage;
    }
    
    /**
     * Declare creature type
     */
    public String getCreatureType(){
        return creatureType;
    }
    
}
