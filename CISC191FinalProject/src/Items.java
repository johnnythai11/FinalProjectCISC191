
public class Items
{
<<<<<<< Updated upstream
	private String itemName;
	private String itemType;
	private int attackStat;
	private int defenseStat;
	private int healthStat;
=======

	private String itemName;
	private String itemType;

	private int attackStat;
	private int defenseStat;
	private int healthStat;
	private int itemTier;
	private int typeOfArmor;
>>>>>>> Stashed changes
	private int price;
	private int healingStat;

//	final int priceOfWood = 3;
//	final int priceOfBronze = 5;
//	final int priceOfCopper = 8;
//	final int priceOfIron = 12;
//	final int priceOfDiamond = 17;
//
//	final int priceOfHelmet = 100;
//	final int priceOfStaff = 100;
//	final int priceOfShield = 100;

<<<<<<< Updated upstream
	final int priceOfHelmet = 100;
	final int priceOfStaff = 100;
	final int priceOfShield = 100;

//	public Items(int statType, int statValue, String itemName, String itemType)
//	{
//		this.itemName = itemName;
//		this.itemType = itemType;
//
//		switch (statType) // If statType is 1 it is attack, 2 is defense, 3 is
//							// healthStat
//		{
//			case 1:
//				this.attackStat = statType;
//				break;
//
//			case 2:
//				this.defenseStat = statType;
//				break;
//
//			case 3:
//				this.healthStat = statType;
//				break;
//		}
//	}
	
	public Items(int attackStat, int defenseStat, int healthStat, String itemName)
	{
		this.attackStat  = attackStat + 10;
		this.defenseStat = defenseStat + 10;
		this.healthStat = healthStat + 10;
		this.itemName = itemName;
		setPrice();
	}

	//BASICALLy checks wihch stat isnt 0, then sets price = to tier
	public void setPrice()
	{
		int number = 0;
		if (attackStat > 0)
		{
			number = attackStat - 10;
			switch(number) {
			
			case 1:
				price = 3;
				break;
			case 2:
				price = 5;
				break;
			case 3:
				price = 8;
				break;
			case 4:
				price = 12;
				break;
			case 5:
				price = 17;
				break;		
			}
		}
		
		if (defenseStat > 0)
		{
			number = healthStat - 10;
			switch(number) {
			
			case 1:
				price = 3;
				break;
			case 2:
				price = 5;
				break;
			case 3:
				price = 8;
				break;
			case 4:
				price = 12;
				break;
			case 5:
				price = 17;
				break;		
			}
		}
		if (healthStat > 0)
		{
			number = healthStat - 10;
			switch(number) {
			
			case 1:
				price = 3;
				break;
			case 2:
				price = 5;
				break;
			case 3:
				price = 8;
				break;
			case 4:
				price = 12;
				break;
			case 5:
				price = 17;
				break;		
			}
		}
	}
	
	
=======
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
			//this.price = 10;
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
		//for the Staff special item
		if (typeOfArmor == 3 && itemTier == 0)
		{
			this.itemTier = itemTier;
			this.typeOfArmor = typeOfArmor;
			this.attackStat = 10;
			//this.price = 100;
		} 
			this.typeOfArmor = typeOfArmor;
			this.itemTier = itemTier;
			//this.itemName = itemName;
			setPrice(typeOfArmor, itemTier);
	}

	/*
	 * Method to print out the stats of the items
	 * @Return int itemTier, String itemName, int attackStat, int defenseStat, int healthStat
	 */
	@Override
	public String toString()
	{
		return "Tier of item: " + itemTier + " " + "\n" +
				"Name: " + itemName + " " + "\n" +
				"Price Of item: " + price + "\n" +
				"Attack Stat: " + attackStat + " " + "\n" +
				"Defense Stat: "+ defenseStat + " " + "\n" +
				"Health Stat: " + healthStat + "\n" +
				"Heart Heals: " + healingStat + "\n";
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

		if (itemTier > 0 && itemTier < 6 && typeOfArmor == 2 || typeOfArmor == 3)
		{

			switch(itemTier) {

				case 1:
					this.price = 3;
					break;
				case 2:
					this.price = 5;
					break;
				case 3:
					this.price = 8;
					break;
				case 4:
					this.price = 12;
					break;
				case 5:
					this.price = 17;
					break;		
			}
		
			if (typeOfArmor == 0)
			{
				this.price = 10;
			}

			if (typeOfArmor == 1)
			{
				this.price = 100;
			}
			if (typeOfArmor == 2 && itemTier == 0)
			{
				this.price = 100;
			}
			if (typeOfArmor == 3 && itemTier == 0)
			{
				this.price = 100;
			}
			


		}
	}	



>>>>>>> Stashed changes
	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public String getItemType()
	{
		return itemType;
	}

	public void setItemType(String itemType)
	{
		this.itemType = itemType;
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

<<<<<<< Updated upstream
	
=======
		public static void main(String args[])
		{
			
			Items woodClawStat = new Items(2,3);
			Items item1 = new Items(2,5);
			
			System.out.println(woodClawStat.toString());
			System.out.println(item1.toString());

		}



>>>>>>> Stashed changes

}
