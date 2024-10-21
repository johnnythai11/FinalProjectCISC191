
public class Items
{
<<<<<<< Updated upstream

	public Items()
	{
		// TODO Auto-generated constructor stub
	}
=======
	private String itemName;
	private String itemType;
	
	private int attackStat;
	private int defenseStat;
	private int healthStat;
	private int itemTier;
	private int price;
	
	final int priceOfWood = 3;
	final int priceOfBronze = 5;
	final int priceOfCopper = 8;
	final int priceOfIron = 12;
	final int priceOfDiamond = 17;

	final int priceOfHelmet = 100;
	final int priceOfStaff = 100;
	final int priceOfShield = 100;
	
	final int priceOfHeart = 10;
	final int healingStat = 10;


	public Items(String itemName)
	{
		priceOfHeart();
		healingOfHeart();
		
	}
	
	public int priceOfHeart()
	{
		return priceOfHeart;
	}
	public int healingOfHeart()
	{
		return healingStat;
	}
	/*
	 * Constructor to set the price of the item based on the tier
	 */
	public Items(int itemTier, String itemName)
	{
		this.itemTier = itemTier;
		this.itemName = itemName;
		setPrice();
	}
	
	/*
	 * Constructor for the items in the game based on attack, defense, and health stats
	 */
	public Items(int attackStat, int defenseStat, int healthStat, String itemName)
	{
		if (attackStat != 0) 
		{
		this.attackStat  = attackStat;
		}
		
		if (defenseStat != 0) 
		{
		this.defenseStat = defenseStat;
		}
		
		if (healthStat != 0)
		{
		this.healthStat = healthStat;
		}
		
	}

	/*
	 * checks if tier of the item is between 1-5, then sets price = to tier
	 * tier 1 = 3 bones
	 * tier 2 = 5 bones
	 * tier 3 = 8 bones
	 * tier 4 = 12 bones
	 * tier 5 = 17 bones
	 */
	public void setPrice()
	{
		
		if (itemTier > 0 && itemTier < 6)
		{
			
			switch(itemTier) {
			
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
	
//	public static void main(String args[])
//	{
//		Items woodClawPrice = new Items(1,"wood tier");
//		Items woodClawStat = new Items(1,0,0, "wood");
//		
//		System.out.println(woodClawPrice.getPrice());
//		System.out.println(woodClawStat.getAttackStat());
//		System.out.println(woodClawStat.getDefenseStat());
//		System.out.println(woodClawStat.getHealthStat());
//	}

	
>>>>>>> Stashed changes

}
