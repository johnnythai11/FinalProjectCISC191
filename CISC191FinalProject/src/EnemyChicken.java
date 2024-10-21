
public class EnemyChicken {

	//  Fields
	
	private int maxHealth;
	private int currentHealth;
	private int levelOfChicken;
	private int defence;
	private int attack;
	
	//Constructors
	/**
	 * Constructs an enemyChicken with the level input
	 * @param int level 
	 */
	EnemyChicken(int level)
	{
		levelOfChicken = level;
		maxHealth = (int)(level * 0.5) + 10;
		currentHealth = (int)(level * 0.5) + 10;
		defence = (int)(level * 0.5) + 10;
		attack = (int)(level * 0.5) + 10;
		
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
		attack = (int)(level * 0.5) + 10;
	}
	/**
	 * Return's a damage number dependant on the level
	 * @return int 
	 */
	public int doDamage()
	{
		attack = (int)(levelOfChicken * 0.5) + 10;
		
		return attack;
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
	 * Sets the max health of the EnemyChicken
	 * @param health Set <maxHealth>
	 */
	public void setMaxHealth(int health)
	{
		maxHealth = health;
	}
	/**
	 * Gets the max health of the EnemyChicken
	 * @return <maxHealth>
	 */
	public int getMaxHealth()
	{
		return maxHealth;
	}

	/**
	 * Sets the current health of the EnemyChicken
	 * @param int currentHealth 
	 */
	public void setCurrentHealth(int currentHealth)
	{
		this.currentHealth = currentHealth;
	}

	/**
	 * Gets the current health of the EnemyChicken
	 * @return int currentHealth
	 */
	public int getCurrentHealth()
	{
		return currentHealth;
	}
	/**
	 * Sets the level of the EnemyChicken
	 * @param int level
	 */
	public void setLevelOfChicken(int level)
	{
		levelOfChicken = level;
	}
	
	/**
	 * Gets the level of the EnemyChicken
	 * @return int level
	 */
	public int getLevelOfChicken()
	{
		return levelOfChicken;
	}
}
