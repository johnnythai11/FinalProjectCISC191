import java.util.ArrayList;

/**
* Lead Author(s):
* @author Full name; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: number or date
* 2024-10-16
* jacobwiemann
*/

public class Equipment
{
	
	
	private Items[] EquippedItemArray = new Items[3];
	
	/*
	 * Constructor to create the three slots the PlayerChiken will have
	 * Head, Chest, and feet
	 * @Parameters Items item1, Items item2, Items item3
	 */
	Equipment(Items item1, Items item2, Items item3){
		this.EquippedItemArray[0] = item1;
		this.EquippedItemArray[1] = item2;
		this.EquippedItemArray[2] = item3;

	}

	/*
	 * gets the three equipment for the PlayerChicken
	 * @Returns Items[] EquippedItemArray
	 */
	public Items[] getEquipment() {
		return this.EquippedItemArray;
	}

	/*
	 * Equips the item onto the PlayerChicken in a desired slot that is inputed
	 * @Parameters Items item, int index
	 */
	public void equipEquipmentItem(Items item, int index) {
		this.EquippedItemArray[index] = item;
	}
}
