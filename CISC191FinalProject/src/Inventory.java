
/**
 * Lead Author(s):
 * 
 * @author Full name: Johnny Thai
 * @author Full name: Jacob Wiemann
 * @author Full name: Daniel Soto
 *
 *         Other Contributors: none
 *
 *         References:
 *         Morelli, R., & Walde, R. (2016).
 *         Java, Java, Java: Object-Oriented Problem Solving
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 *         Version: 2024-10-16
 * 
 */
import java.util.ArrayList;

public class Inventory extends Items
{
	private Items[][] inventory = new Items[4][3];
	

	/*
	 * Constructor to add the items to the inventory
	 * @Parameters Items item
	 */
	Inventory()
	{

	}

	Inventory(Items item)
	{
		addItemToInventory(item);
		getInventory();
	}
	/*
	 * Gets all Items in the inventory
	 * @Return ArrayList<Items>
	 */

	public Items[][] getInventory()
	{
		return this.inventory;
	}

	/*
	 * Adds items to the ArrayList<Items>
	 * @Parameters Items item
	 */
	public boolean addItemToInventory(Items item)
	{
		for (int i = 0; i < inventory.length; i++)
		{
			for (int j = 0; j < inventory[i].length; j++)
			{
				if (inventory[i][j] == null) {
					inventory [i][j] = item;
					return true;
				}
			}
		}
		return false;
	}

	public void removeItemFromInventory(int row, int column)
	{
		inventory[row][column] = null;
	}

	public static void main(String[] args)
	{
		Items item2 = new Items(1, 1);
		Items item3 = new Items(2, 2);
		Items item4 = new Items(1, 1);
		Items item5 = new Items(2, 2);
		Inventory inventoryList = new Inventory(item2);
		inventoryList.addItemToInventory(item3);
		inventoryList.addItemToInventory(item4);
		inventoryList.addItemToInventory(item5);
		System.out.println(inventoryList.getInventory());
	}
}
