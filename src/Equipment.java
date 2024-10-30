package Model;

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
<<<<<<<< HEAD:CISC191FinalProject/src/Model/Equipment.java
	
========
>>>>>>>> c5bb87e024d6a838fac65d3b95729b11c7e978e6:src/Equipment.java
	PlayerChicken player;
	private Items[] EquippedItemArray = new Items[4];

	Equipment()
	{

	}
<<<<<<<< HEAD:CISC191FinalProject/src/Model/Equipment.java
========
	
	// 0 = Heart, 1 = Head, 2 = Body, 3 = Feet
>>>>>>>> c5bb87e024d6a838fac65d3b95729b11c7e978e6:src/Equipment.java
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
		
<<<<<<<< HEAD:CISC191FinalProject/src/Model/Equipment.java
				switch(item.getItemType()) {
					case 0:
						int baseHealth = player.getBaseHealth();
						player.setBaseHealth(baseHealth + 10);
						break;
				}
				this.EquippedItemArray[index] = item;
========
		switch(item.getItemType()) {
			case 0: 
				int baseHealth = player.getBaseHealth();
				player.setBaseHealth(baseHealth + 10);
				break;
		}
		this.EquippedItemArray[index] = item;
>>>>>>>> c5bb87e024d6a838fac65d3b95729b11c7e978e6:src/Equipment.java
	}
}
