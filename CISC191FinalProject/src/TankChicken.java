


public class TankChicken extends PlayerChicken

{

	private int levelOfChicken;
	private int baseHealth;
	private int baseDefense;
	private int baseDamage;
	private int boneBalance = 1000;
	private int hungerBar;
	private Inventory playerInventory;
	
	/*
	 * Constructor to create the TankChicken with the attack, health, and defense of the 
	 * TankChicken
	 * @Parameter int levelOfChicken
	 */
	public TankChicken(int levelOfChicken)

	{
		// TODO Auto-generated constructor stub
		this.levelOfChicken = levelOfChicken;
		baseDamage = (levelOfChicken-1)*2 +5;
		baseHealth = (levelOfChicken-1)*2 + 35;
		baseDefense = (levelOfChicken-1)*2 + 15;
		
		hungerBar = 20;
		boneBalance = 1000;

	}



	@Override
	public int getBaseDamage()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBaseHealth()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBaseDefense()
	{
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean wearClawEquiment()
	{
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean wearBodyArmorEquipment()
	{
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean wearSpecialEquiment()
	{
		// TODO Auto-generated method stub
		return false;
	}







	@Override
	public boolean adoptHuman()
	{
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void setInventory()
	{
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean checkInventory()
	{
		// TODO Auto-generated method stub
		return false;
	}





}
