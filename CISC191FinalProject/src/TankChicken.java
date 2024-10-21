
<<<<<<< Updated upstream
public class tankChicken
=======
public class TankChicken extends PlayerChicken
>>>>>>> Stashed changes
{

	private int levelOfChicken = 1;
	private int baseHealth;
	private int currentHealthOfChicken;
	private int baseDefense;
	private int baseDamage;
	private int boneBalance = 1000;
	//private Human playerHuman = new Human(1);
	private Inventory playerInventory = new Inventory();
	
	/*
	 * Constructor to create the TankChicken with the attack, health, and defense of the 
	 * TankChicken
	 * @Parameter int levelOfChicken
	 */
	public TankChicken(int levelOfChicken)
	{
		// TODO Auto-generated constructor stub
		baseDamage = (levelOfChicken-1)*2 +5;
		baseHealth = (levelOfChicken-1)*2 + 35;
		baseDefense = (levelOfChicken-1)*2 + 15;
		
	}
	
	@Override
	public int getBaseDamage()
	{
		return baseDamage;
	}
	
	@Override
	public int getBaseHealth()
	{
		return baseHealth;
	}
	
	@Override
	public int getBaseDefense()
	{
		return baseDefense;
	}

}
