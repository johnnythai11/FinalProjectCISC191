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

public class Inventory
{
	private ArrayList<Items> inventoryArea;

	Inventory()
	{

	}

	public ArrayList<Items> getInventory()
	{
		return this.inventoryArea;
	}
	public void addItemToInventory(Items item) {
		inventoryArea.add(item);
	}
}
