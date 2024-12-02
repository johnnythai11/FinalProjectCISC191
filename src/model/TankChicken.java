package model;

import view.CombatView;

/**
 * Lead Author(s):
 * 
 * @author Full name: Johnny Thai
 * @author Full name: Jacob Wiemann
 * @author Full name: Daniel Soto
 *
 *         Other Contributors: none
 *
 *         References:
 *         Morelli, R., & Walde, R. (2016).
 *         Java, Java, Java: Object-Oriented Problem Solving
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 *         Version: 2024-10-16
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
	private int expBar;
	private int currentExp;

	private Equipment playerEquipment;
	private Human humanBoost;
	private int attackBoost;
	private int defenseBoost;
	private int experienceCounter;

	public PlayerChicken player;

	/*
	 * Constructor to create the TankChicken with its base status of Attack,
	 * Defense, Health, BoneBalance, and hungerBar
	 * @parameters integer levelOfChicken
	 */
	public TankChicken(int levelOfChicken)

	{

		playerEquipment = new Equipment();
		this.levelOfChicken = levelOfChicken;

		this.levelOfChicken = levelOfChicken;
		if (1 <= this.levelOfChicken && this.levelOfChicken <= 10)
		{
			humanBoost = new Human(1);
			attackBoost = humanBoost.getAttackBoost();
			defenseBoost = humanBoost.getDefenseBoost();

		}
		else if (11 <= this.levelOfChicken && this.levelOfChicken <= 20)
		{
			humanBoost = new Human(2);
			attackBoost = humanBoost.getAttackBoost();
			defenseBoost = humanBoost.getDefenseBoost();

		}
		else if (21 <= this.levelOfChicken && this.levelOfChicken <= 30)
		{
			humanBoost = new Human(3);
			attackBoost = humanBoost.getAttackBoost();
			defenseBoost = humanBoost.getDefenseBoost();

		}
		else if (31 <= this.levelOfChicken && this.levelOfChicken <= 40)
		{
			humanBoost = new Human(4);
			attackBoost = humanBoost.getAttackBoost();
			defenseBoost = humanBoost.getDefenseBoost();

		}
		else if (41 <= this.levelOfChicken)
		{
			humanBoost = new Human(5);
			attackBoost = humanBoost.getAttackBoost();
			defenseBoost = humanBoost.getDefenseBoost();

		}
		baseDamage = (levelOfChicken - 1) * 2 + 5 + attackBoost;
		currentHealth = (levelOfChicken - 1) * 2 + 35;
		baseHealth = (levelOfChicken - 1) * 2 + 35;
		baseDefense = (levelOfChicken - 1) * 2 + 15 + defenseBoost;
		hungerBar = 20;
		boneBalance = 1000;
		expBar = 100 + (levelOfChicken - 1) * 50;

	}

	public boolean isItemEquipped(int index)
	{
		return playerEquipment.isItemEquipped(index);
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
		Items inputItem = CombatView.player.playerInventory.getItem(index);
		switch (inputItem.getItemType())
		{

			case 0:
				playerEquipment.equipEquipmentItem(inputItem, 0);
				break;
			case 1:
				playerEquipment.equipEquipmentItem(inputItem, 1);
				break;
			case 2:
				if (inputItem.getItemTier() != 0)
				{
					playerEquipment.equipEquipmentItem(inputItem, 2);
				}
				else
				{
					System.out.println("Can't equip, not right class");
				}
				break;

			case 3:
				if (inputItem.getItemTier() != 0)
				{
					playerEquipment.equipEquipmentItem(inputItem, 3);
				}
				else
				{
					System.out.println("Can't equip, not right class");
				}
				break;

		}
	}
	
	public Items getEquippedItem (int index)
	{
		return playerEquipment.getEquippedItem(index);
	}

	@Override
	public void setBalance(int newBalance)
	{
		boneBalance = newBalance;
	}

	public void resetPlayer()
	{
		updateDamage();
		updateDefense();
		updateHealth();
		updateExpNeeded();
	}

	public int dealDamage()
	{
		updateDamage();
		return baseDamage;
	}

	public void updateHealth()
	{
		baseHealth = (levelOfChicken - 1) * 2 + 35 + (heartCounter * 10);
		currentHealth = baseHealth;
	}

	public void updateDefense()
	{
		baseDefense = (levelOfChicken - 1) * 2 + 15
				+ playerEquipment.getItemStat(2)
				+ playerEquipment.getItemStat(1) + defenseBoost;
	}

	public void updateDamage()
	{
		baseDamage = (levelOfChicken - 1) * 2 + 5
				+ playerEquipment.getItemStat(3) + attackBoost;
	}

	public void updateExpNeeded()
	{
		expBar = 100 + (levelOfChicken - 1) * 50;
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
		// finally if there is no defense, decrease current health
		else if (baseDefense == 0 && currentHealth != 0 && currentHealth > 0)
		{
			currentHealth = currentHealth - enemyDamage;
		}

		if (currentHealth <= 0)
		{
			currentHealth = 0;
		}
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
	public void setBaseHealth(int health)
	{
		this.baseHealth = health;

	}

	public static void main(String args[])

	{
		PlayerChicken tank = new TankChicken(49);

		System.out.println(tank);
	}

	@Override
	public void addExp(int exp)
	{
		this.currentExp = exp;
	}

	@Override
	public int getCurrentExpGained()
	{
		return this.currentExp;
	}

	@Override
	public int getExp()
	{

		return this.expBar;
	}

	@Override
	public void levelUp()
	{

		levelOfChicken++;
		resetPlayer();

	}

	@Override
	public int getExperienceCounter()
	{
		return this.experienceCounter;
	}

	@Override
	public void addExperienceCounter(int add)
	{
		this.experienceCounter = this.experienceCounter + add;
	}

	@Override
	public void setExperienceCounter(int add)
	{
		this.experienceCounter = add;
	}

}
