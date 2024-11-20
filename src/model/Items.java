package model;

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

public class Items implements java.io.Serializable
{

	private String itemName;
	private int attackStat;
	private int defenseStat;
	private int healthStat;
	private int itemTier;
	private int typeOfArmor;
	private int price;
	private int healingStat;
	final int priceOfHeart = 10;


	public int priceOfHeart()
	{
		return priceOfHeart;
	}
	public int healingOfHeart()
	{
		healingStat = 10;
		return healingStat;
	}
	public Items()
	{

	}


	/*
	 * Constructor for the items in the game based on attack, defense, and health stats
	 * Type of Armor 1 for head, 2 for chest plate, 3 for feet
	 * @Parameters int itemTier, int attackStat, int defenseStat, int healthStat, String itemName
	 */
	public Items(int typeOfArmor, int itemTier)
	{
		//For the heart item in game
		if (typeOfArmor == 0 )
		{
			this.typeOfArmor = typeOfArmor;
			itemTier = 0;
			healingOfHeart();
			itemName = "Heart";
		}
		//for the Helmet special item
		if (typeOfArmor == 1) 
		{
			this.typeOfArmor = typeOfArmor;
			this.healthStat  = 10;
			this.itemTier = 0;
			//this.price = 100;
			itemName = "Helmet";
		}

		if (typeOfArmor == 2) 
		{
			this.typeOfArmor = typeOfArmor;
			this.defenseStat = itemTier;
			if (itemTier == 1)
			{
				itemName = "Wood ChestPlate";
			}
			if (itemTier == 2)
			{
				itemName = "Bronze ChestPlate";
			}
			if (itemTier == 3)
			{
				itemName = "Copper ChestPlate";
			}
			if (itemTier == 4)
			{
				itemName = "Iron ChestPlate";
			}
			if (itemTier == 5)
			{
				itemName = "Diamond ChestPlate";
			}

		}
		//for the Shield special item
		if (typeOfArmor == 2 && itemTier == 0)
		{
			this.itemTier = itemTier;
			this.typeOfArmor = typeOfArmor;
			this.defenseStat = 10;
			//this.price = 100;
			itemName = "Shield";
		}

		if (typeOfArmor == 3)
		{
			this.typeOfArmor = typeOfArmor;
			this.attackStat = itemTier;
			if (itemTier == 1)
			{
				itemName = "Wood Claw";
			}
			if (itemTier == 2)
			{
				itemName = "Bronze Claw";
			}
			if (itemTier == 3)
			{
				itemName = "Copper Claw";
			}
			if (itemTier == 4)
			{
				itemName = "Iron Claw";
			}
			if (itemTier == 5)
			{
				itemName = "Diamond Claw";
			}
		}
		
		//For the Staff special item
		if (typeOfArmor == 3 && itemTier == 0)
		{
			this.itemTier = itemTier;
			this.typeOfArmor = typeOfArmor;
			this.attackStat = 10;
			
		} 
		this.typeOfArmor = typeOfArmor;
		this.itemTier = itemTier;
		
		setPrice(typeOfArmor, itemTier);
	}

	/*
	 * checks if tier of the item is between 1-5, then sets price = to tier
	 * tier 1 = 3 bones
	 * tier 2 = 5 bones
	 * tier 3 = 8 bones
	 * tier 4 = 12 bones
	 * tier 5 = 17 bones
	 */
	public void setPrice(int typeOfArmor, int itemTier)
	{

		if (typeOfArmor == 0)
		{
			itemName = "Heart";
			price = 100;
		}

		if (typeOfArmor == 1 && itemTier == 0)
		{
			itemName = "Helmet";
			price = 100;
		}
		if (typeOfArmor == 2 && itemTier == 0)
		{
			itemName = "Sheild";
			price = 100;
		}
		if (typeOfArmor == 3 && itemTier == 0)
		{
			itemName = "Staff";
			price = 100;
		}

		if (typeOfArmor == 2 && itemTier == 1)
		{
			itemName = "Wood ChestPlate";
			price = 3;
		}
		if (typeOfArmor == 2 && itemTier == 2)
		{
			itemName = "Bronze ChestPlate";
			price = 5;
		}

		if (typeOfArmor == 2 && itemTier == 3)
		{
			itemName = "Copper ChestPlate";
			price = 8;
		}

		if (typeOfArmor == 2 && itemTier == 4)
		{
			itemName = "Iron ChestPlate";
			price = 12;
		}

		if (typeOfArmor == 2 && itemTier == 5)
		{
			itemName = "Diamond ChestPlate";
			price = 17;
		}

		if (typeOfArmor == 3 && itemTier == 1)
		{
			itemName = "Wood Claw";
			price = 3;
		}
		if (typeOfArmor == 3 && itemTier == 2)
		{
			itemName = "Bronze Claw";
			price = 5;
		}

		if (typeOfArmor == 3 && itemTier == 3)
		{
			itemName = "Copper Claw";
			price = 8;
		}

		if (typeOfArmor == 3 && itemTier == 4)
		{
			itemName = "Iron Claw";
			price = 12;
		}

		if (typeOfArmor == 3 && itemTier == 5)
		{
			itemName = "Diamond Claw";
			price = 17;
		}

	}
	
	public int getItemTier()
	{
		return itemTier;
	}
	

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public int getItemType()
	{
		return typeOfArmor;
	}

	public void setItemType(int typeOfArmor)
	{
		this.typeOfArmor = typeOfArmor;
	}

	public int getAttackStat()
	{
		return attackStat;
	}

	public void setAttackStat(int attackStat)
	{
		this.attackStat = attackStat;
	}

	public int getDefenseStat()
	{
		return defenseStat;
	}

	public void setDefenseStat(int defenseStat)
	{
		this.defenseStat = defenseStat;
	}

	public int getHealthStat()
	{
		return healthStat;
	}

	public void setHealthStat(int healthStat)
	{
		this.healthStat = healthStat;
	}



	public int getPrice() {


		return this.price;
	}
}
