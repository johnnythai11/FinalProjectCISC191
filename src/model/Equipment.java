package model;
import model.PlayerChicken;
import view.CombatView;
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

public class Equipment
{

    PlayerChicken player;

	private Items[] equippedItemArray = new Items[4];

	Equipment()
	{

	}

	/*
	 * Equipment for the player with 4 item slots
	 * 0 = Heart
	 * 1 = Head (Defence)
	 * 2 = Body (Defence)
	 * 3 = Feet (Weapon)
	 */
	public Equipment(Items item1, Items item2, Items item3, Items item4)
	{
		this.equippedItemArray[0] = item1;
		this.equippedItemArray[1] = item2;
		this.equippedItemArray[2] = item3;
		this.equippedItemArray[3] = item4;

	}

	/*
	 * Gets the Equipment from the item array
	 */
	public Items[] getEquipment()
	{
		return this.equippedItemArray;
	}

	/*
	 * Adds the items to the equipement to its corresdonding index
	 */
	public void equipEquipmentItem(Items item, int index)
	{

		if (item.getItemType() == 0)
		{

			CombatView.player.heartCounter += 1;
			CombatView.player.updateHealth();
			System.out.println("this does not work cannot invoke \"model.PlayerChicken.updateHealth()\" because \"this.player\" is null");	
		}
		else {
			
		this.equippedItemArray[index] = item;
		}
	}
	
	public int getItemStat(int index)
	{
		if (equippedItemArray[index] != null) {
		switch(index) {
			case 1:
				return equippedItemArray[index].getDefenseStat();
			case 2: 
				return equippedItemArray[index].getDefenseStat();
			case 3:
				return equippedItemArray[index].getAttackStat();
			default:
				return 0;
		}
		}
		return 0;
	}

	public String toStringSave()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		for (int i = 0; i < equippedItemArray.length; i++)
		{
			builder.append(equippedItemArray[i].toString());
		}
		builder.append("}");
		return builder.toString();
	}
}
