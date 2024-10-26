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
	private int currentHealth;
	private int baseHealth;
	private int baseDefense;
	private int baseDamage;
	private int boneBalance;
	private int hungerBar;
	private int expBar;
	private Inventory playerInventory;
	private Equipment playerEquipment;
	
	
	/*
	 * Constructor to create the MageChicken with its base status of Attack, Defense, Health, BoneBalance, and hungerBar
	 * @parameters integer levelOfChicken 
	 */
	public MageChicken(int levelOfChicken)
	{
		
		playerInventory = new Inventory();
		playerEquipment = new Equipment();
		
		
		this.levelOfChicken = levelOfChicken;
		baseDamage = (levelOfChicken-1)*2 +10;
		currentHealth = (levelOfChicken-1)*2 + 15;
		baseHealth = (levelOfChicken-1)*2 + 15;
		baseDefense = (levelOfChicken-1)*2 + 5;
		hungerBar = 20;
		boneBalance = 1000;
		expBar = 100 + (levelOfChicken-1)*50;

	}
	
	@Override
	public int expBar()
	{

		return expBar;
	}
	
	
	@Override
	public void equipEquipmentItem(int indexX, int indexY)
	{
		Items inputItem = playerInventory.getItem(indexX, indexY);
		switch(inputItem.getItemType()) {
			
			case 0:
				playerEquipment.equipEquipmentItem(inputItem,0);
			case 1:
				System.out.println("Can't equip, not right class");
			case 2:
				if(inputItem.getItemTier() != 0)
				{
					playerEquipment.equipEquipmentItem(inputItem,2);
				}
				else
				{
					System.out.println("Can't equip, not right class");
				}
			case 3:
			
				playerEquipment.equipEquipmentItem(inputItem,3);
			
				
		}
	}

	@Override
	public String toString()
	{
		return "Level of Chicken: " + levelOfChicken + "\n" +
				"Attack Stat: " + baseDamage + "\n" +
				"Defense Stat: " + baseDefense + "\n" +
				"Health Stat: " + currentHealth + "\n" +
				"Hunger Bar: " + hungerBar + "\n" +
				"Bone Balance: " + boneBalance + "\n";
	}



	@Override
	public int getLevel()
	{

		return levelOfChicken;
	}

	@Override
	public int getBaseHealth()
	{
		return baseHealth;
	}

	@Override
	public int getCurrentHealth()
	{
		return currentHealth;
	}

	@Override
	public int getBaseDamage()
	{
		return baseDamage;
	}


	@Override
	public int getBaseDefense()
	{
		return baseDefense;
	}

	@Override 
	public int getBoneBalance()
	{
		return boneBalance;
	}

	@Override
	public int getHungerBar()
	{
		return hungerBar;
	}

}
