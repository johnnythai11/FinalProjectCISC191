import java.util.ArrayList;
import java.util.Random;

public class Store extends Items
{
	private ArrayList<Items> Stock = new ArrayList<>();
	private String itemName;
	private int typeOfArmor;
	private int tierOfArmor;
	private int price;
	private int balance;
	private Items item = new Items(typeOfArmor,tierOfArmor);

	/**
<<<<<<< Updated upstream
	 * I don't know you tell me
=======
	 * Constructor to create a Store with the randomly generated items
>>>>>>> Stashed changes
	 */
	Store()
	{
		generateStock();
	}
	
	/*
	 * Prints out the item in the store
	 * @Return String itemName, int randInt1 
	 */
	@Override 
	public String toString()
	{
//		if (randInt2 == 0)
//		{
		item.setPrice(typeOfArmor, tierOfArmor);

		return "Type of gear: " + itemName + "\n" +
				"Gear slot number: "  + typeOfArmor + "\n" +
		"number: " + tierOfArmor +"\n" +  
				"Price: " + item.getPrice() +
				"\n"  ;
	}

	public void buyItem(PlayerChicken player, Items item)
	{
		balance = player.getBoneBalance();
	    price = item.getPrice();
	}

	public void generateStock() 
	{

		Random rand = new Random();
		
<<<<<<< Updated upstream
		
		for (int i = 1; i < 6; i ++) 
		{
			Stock.add(new SpecialItems.Helmet(i));
			Stock.add(new SpecialItems.Chestplate(i));
			Stock.add(new SpecialItems.Staff(i));
			Stock.add(new SpecialItems.Shield(i));
			Stock.add(new SpecialItems.Claws(i));
=======
		typeOfArmor = rand.nextInt(3) + 0;
		tierOfArmor = rand.nextInt(5) + 0;
		
		if (typeOfArmor == 0)
		{
			itemName = "Heart";
			
>>>>>>> Stashed changes
		}

		if (typeOfArmor == 1)
		{
			itemName = "Helmet";
		}
		if (typeOfArmor == 2 && tierOfArmor == 0)
		{
			itemName = "Sheild";
		}
		if (typeOfArmor == 3 && tierOfArmor == 0)
		{
			itemName = "Staff";
		}

		if (typeOfArmor == 2 && tierOfArmor == 1)
		{
			itemName = "Wood ChestPlate";
		}
		if (typeOfArmor == 2 && tierOfArmor == 2)
		{
			itemName = "Bronze ChestPlate";
		}

		if (typeOfArmor == 2 && tierOfArmor == 3)
		{
			itemName = "Copper ChestPlate";
		}

		if (typeOfArmor == 2 && tierOfArmor == 4)
		{
			itemName = "Iron ChestPlate";
		}

		if (typeOfArmor == 2 && tierOfArmor == 5)
		{
			itemName = "Diamond ChestPlate";
		}

		if (typeOfArmor == 3 && tierOfArmor == 1)
		{
			itemName = "Wood Claw";
		}
		if (typeOfArmor == 3 && tierOfArmor == 2)
		{
			itemName = "Bronze Claw";
		}

		if (typeOfArmor == 3 && tierOfArmor == 3)
		{
			itemName = "Copper Claw";
		}

		if (typeOfArmor == 3 && tierOfArmor == 4)
		{
			itemName = "Iron Claw";
		}

		if (typeOfArmor == 3 && tierOfArmor == 5)
		{
			itemName = "Diamond Claw";
		}

		switch (tierOfArmor)
		{
			case 0: 
				Items myItem = new Items(typeOfArmor, tierOfArmor);
				Stock.add(myItem);
				break;

			case 1:
				Items myItem2 = new Items(typeOfArmor, tierOfArmor);
				Stock.add(myItem2);
				break;

			case 2: 
				Items myItem3 = new Items(typeOfArmor, tierOfArmor);
				Stock.add(myItem3);
				break;

			case 3: 
				Items myItem4 = new Items(typeOfArmor, tierOfArmor);
				Stock.add(myItem4);
				break;

			case 4:
				Items myItem5 = new Items(typeOfArmor, tierOfArmor);
				Stock.add(myItem5);
				break;

			case 5:
				Items myItem6 = new Items(typeOfArmor, tierOfArmor);
				Stock.add(myItem6);
				break;
		}
	}
	
	public static void main(String args[])
	{
		Store test = new Store();
		System.out.println(test.toString());
	}
}

