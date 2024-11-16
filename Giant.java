
/**
 * Giant is a child class of creature.
 * Giant also happens to be the super class to the following classes HillG, MossG, and Jairon.
 * Giant has a 15% chance to land a crit.
 * Superclasses such as this and Demon do not have to have override methods for names.
 *
 * @author Don Santiago
 * @version 2024.11.15
 */
public class Giant extends Creature
{
    private static final double Toss=0.15;
    private String creatureType;
    
    /**
     * Constructor for objects of class Giant
     */
    public Giant(int str,int hp)
    {
        super(str,hp);
        this.creatureType="Giant";
    }
    
    public int attack(){
        int baseDamage=super.attack();
        
        if (Math.random()<Toss){
            System.out.println("This mighty giant throws debris!");
            return baseDamage+75;
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
