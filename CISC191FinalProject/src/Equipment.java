
/**
* Lead Author(s):
* @author Full name: Johnny Thai
* @author Full name: Jacob Wiemann
* @author Full name: Daniel Soto
*
* Other Contributors: none
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* Version: 2024-10-16
* 
*/

public class Equipment
{
	private Items[] EquippedItemArray = new Items[4];

	Equipment()
	{

	}
	Equipment(Items item1, Items item2, Items item3, Items item4){
		this.EquippedItemArray[0] = item1;
		this.EquippedItemArray[1] = item2;
		this.EquippedItemArray[2] = item3;
		this.EquippedItemArray[3] = item4;

	}
	public Items[] getEquipment() {
		return this.EquippedItemArray;
	}
	public void equipEquipmentItem(Items item, int index) {
		this.EquippedItemArray[index] = item;
	}
}
