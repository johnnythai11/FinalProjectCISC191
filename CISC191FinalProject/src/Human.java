
public class Human
{
<<<<<<< Updated upstream
	int level = 1; 
	double statBoostHealth = 0;
	double statBoostAttack = 0;
	double statBoostDefense = 0;
	int boostHungerBar = 0;
=======
	private Array[][] mapLocationOfHuman = {};
	private int level = 1; 
	private int statBoostAttack = 0;
	private int statBoostDefense = 0;
	private int boostHungerBar = 50;
//	private PlayerChicken chickenLevel;
>>>>>>> Stashed changes
	
/*
 * Constructor for a Human with all the boost stats Attack, Defense, hungerBarBoost, 
 * level of the human
 * @Parameter int level
 */
	public Human(int level)
	{
		this.getDefenseBoost();
		this.getAttackBoost();
		this.setHumanLevel(level);
		this.getHumanLevel();
		this.getGainHungerBar();
	}
	
<<<<<<< Updated upstream
	public int getLevel()
=======
	public Array[][] getHumanLocation()
	{
		return mapLocationOfHuman;
	}
	
	/*
	 * Human will be on the left side of the player chicken
	 */
	public void setHumanLocation()
	{
		
	}
	
	/*
	 * gets the level of the human for the PlayerChicken
	 * @Return Level
	 */
	public int getHumanLevel()
>>>>>>> Stashed changes
	{
		return level;
	}
	
<<<<<<< Updated upstream
	public void setLevel(int x)
	{
		level = x;
	}
=======
	/*
	 * human level is dependent on the chicken Level
	 * chicken level 1-10 can be assigned level 1 human
	 * chicken level 11-20 can be assigned level 2 human
	 * chicken level 21-30 can be assigned level 3 human
	 * chicken level 31-40 can be assigned level 4 human
	 * chicken level 41-50 can be assigned level 5 human
	 * Sets the level of the human between 1-5
	 * @Parameter int levelOfHuman
	 */
	public void setHumanLevel(int levelOfHuman)
	{
		if (levelOfHuman > 0 && levelOfHuman < 6)
		{
		this.level = levelOfHuman;
		}
		else
		{
	    this.level = 1;
		}
//		if (chickenLevel.getLevel() < 11 && chickenLevel.getLevel() > 0)
//		{
//			level = 1;
//		}
//		else if (chickenLevel.getLevel() < 21 && chickenLevel.getLevel() > 10)
//		{
//			level = 2;
//		}
//		else if (chickenLevel.getLevel() < 31 && chickenLevel.getLevel() > 20)
//		{
//			level = 3;
//		}
//		
//		else if (chickenLevel.getLevel() < 41 && chickenLevel.getLevel() > 30)
//		{
//			level = 4;
//		}
//		else if (chickenLevel.getLevel() < 51 && chickenLevel.getLevel() > 40)
//		{
//			level = 5;
//		}
		
		
	}
	
	/*
	 * Gets the hunger bar boost stat which  is 50 for the PlayerChicken
	 * @Return int boostHungerBar;
	 */
	public int getGainHungerBar()
	{
		return boostHungerBar;
	}
	
//	/*
//	 * level 1-5 human will fill hunger bar
//	 */
//	public void setGainHungerBar()
//	{
//		boostHungerBar = 50;
//	}
	
	public double getAttackBoost()
	{
		return statBoostAttack;
		
	}
	
	/*
	 * level 1 human will boost playerChicken attack by 0
	 * level 2 human will boost playerChicken attack by 2
	 * level 3 human will boost playerChicken attack by 4
	 * level 4 human will boost playerChicken attack by 6
	 * level 5 human will boost playerChicken attack by 8
	 * @parameters int level
	 */
	public void setAttackBoost(int level)
	{
		statBoostAttack = level*2 - 2;
	}
	
	/*
	 * Gets the defense boost stat of the human 
	 * @return int statBoostDefense
	 */
	public int getDefenseBoost()
	{
		return statBoostDefense;
		
	}
	
	/*
	 * level 1 human will boost playerChicken defense by 0
	 * level 2 human will boost playerChicken defense by 0
	 * level 3 human will boost playerChicken defense by 0
	 * level 4 human will boost playerChicken defense by 6
	 * level 5 human will boost playerChicken defense by 8
	 * @Parameter int level
	 */
	public void setDefenseBoost(int level)
	{
		if (level > 0 && level < 4)
		{
			statBoostDefense = 0;
		}
		if (level == 4 || level == 5)
		{
		statBoostDefense = level*2 - 2;
		}
		
	
	}
	
>>>>>>> Stashed changes

}
