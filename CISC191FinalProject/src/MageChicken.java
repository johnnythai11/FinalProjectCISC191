/**
* Lead Author(s):
* @author Full name; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: number or date
* 2024-10-16
* jacobwiemann
*/

/**
 * 
 */
public class MageChicken extends PlayerChicken
{
	
	private int levelOfChicken = 1;
	private int baseHealth;
	private int currentHealthOfChicken;
	private int baseDefense;
	private int baseDamage;
	private int boneBalance = 1000;
	//private Human playerHuman = new Human();
	private Inventory playerInventory = new Inventory();
	
	public MageChicken(int levelOfChicken)
	{
		// TODO Auto-generated constructor stub
		baseDamage = (levelOfChicken-1)*2 +10;
		baseHealth = (levelOfChicken-1)*2 + 15;
		baseDefense = (levelOfChicken-1)*2 + 5;
		
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

}
