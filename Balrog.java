
/**
 * Write a description of class Balrog here.
 *
 * @author Don Santiago
 * @version 2024.11.5
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 640;
    private static final int MIN_BALROG_HP = 640;
    private static final int MAX_BALROG_STR = 22;
    private static final int MIN_BALROG_STR = 6;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
            super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //public int sampleMethod(int y)
    {
        // put your code here
    //   return x + y;
    }
}
