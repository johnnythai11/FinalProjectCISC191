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
	//private int currentHealthOfChicken;
	private int defenseOfChicken;
	private int boneBalance = 1000;
<<<<<<< Updated upstream
	private Human playerHuman = new Human();
	private Inventory playerInventory = new Inventory();
=======
	//private Human playerHuman = new Human();
	//private Inventory playerInventory;
>>>>>>> Stashed changes

	PlayerChicken()
	{
//		setLevel(level);
//		getLevel();
//		
//		setHealth(level);
//		getHealth();
//		setAttack(level);
//		getAttack();
//		setDefense(level);
//		getDefense();
		

	}
	
	@Override
	public String toString()
	{
		return "Level: " + getLevel() + " ";
		}
	/*
	 * Gets the level of the PlayerChicken
	 */

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

	public int getAttack()
	{
		return baseDamage;
	}

	public void setAttack(int damageOfChicken)
	{
		this.baseDamage = damageOfChicken;
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
	
//	public void takeDamage(int incomingDamage)
//	{
//		// Checks if damage is greater than total defence, and defence is > 0
//		if ((incomingDamage > defenseOfChicken) && (defenseOfChicken > 0))
//		{
//			defenseOfChicken = 0;
//		}
//		// Else if defence is not broken it decreases defence
//		else if (defenseOfChicken != 0)
//		{
//			defenseOfChicken = defenseOfChicken - incomingDamage;
//		}
//		//finally if there is no defence, decrease current health
//		else
//		{
//			healthOfChicken = healthOfChicken - incomingDamage;
//			if (healthOfChicken < 0) // If the health is less than 0 set to 0
//			{
//				healthOfChicken = 0;
//			}
//		}
//		
//   }
	public abstract boolean wearClawEquiment();
	public abstract boolean wearBodyArmorEquipment();
	public abstract boolean wearSpecialEquiment();
	
	public abstract int buyFromStore();
	public abstract int sellToStore();
	
	public abstract boolean adoptHuman();
	
	public abstract void setInventory();
	public abstract boolean checkInventory();
	
<<<<<<< Updated upstream
=======
	public abstract int getBaseDamage();
	public abstract int getBaseHealth();
	public abstract int getBaseDefense();
	

	
	
>>>>>>> Stashed changes

}
