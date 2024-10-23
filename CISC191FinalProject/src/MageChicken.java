/**
* Lead Author(s):
* @author Full name: Johnny Thai
* @author Full name: Jacob Wiemann
* @author Full name: Daniel Soto
*
* Other Contributors: none
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* Version: 2024-10-16
* 
*/

public class MageChicken extends PlayerChicken
{

	
	private int levelOfChicken;
	private int baseHealth;
	private int baseDefense;
	private int baseDamage;
	private int boneBalance = 1000;
	private int hungerBar;
	private Inventory playerInventory;
	
	
	public MageChicken(int levelOfChicken)
	{
		// TODO Auto-generated constructor stub
		this.levelOfChicken = levelOfChicken;
		baseDamage = (levelOfChicken-1)*2 +10;
		baseHealth = (levelOfChicken-1)*2 + 15;
		baseDefense = (levelOfChicken-1)*2 + 5;
		
		hungerBar = 20;
		boneBalance = 1000;

		
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


}
