
public class MeleeChicken
{
	
	private int levelOfChicken = 1;
	private int baseHealth;
	private int currentHealthOfChicken;
	private int baseDefense;
	private int baseDamage;
	private int boneBalance = 1000;
	//private Human playerHuman = new Human();
	private Inventory playerInventory = new Inventory();
	
	/*
	 * Creating a MeleeChicken constructor to set the base stats of the player
	 * @parameters int levelOfChicken
	 */

	public MeleeChicken(int levelOfChicken)
	{
		// TODO Auto-generated constructor stub
		baseDamage = (levelOfChicken-1)*2 +8;
		baseHealth = (levelOfChicken-1)*2 + 20;
		baseDefense = (levelOfChicken-1)*2 + 10;
		
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
