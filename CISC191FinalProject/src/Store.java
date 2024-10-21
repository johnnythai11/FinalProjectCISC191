import java.util.ArrayList;
import java.util.Random;

public class Store
{
	private ArrayList<Items> Stock;

	/**
	 * 
	 */
	Store()
	{

	}

	/*
	 * Method for the PlayerChicken can buy items in the store
	 * @Parameter PlayerChicken player, Items item
	 */
	public void buyItem(PlayerChicken player, Items item)
	{
		int balance = player.getBoneBalance();
		int price = item.getPrice();
	}

	/*
	 * Method to randomly generate the items in the store
	 * 
	 */
	public void generateStock() 
	{
		
		//generates the tiers of the item from 1-5
		for (int i = 1; i < 6; i ++) 
		{
			//Stock.add(new SpecialItems.Helmet(i));
			Stock.add(new SpecialItems.Chestplate(i));
			//Stock.add(new SpecialItems.Staff(i));
			//Stock.add(new SpecialItems.Shield(i));
			Stock.add(new SpecialItems.Claws(i));
			Stock.add(new SpecialItems.Heart(i));
		}
		





		for(int i = 0; i < 20; i++)
		{
			Random rand = new Random();
			int randInt1 = rand.nextInt(4) + 1;
			int randInt2 = rand.nextInt(4) + 1;
			switch (randInt2)
			{
				case 1: 
					SpecialItems.Helmet myItem = new SpecialItems.Helmet(randInt1);
					Stock.add(myItem);
				break;

				case 2:
					SpecialItems.Chestplate myItem2 = new SpecialItems.Chestplate(randInt1);
					Stock.add(myItem2);
				break;

				case 3: 
					SpecialItems.Claws myItem3 = new SpecialItems.Claws(randInt1);
					Stock.add(myItem3);
				break;

			case 4: 
					SpecialItems.Staff myItem4 = new SpecialItems.Staff(randInt1);
					Stock.add(myItem4);
				break;

				case 5:
					SpecialItems.Shield myItem5 = new SpecialItems.Shield(randInt1);
					Stock.add(myItem5);
				break;
			}
		}
	}
}
