
/**
 * Demon is a child class to Creature.
 * Demon is the parent class to both Cyber and Balrog.
 * With this being said the role of this class is to give certain behaviors to certain classes.
 * Within the constructor we store an hp value and str value which we will recieve from child classes.
 * Within the constructor we assign that objects that are extentions of this class are given "Demon" classification.
 * Within the attack method of this class we give all objects that have "Demon" classification the ability to hit a crit.
 * ADP is short for "Additional Plus Fifty".
 *
 * @author Don Santiago
 * @version 2024.11.11
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
    
    public String getCreatureType(){
        return creatureType;
    }
    
}
