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

public abstract class PlayerChicken
{



	

	/*
	 * Constructor to create the Chicken class with the level input
	 * @Parameters integer level
	 */
	public PlayerChicken()
	{

	}
	public static int heartCounter;
	public Inventory playerInventory = new Inventory();
	public abstract void addExp(int exp);
	public abstract void levelUp();
	public abstract void setBalance(int balance);
	public abstract void updateHealth();
	public abstract void resetPlayer();
	public abstract void takeDamage(int enemyDamage);
	public abstract int dealDamage();
	public abstract void updateDamage();
	public abstract void updateDefense();
	public abstract void updateExpNeeded();
	public abstract int expBar();
	public abstract int getLevel();
	public abstract int getBaseDamage();
	public abstract int getBaseHealth();
	public abstract int getCurrentHealth();
	public abstract int getBaseDefense();
	public abstract int getHungerBar();
	public abstract int getBoneBalance();
	public abstract void setBaseHealth(int health);
	public abstract void equipEquipmentItem(int index);	
	public abstract int getExp();
	public abstract String toStringSave();
	public abstract int getCurrentExpGained();
	
}
