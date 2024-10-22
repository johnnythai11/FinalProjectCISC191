import java.lang.reflect.Array;

public class Human 
{
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
	private Array[][] mapLocationOfHuman = {};
	private int level = 1; 
	private int statBoostHealth = 0;
	private int statBoostAttack = 0;
	private int statBoostDefense = 0;
	private int boostHungerBar = 50;
	private PlayerChicken chickenLevel;
<<<<<<< Updated upstream
	

	public Human()
	{
		// TODO Auto-generated constructor stub
	}
	
=======


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




>>>>>>> Stashed changes
	public Array[][] getHumanLocation()
	{
		return mapLocationOfHuman;
	}
<<<<<<< Updated upstream
	
=======

	/*
	 * Human will be on the left side of the player chicken
	 */
>>>>>>> Stashed changes
	public void setHumanLocation()
	{

	}
<<<<<<< Updated upstream
	
	public int getHumanLevel()
	{
		return level;
	}
	
=======

	/*
	 * gets the level of the human for the PlayerChicken
	 * @Return Level
	 */
	public int getHumanLevel()

	{
		return level;
	}


	public void setLevel(int x)
	{
		level = x;
	}

>>>>>>> Stashed changes
	/*
	 * human level is dependent on the chicken Level
	 * chicken level 1-10 will be assigned level 1 human
	 * chicken level 11-20 will be assigned level 2 human
	 * chicken level 21-30 will be assigned level 3 human
	 * chicken level 31-40 will be assigned level 4 human
	 * chicken level 41-50 will be assigned level 5 human
	 */
	public void setHumanLevel()
	{
		if (chickenLevel.getLevel() < 11 && chickenLevel.getLevel() > 0)
		{
<<<<<<< Updated upstream
			level = 1;
=======
			this.level = levelOfHuman;
>>>>>>> Stashed changes
		}
		else if (chickenLevel.getLevel() < 21 && chickenLevel.getLevel() > 10)
		{
<<<<<<< Updated upstream
			level = 2;
		}
		else if (chickenLevel.getLevel() < 31 && chickenLevel.getLevel() > 20)
		{
			level = 3;
		}
		
		else if (chickenLevel.getLevel() < 41 && chickenLevel.getLevel() > 30)
		{
			level = 4;
		}
		else if (chickenLevel.getLevel() < 51 && chickenLevel.getLevel() > 40)
		{
			level = 5;
		}
		
		
	}
	
=======
			this.level = 1;
		}



	}

	/*
	 * Gets the hunger bar boost stat which  is 50 for the PlayerChicken
	 * @Return int boostHungerBar;
	 */
>>>>>>> Stashed changes
	public int getGainHungerBar()
	{
		return boostHungerBar;
	}
<<<<<<< Updated upstream
	
	/*
	 * level 1-5 human will fill hunger bar
	 */
	public void setGainHungerBar(int x)
	{
		boostHungerBar = x;
	}
	
=======

	//	/*
	//	 * level 1-5 human will fill hunger bar
	//	 */
	//	public void setGainHungerBar()
	//	{
	//		boostHungerBar = 50;
	//	}

>>>>>>> Stashed changes
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
	public void setAttackBoost()
	{
		statBoostAttack = level*2 - 2;
	}
<<<<<<< Updated upstream
	
	public double getDefenseBoost()
=======

	/*
	 * Gets the defense boost stat of the human 
	 * @return int statBoostDefense
	 */
	public int getDefenseBoost()
>>>>>>> Stashed changes
	{
		return statBoostDefense;

	}

	/*
	 * level 1 human will boost playerChicken defense by 0
	 * level 2 human will boost playerChicken defense by 0
	 * level 3 human will boost playerChicken defense by 0
	 * level 4 human will boost playerChicken defense by 6
	 * level 5 human will boost playerChicken defense by 8
	 * 
	 */
	public void setDefenseBoost()
	{
		if (level > 3)
		{
			statBoostDefense = level*2 - 2;
		}
<<<<<<< Updated upstream
	}
	
	public double getHealthBoost()
	{
		return statBoostHealth;
		
	}
	
	public void setHealthBoost(int x)
	{
		statBoostHealth = x;
	}
=======


	}


>>>>>>> Stashed changes
}
