
public class EnemyChicken {

	//  Fields
	
	private int maxHealth;
	private int currentHealth;
	private int levelOfChicken;
	private int defence;
	
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
		currentHealth = (int)(level * 0.5) + 10;
		defence = (int)(level * 0.5) + 10;
		
	}
	
	/**
	 * Constructs a chicken with random level, health equal to 20 times the level
	 */
	EnemyChicken()
	{
		int level = (int)(Math.random() * 50); 
		levelOfChicken = level +1;
		maxHealth = (int)(level * 0.5) + 10;
		currentHealth = (int)(level * 0.5) + 10;
		defence = (int)(level * 0.5) + 10;
	}
	/**
	 * Return's a damage number dependant on the level
	 * @return <int>
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
		// Checks if damage is greater than total defence, and defence is > 0
		if ((incomingDamage > defence) && (defence > 0))
		{
			defence = 0;
		}
		// Else if defence is not broken it decreases defence
		else if (defence != 0)
		{
			defence = defence - incomingDamage;
		}
		//finally if there is no defence, decrease current health
		else
		{
			currentHealth = currentHealth - incomingDamage;
			if (currentHealth < 0) // If the health is less than 0 set to 0
			{
				currentHealth = 0;
			}
		}
		
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
	 * Setter Method for <currentHealth>
	 * @param currentHealth Set <currentHealth>
	 */
	public void setCurrentHealth(int currentHealth)
	{
		this.currentHealth = currentHealth;
	}

	/**
	 * 
	 * @return <currentHealth>
	 */
	public int getCurrentHealth()
	{
		return currentHealth;
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
}
