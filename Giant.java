
/**
 * Write a description of class Giant here.
 *
 * @author Don Santiago
 * @version 2024.11.11
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
    
    public String getCreatureType(){
        return creatureType;
    }
    
}