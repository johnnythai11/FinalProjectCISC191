
public class SpecialItems
{
	public static class Helmet extends Items
	{

		
		Helmet(int healthStat)
		{
			super(0,0,healthStat + 10,("Helmet of +" + healthStat));
		}
	}
	
	public static class Chestplate extends Items
	{

		
		Chestplate(int defenseStat)
		{
			super(0,defenseStat + 10,0,("Chestplate of +" + defenseStat));
		}
	}
	public static class Claws extends Items
	{

		
		Claws(int attackStat)
		{
			super(attackStat + 10,0,0,("Claws of +" + attackStat));
		}
	} // ok
	public static class Staff extends Items
	{

		
		Staff(int attackStat)
		{
			super(attackStat + 10,0,0,("Staff of +" + attackStat));
		}
	}
	public static class Shield extends Items
	{

		
		Shield(int defenseStat)
		{
			super(0,defenseStat + 10, 0 ,("Shield of +" + defenseStat));
		}
	}

}