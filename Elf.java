
/**
 * Elf is a kind of creature.
 * Elf happens to also have the ability to roll for critcal hit chance.
 *
 * @author Don Santiago
 * @version 2024.11.15
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 15;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    
    private static final double DDC=0.1; //DDC is short for Double Damage Chance
    private String creatureType;

    /**
     * Constructor for objects of class Elf
     */
    public Elf(int str, int hp)
    {
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR);
            
            this.creatureType="Elf";
    }
    
    /**
    * Override commands for attacks
    * The reason why there is system out println is to telegraph to the player that crit was achieved.
    * Math.Random is used here to just roll a value between zero to one (0 to 1)
    * 
    * Calculate and return a damage value.
    * @return the damage dealt by this particular kind of creature. In the event of a critcal hit return double damage.
    */
    public int attack(){
        int baseDamage=super.attack();
        
        if(Math.random()<DDC){
            System.out.println("From the soil comes safety!");
            return baseDamage*2;
        }
        return baseDamage;
    }
    
    /**
     * Override command for name inherited from creature.
     * Replace the default name with whatever is written here in this field for each class.
     * 
     * @return a string that has a display name easily readable for non-machine folk.
     */
    public String getDisplayName(){
        return "Elf";
    }
}
