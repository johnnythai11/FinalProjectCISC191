
/**
 * Lead Author(s):
 * 
 * @author Full name; student ID
 * @author Full name; student ID
 *         <<Add additional lead authors here>>
 *
 *         Other Contributors:
 *         Full name; student ID or contact information if not in class
 *         <<Add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 *
 *         References:
 *         Morelli, R., & Walde, R. (2016).
 *         Java, Java, Java: Object-Oriented Problem Solving
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 *         <<Add more references here>>
 *
 *         Version: number or date
 *         2024-10-16
 *         jacobwiemann
 */

/**
 * 
 */
import java.util.ArrayList; 



public class Inventory extends Items
{
	private ArrayList<Items> inventoryArea = new ArrayList<>();
	/*
	 * Constructor to add the items to the inventory
	 * @Parameters Items item
	 */
	Inventory(Items item)
	{
		addItemToInventory(item);
		getInventory();
	}
	/*
	 * Gets all Items in the inventory
	 * @Return ArrayList<Items>
	 */

	public ArrayList<Items> getInventory()
	{
		return this.inventoryArea;
	}


	/*
	 * Adds items to the ArrayList<Items>
	 * @Parameters Items item
	 */
	public void addItemToInventory(Items item) 
	{
		inventoryArea.add(item);
	}

	public static void main(String[] args)
	{
		Items item2 = new Items(1,1);
		Items item3 = new Items(2,2);
		Items item4 = new Items(1,1);
		Items item5 = new Items(2,2);
		Inventory inventoryList = new Inventory(item2);
		inventoryList.addItemToInventory(item3);
		inventoryList.addItemToInventory(item4);
		inventoryList.addItemToInventory(item5);
		System.out.println(inventoryList.getInventory());
	}
}

