
public class Items
{
	private String itemName;
	private String itemType;
	private int attackStat;
	private int defenseStat;
	private int healthStat;

	final int priceOfWood = 3;
	final int priceOfBronze = 5;
	final int priceOfCopper = 8;
	final int priceOfIron = 12;
	final int priceOfDiamond = 17;

	final int priceOfHelmet = 100;
	final int priceOfStaff = 100;
	final int priceOfShield = 100;

	public Items(int statType, int statValue, String itemName, String itemType)
	{
		this.itemName = itemName;
		this.itemType = itemType;

		switch (statType) // If statType is 1 it is attack, 2 is defense, 3 is
							// healthStat
		{
			case 1:
				this.attackStat = statType;
				break;

			case 2:
				this.defenseStat = statType;
				break;

			case 3:
				this.healthStat = statType;
				break;
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

}
