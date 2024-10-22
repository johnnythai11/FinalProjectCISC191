
public class MeleeChicken extends PlayerChicken
{
<<<<<<< Updated upstream
=======
	
	private int levelOfChicken;
	private int baseHealth;
	//private int currentHealthOfChicken;
	private int baseDefense;
	private int baseDamage;
	private int boneBalance;
	private int hungerBar;
	//private Human playerHuman = new Human();
	//private Inventory playerInventory;
	
	/*
	 * Creating a MeleeChicken constructor to set the base stats of the player
	 * @parameters int levelOfChicken
	 */
>>>>>>> Stashed changes

	public MeleeChicken()
	{
		// TODO Auto-generated constructor stub
<<<<<<< Updated upstream
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
	public int buyFromStore()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sellToStore()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean adoptHuman()
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
	public void setInventory()
	{
		// TODO Auto-generated method stub
=======
		this.levelOfChicken = levelOfChicken;
		
		baseDamage = (levelOfChicken-1)*2 +8;
		baseHealth = (levelOfChicken-1)*2 + 20;
		baseDefense = (levelOfChicken-1)*2 + 10;
		hungerBar = 50;
		boneBalance = 1000;
>>>>>>> Stashed changes
		
		
	}
	
	@Override
	public String toString()
	{
		return "Level of Chicken: " + levelOfChicken + "\n" +
				"Attack Stat: " + baseDamage + "\n" +
				"Defense Stat: " + baseDefense + "\n" +
				"Hunger Bar: " + hungerBar + "\n" +
				"Bone Balance: " + boneBalance + "\n";
	}
<<<<<<< Updated upstream
=======
	
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
	public int buyFromStore()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sellToStore()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean adoptHuman()
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
	
	public static void main(String args[])
	{
		PlayerChicken melee = new MeleeChicken(50);
		
		System.out.println(melee.toString());
	}
	
	
>>>>>>> Stashed changes

	@Override
	public boolean checkInventory()
	{
		// TODO Auto-generated method stub
		return false;
	}

}
