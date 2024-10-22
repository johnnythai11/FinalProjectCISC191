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


import java.lang.reflect.Array;

public class Human 
{

	private Array[][] mapLocationOfHuman = {};
	private int level; 
	private int statBoostHealth = 0;
	private int statBoostAttack = 0;
	private int statBoostDefense = 0;
	private int boostHungerBar = 50;
	private PlayerChicken chickenLevel;



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

	{
		return level;
	}


	public void setLevel(int x)
	{
		level = x;
	}


	/*
	 * human level is dependent on the chicken Level
	 * chicken level 1-10 will be assigned level 1 human
	 * chicken level 11-20 will be assigned level 2 human
	 * chicken level 21-30 will be assigned level 3 human
	 * chicken level 31-40 will be assigned level 4 human
	 * chicken level 41-50 will be assigned level 5 human
	 */
	public void setHumanLevel(int level)
	{
		if (level > 0 && level < 6)
		{
			this.level = level;
		}
		
		this.level = 1;
		
		
	}



	/*
	 * Gets the hunger bar boost stat which  is 50 for the PlayerChicken
	 * @Return int boostHungerBar;
	 */

	public int getGainHungerBar()
	{
		return boostHungerBar;
	}

	
	/*
	 * level 1-5 human will fill hunger bar
	 */
	public void setGainHungerBar(int x)
	{
		boostHungerBar = x;
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
	public void setAttackBoost()
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
	 * 
	 */
	public void setDefenseBoost()
	{
		if (level > 3)
		{
			statBoostDefense = level*2 - 2;
		}

	}
	
	public double getHealthBoost()
	{
		return statBoostHealth;
		
	}
	
	public void setHealthBoost(int x)
	{
		statBoostHealth = x;
	}



	



}
