
/**
 * Cyber is going to pass up information do demon which will pass up information to 
 *
 * @author Don Santiago
 * @version 2024.11.5
 */
public class Cyber extends Demon
{
    private static final int MAX_CYBER_HP = 60;
    private static final int MIN_CYBER_HP = 10;
    private static final int MAX_CYBER_STR = 16;
    private static final int MIN_CYBER_STR = 6;

    /**
     * Constructor for objects of class Cyber
     */
    public Cyber()
    {
        super(
            Randomizer.nextInt(MAX_CYBER_HP-MIN_CYBER_HP)+MIN_CYBER_HP,    
            Randomizer.nextInt(MAX_CYBER_STR-MIN_CYBER_STR)+MIN_CYBER_STR
        );
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //public int sampleMethod(int y)
    //{
        // put your code here
       // return x + y;
    //}
}
