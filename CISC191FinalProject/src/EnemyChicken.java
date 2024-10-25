

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
public class EnemyChicken {

	//  Fields
	private int maxHealth;
	private int attack;
	private int levelOfChicken;
	private int defense;
	private int level;

	//Constructors
	/**
	 * Constructs an enemyChicken
	 * @param level Input the level of the generated chicken
	 * @param health Input the health of the generated chicken
	 */
	EnemyChicken(int level)
	{
		levelOfChicken = level;
		maxHealth = (int)(level * 0.5) + 10;
		attack = (int)(level * 0.5) + 10;
		defense = (int)(level * 0.5) + 10;

	}

	/**
	 * Constructs a chicken with random level, health equal to 20 times the level
	 */
	EnemyChicken()
	{
		level = (int)(Math.random() * 50); 
		levelOfChicken = level;
		maxHealth = (int)(level * 0.5) + 10;
		attack = (int)(level * 0.5) + 10;
		defense = (int)(level * 0.5) + 10;
	}

	@Override
	public String toString()
	{
		return "Level of Enemy: " + level + "\n" +
				"Health: " + maxHealth + "\n" + 
				"Attack Damage: " + attack + "\n" +
				"Defense: " + defense;

	}
	/**
	 * Return's a damage number dependent on the level
	 * @return integer
	 */
	public int doDamage()
	{
		return (int)(levelOfChicken * 0.5) + 10;
	}
	/**
	 * Calculate incoming damage for the chicken
	 * @param incomingDamage Damage incoming to the chicken
	 */
	public void takeDamage(int incomingDamage)
	{
		// Checks if damage is greater than total defense, and defense is > 0
		if ((incomingDamage > defense) && (defense > 0))
		{
			defense = 0;
		}
		// Else if defense is not broken it decreases defense
		else if (defense != 0)
		{
			defense = defense - incomingDamage;
		}
		//finally if there is no defense, decrease current health
		else
		{
			maxHealth = maxHealth - incomingDamage;
			if (maxHealth < 0) // If the health is less than 0 set to 0
			{
				maxHealth = 0;
			}
		}

	}

	public int getDefense()
	{
		return defense;
	}
	//generates random chicken
	public static EnemyChicken generateChicken()
	{
		
		return new EnemyChicken();
	}
	
	
	// Getters And Setters
	/**
	 * Setter Method for <maxHealth>
	 * @param health Set <maxHealth>
	 */
	public void setMaxHealth(int health)
	{
		maxHealth = health;
	}
	/**
	 * 
	 * @return <maxHealth>
	 */
	public int getMaxHealth()
	{
		return maxHealth;
	}


	/**
	 * 
	 * @param level Set <level>
	 */
	public void setLevelOfChicken(int level)
	{
		levelOfChicken = level;
	}

	/**
	 * 
	 * @return <levelOfChicken>
	 */
	public int getLevelOfChicken()
	{
		return levelOfChicken;
	}

	public static void main(String args[])
	{
//		EnemyChicken level = new EnemyChicken();
//		System.out.println(level.toString());

	}
}
