/**
 * Lead Author(s):
 * 
 * @author Full name; student ID
 * @author Full name; student ID
 *         <<Add additional lead authors here>>
 *
 *         Other Contributors:
 *         Full name; student ID or contact information if not in class
 *         <<Add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 *
 *         References:
 *         Morelli, R., & Walde, R. (2016).
 *         Java, Java, Java: Object-Oriented Problem Solving
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 *         <<Add more references here>>
 *
 *         Version: number or date
 *         2024-10-16
 *         jacobwiemann
 */

/**
 * 
 */
public abstract class PlayerChicken
{
	private int levelOfChicken = 1;
	private int healthOfChicken;
	private int damageOfChicken;
	private int defenseOfChicken;
	private int boneBalance = 1000;
	// private Human playerHuman;

	PlayerChicken()
	{

	}

	public int getLevel()
	{
		return levelOfChicken;
	}

	public void setLevel(int levelOfChicken)
	{
		this.levelOfChicken = levelOfChicken;
	}

	public int getHealth()
	{
		return healthOfChicken;
	}

	public void setHealth(int healthOfChicken)
	{
		this.healthOfChicken = healthOfChicken;
	}

	public int getChickenDamage()
	{
		return damageOfChicken;
	}

	public void setChickenDamage(int damageOfChicken)
	{
		this.damageOfChicken = damageOfChicken;
	}

	public int getDefense()
	{
		return defenseOfChicken;
	}

	public void setDefense(int defenseOfChicken)
	{
		this.defenseOfChicken = defenseOfChicken;
	}

	public int getBoneBalance()
	{
		return boneBalance;
	}

	public void setBoneBalance(int boneBalance)
	{
		this.boneBalance = boneBalance;
	}

	public abstract boolean wearClawEquiment();
	
	public abstract boolean wearBodyArmorEquipment();
	
	public abstract int buyFromStore();
	
	public abstract int sellToStore();
	
	public abstract boolean adoptHuman();

	public abstract boolean wearSpecialEquiment();
	
	public abstract void setInventory(/* items */);

	public abstract boolean checkInventory();
	

}
