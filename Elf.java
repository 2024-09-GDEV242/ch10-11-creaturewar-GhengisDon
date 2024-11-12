
/**
 * Elf is a different kind of creature category. The private in formation here dictates the stat floor.
 * Additionally within the constructor there lies a creatureType string to reference that the object is whatever the specified is.
 * Additionally there exists a damage method call that is specific to only creatures that are elves.
 * DDC stands for "double damage chance".
 *
 * @author Don Santiago
 * @version 2024.11.11
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 25;
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
     */
    public int attack(){
        int baseDamage=super.attack();
        
        if(Math.random()<DDC){
            System.out.println("From the soil comes safety!");
            return baseDamage*2;
        }
        return baseDamage;
    }
}
