package model;

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
	private int currentExp;
	public Inventory playerInventory;
	private Equipment playerEquipment;
	
	
	/*
	 * Constructor to create the MageChicken with its base status of Attack, Defense, Health, BoneBalance, and hungerBar
	 * @parameters integer levelOfChicken 
	 */
	public MageChicken(int levelOfChicken)
	{
	
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
	
	/*
	 * Equips the Items from the inventory
	 * @parameter int indexX, int indexY
	 */
	@Override
	public void equipEquipmentItem(int index)
	{
		Items inputItem = playerInventory.getItem(index);
		switch(inputItem.getItemType()) {
			
			case 0:
				playerEquipment.equipEquipmentItem(inputItem,0);
				break;
			case 1:
				System.out.println("Can't equip, not right class");
				break;
			case 2:
				if(inputItem.getItemTier() != 0)
				{
					playerEquipment.equipEquipmentItem(inputItem,2);
				}
				else
				{
					System.out.println("Can't equip, not right class");
				}
				break;
			case 3:
			
				playerEquipment.equipEquipmentItem(inputItem,3);
				break;
			
				
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
	public String toStringSave()
	{
		/*
		 * Order of data:
		 * Level
		 * Attack statistic
		 * defense statistic
		 * health statistic
		 * hunger bar
		 * bone balance
		 * exp bar
		 */
		
		
		return "{" + levelOfChicken +
				"," + baseDamage + 
				"," + baseDefense + 
				"," + currentHealth + 
				"," + hungerBar + 
				"," + boneBalance + 
				"," + expBar + "}";
	}
	
	public void resetPlayer()
	{
		updateDamage();
		updateDefense();
		updateHealth();
	}
	
	
	
	@Override
	public void setBalance(int newBalance)
	{
		boneBalance = newBalance;
	}
	
	public void takeDamage(int enemyDamage)
	{
		
		if ((enemyDamage > baseDefense) && baseDefense > 0)
		{
			baseDefense = 0;
		}
		// Else if defense is not broken it decreases defense
		else if (baseDefense != 0)
		{
			baseDefense = baseDefense - enemyDamage;
		}
		//finally if there is no defense, decrease current health
		else if (baseDefense == 0 && currentHealth != 0 && currentHealth > 0)
		{
			currentHealth = currentHealth - enemyDamage;
		}
		
		if (currentHealth <= 0)
		{
			currentHealth = 0;
		}
	}
	
	public void updateHealth()
	{
		baseHealth = (levelOfChicken-1)*2 + 15 + (heartCounter * 10);
		currentHealth = baseHealth;
	}
	
	public int dealDamage()
	{
		updateDamage();
		return baseDamage;
	}

	public void updateDefense()
	{
		baseDefense = (levelOfChicken-1)*2 + 5 + playerEquipment.getItemStat(2);
	}
	
	public void updateDamage()
	{
		baseDamage = (levelOfChicken-1)*2 +10 + playerEquipment.getItemStat(3);
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
	
	@Override
	public void setBaseHealth(int health)
	{
		this.baseHealth = health;
		
	}

	@Override
	public void addExp(int exp) {
		this.currentExp = exp;
	}

	@Override
	public void levelUp() {
		int level = this.levelOfChicken;
		int xpBar = 100 + (level-1)*50;
		int currentXp = this.currentExp;
		if(currentXp >= xpBar) {
			levelOfChicken++;
			resetPlayer();
		}
	}

	@Override
	public int getExp()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
