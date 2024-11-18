package model;

import java.util.ArrayList;

/**
 * Lead Author(s):
 * 
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


public class Inventory extends Items
{
	private ArrayList<Items> inventory = new ArrayList<Items>();

	Inventory(){}


	/*
	 * Constructor to add the items to the inventory
	 * @Parameters Items item
	 */
	Inventory(Items item)
	{
		inventory.add(item);
		getInventory();
	}

	/*
	 * Gets all Items in the inventory
	 * @Return ArrayList<Items>
	 */
	public ArrayList<Items> getInventory()
	{
		return inventory;
	}

	/*
	 * Adds items to the ArrayList<Items>
	 * @Parameters Items item
	 */
	public void addItemToInventory(Items item)
	{
		if (inventory.size() <= 16)
		{
			inventory.add(item);
		}
	}

	public boolean itemExist(int index)
	{
		try
		{
			
		
		if (inventory.get(index) != null)
		{
			return true;
		}
		return false;
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	public boolean roomExist()
	{
		if (this.inventory.size() <= 16)
		{
			return true;
		}
		return false;
	}
	
	/*
	 * Removes the items from the inventory
	 * @Parameters int row, int column
	 */
	public void removeItemFromInventory(Items item)
	{
		inventory.remove(item);
	}

	/*
	 * Gets the item from the inventory
	 * @Parameter int indexX, int indexY
	 * @Returns Items
	 */ 
	public Items getItem(int index)
	{
		if (inventory.get(index) != null)
		{
			return inventory.get(index);
		}
		//raise error or smthing
		System.out.println("bruhv this code is shit");
		return null;
	}


}

