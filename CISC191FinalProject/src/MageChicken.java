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
	
	
	/*
	 * Constructor to create the MageChicken with its base stats of Attack, Defense, Health, BoneBalance, and hungerBar
	 * @parameters integer levelOfChicken
	 */
	public MageChicken(int levelOfChicken)
	{
		
		this.levelOfChicken = levelOfChicken;
		baseDamage = (levelOfChicken-1)*2 +10;
		currentHealth = (levelOfChicken-1)*2 + 15;
		baseHealth = (levelOfChicken-1)*2 + 15;
		baseDefense = (levelOfChicken-1)*2 + 5;
		hungerBar = 20;
		boneBalance = 1000;

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
