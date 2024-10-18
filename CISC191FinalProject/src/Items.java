
public class Items
{
	private String itemName;
	private String itemType;
	private int attackStat;
	private int defenseStat;
	private int healthStat;
	private int price;
	
	final int priceOfWood = 3;
	final int priceOfBronze = 5;
	final int priceOfCopper = 8;
	final int priceOfIron = 12;
	final int priceOfDiamond = 17;

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

	

}
