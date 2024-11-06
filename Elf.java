
/**
 * Write a description of class Elf here.
 *
 * @author Don Santiago
 * @version 2024.11.5
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 130;
    private static final int MIN_ELF_HP = 25;
    private static final int MAX_ELF_STR = 22;
    private static final int MIN_ELF_STR = 4;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
    }

}
