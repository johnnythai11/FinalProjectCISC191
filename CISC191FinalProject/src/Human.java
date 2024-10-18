import java.lang.reflect.Array;

public class Human 
{
	private Array[][] mapLocationOfHuman = {};
	private int level = 1; 
	private int statBoostHealth = 0;
	private int statBoostAttack = 0;
	private int statBoostDefense = 0;
	private int boostHungerBar = 50;
	private PlayerChicken chickenLevel;
	

	public Human()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Array[][] getHumanLocation()
	{
		return mapLocationOfHuman;
	}
	
	public void setHumanLocation()
	{
		
	}
	
	public int getHumanLevel()
	{
		return level;
	}
	
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
			level = 1;
		}
		else if (chickenLevel.getLevel() < 21 && chickenLevel.getLevel() > 10)
		{
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
	
	public double getDefenseBoost()
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
