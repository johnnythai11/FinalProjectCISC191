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


public class TankChicken extends PlayerChicken

{

	private int levelOfChicken;
	private int currentHealth;
	private int baseHealth;
	private int baseDefense;
	private int baseDamage;
	private int boneBalance;
	private int hungerBar;
	
	private Inventory playerInventory;
	private Equipment playerEquipment;

	/*
	 * Constructor to create the TankChicken with its base status of Attack, Defense, Health, BoneBalance, and hungerBar
	 * @parameters integer levelOfChicken
	 */
	public TankChicken(int levelOfChicken)

	{
		// TODO Auto-generated constructor stub
		
		playerInventory = new Inventory();
		playerEquipment = new Equipment();


		this.levelOfChicken = levelOfChicken;

		baseDamage = (levelOfChicken-1)*2 +5;

		currentHealth = (levelOfChicken-1)*2 + 35;
		baseHealth = (levelOfChicken-1)*2 + 35;

		baseDefense = (levelOfChicken-1)*2 + 15;

		hungerBar = 20;
		boneBalance = 1000;

	}
	
	@Override
	public void equipEquipmentItem(int indexX, int indexY)
	{
		Items inputItem = playerInventory.getItem(indexX, indexY);
		switch(inputItem.getItemType()) {
			
			case 0:
				playerEquipment.equipEquipmentItem(inputItem,0);
			case 1:
				playerEquipment.equipEquipmentItem(inputItem,1);
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
				if(inputItem.getItemTier() != 0)
				{
				playerEquipment.equipEquipmentItem(inputItem,3);
				}
				else
				{
					System.out.println("Can't equip, not right class");
				}
				
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
