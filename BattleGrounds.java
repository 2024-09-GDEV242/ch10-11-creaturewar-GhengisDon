import java.util.Random; //this is required so we can fill the "Armies" with random characters

/**
 * BattleGrounds class currently will create two different armies for the basic simulation.
 * We specifically are using array rather than arraylist here because we want to utilize static army sizes.
 * We will fill two arrays.
 * One contains Balrog, Hill Giant, Moss Giant, Cyber Demon, Jairon.
 * The other contains Humans and Elves.
 * 
 * @author Don Santiago
 * @version 2024.11.15
 */
public class BattleGrounds
{
    // instance variables - replace the example below with your own
    private static final int HUMANITY_ARMY_SIZE= 175; //Maximum army size consisting of humans and elves.
    private static final int ENEMY_ARMY_SIZE= 50; //Maximum army size consisting of Hill Giant, Moss Giant, Cyber Demon, Balrog, or Jairon.

    private Creature[] humanityArmy= new Creature[HUMANITY_ARMY_SIZE]; //used to actually make the collection of humanitys army.
    private Creature[] enemyArmy=new Creature[ENEMY_ARMY_SIZE]; //used to actually make collection of enemy armys.

    private Random random=new Random(); //necessity to roll for random values which will fill the creatures in both humanity army and enemy army.

    /**
     * Constructor for objects of class BattleGrounds
     */
    public BattleGrounds()
    {
        // initialise instance variables
        populateHumanityArmy(); //method call to popoulate humanities army
        populateEnemyArmy(); //method call to populate enemy army
    }

    /**
     * Method call to fill the HumanityArmy array.
     * The army is filled with either an elf or a human.
     * The total amount is counted and displayed on call.
     * There is a 40% chance of an elf.
     * There is a 60% chance of a human.
     * 
     * @param  none
     * @return void
     */
    public void populateHumanityArmy()
    {
        int elfCount=0;
        int humanCount=0;
        
        // put your code here
        for (int i=0; i<HUMANITY_ARMY_SIZE;i++)
        {
            int randomRoll=random.nextInt(10)+1; //roll number between 1 and 10
            
            if (randomRoll<=4)
            {
                humanityArmy[i]=new Elf(0,0); //if value is 4 and under spawn elf
                elfCount++;
            } 
            else 
            {
                humanityArmy[i]=new Human(0,0); //if value is 5 and above spawn human
                humanCount++;
            }
        }
        System.out.println("The Forces of Humanity have a composition of:");
        System.out.println("Humans: "+humanCount);
        System.out.println("Elves: "+ elfCount);
    }

    /**
     * Method call to fill the EnemyArmy array.
     * The army is filled with a mix of Balrog, Jairon, Moss Giant, Hill Giant, and Cyber Demons.
     * The total amount is counted and displayed upon call.
     * The for loop has the spawn percentages of the creatures.
     * There is a 5% chance of a Balrog.
     * There is a 5% chance of a Jairon.
     * There is a 15% chance of Hill Giant.
     * There is a 15% chance of a Moss Giant.
     * There is a 60% chance of a Cyber Demon.
     * 
     * @param none
     * @return void
     */
    public void populateEnemyArmy(){
    
        int balrogCount=0;
        int jaironCount=0;
        int mossGCount=0;
        int hillGCount=0;
        int cyberCount=0;
    
    
        for (int i=0; i<ENEMY_ARMY_SIZE;i++)
        {
            int randomRoll=random.nextInt(100)+1; //roll number between 1 and 100
            if (randomRoll <=5){
                enemyArmy[i]=new Balrog(0,0);
                balrogCount++;
            }else if (randomRoll<10){
                enemyArmy[i]=new Jairon(0,0);
                jaironCount++;
            }else if(randomRoll<40){
                if (random.nextBoolean()){
                    enemyArmy[i]=new MossG(0,0);
                    mossGCount++;
                }else{
                    enemyArmy[i]=new HillG(0,0);
                    hillGCount++;
                }
            }else{
                enemyArmy[i]=new Cyber(0,0);
                cyberCount++;
            }
        }
    
        System.out.println("Enemy Army contains:");
        System.out.println("Balrogs: " + balrogCount);
        System.out.println("Jairons: " + jaironCount);
        System.out.println("Moss Giants: " + mossGCount);
        System.out.println("Hill Giants: " + hillGCount);
        System.out.println("Cyber Demons: " + cyberCount);
    }

    /**
     * Simulate combat between The Army of Humanity versus The Enemy Army.
     * Additionally prints out combat values of damage and remaining hp of a creature.
     * Also displays message of when an creature has fallen and if it was replaced by another unit.
     * Finally it prints a message that displays the winner.
     *
     *@param none
     *@return void
     */
    public void combat(){

        int humanityIndex=0; //placeholder before its filled with entries from Humanities Army.
        int enemyIndex=0; //placeholder before its filled with entries from Enemy Army.

        Creature humanityCreature=null;
        Creature enemyCreature=null;
        
        //this loop sets up combat between armies
        while (humanityIndex<HUMANITY_ARMY_SIZE && enemyIndex<ENEMY_ARMY_SIZE){
            humanityCreature=humanityArmy[humanityIndex];
            enemyCreature=enemyArmy[enemyIndex];

            System.out.println("The "
                + humanityCreature.getDisplayName() 
                + " challanges the " + enemyCreature.getDisplayName()+("!"));
            
            //this loop sets up combat between creatures
            while(humanityCreature.isAlive() && enemyCreature.isAlive()){
                enemyCreature.takeDamage(humanityCreature.attack());
                humanityCreature.takeDamage(enemyCreature.attack());
                
                //display the results of combat
                System.out.println(humanityCreature.getDisplayName()+" attacked the "
                    + enemyCreature.getDisplayName()+" HP:"+enemyCreature.getHp());
                System.out.println(enemyCreature.getDisplayName()+" attacked the " 
                    + humanityCreature.getDisplayName()+" HP:"+humanityCreature.getHp());
            }

            //this handles cases when humanity loses a combatant
            if (!humanityCreature.isAlive()){
                System.out.println(humanityCreature.getDisplayName()+ " has been knocked out!");
                humanityIndex++;
                if (humanityIndex<HUMANITY_ARMY_SIZE){
                    System.out.println("Humanity sends in a new unit! They have sent in a "+humanityArmy[humanityIndex].getDisplayName()+"!");
                }
            }

            //this handles cases when enemy army loses a combatant
            if(!enemyCreature.isAlive()){
                System.out.println(enemyCreature.getDisplayName()+" has been knocked out!");
                enemyIndex++;
                if (enemyIndex<ENEMY_ARMY_SIZE){
                    System.out.println("Evil has spawned a new unit! They have summmoned a "+enemyArmy[enemyIndex].getDisplayName()+"!");
                }
            }

            //runs this when an army is defeated for win/loss message
            if(humanityIndex >= HUMANITY_ARMY_SIZE){
                System.out.println("It appears that the enemies of humanity have won! Dark times ahead.");
                break;
            } else if (enemyIndex >= ENEMY_ARMY_SIZE){
                System.out.println("Humanity has risen against its darkest foes! Congratulations!");

                break;
            }
        }
    }

}