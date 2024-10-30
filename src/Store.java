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

import java.util.Random;

public class Store extends Items
{
	private Items[][] Stock = new Items[4][5];
	private String itemName;
	private int typeOfArmor;
	private int tierOfArmor;
	
	/**
	 * Constructor to create a Store with the randomly generated items
	 */
	Store()
	{
		generateStock();
		
	}


	/*
	 * Prints out the item in the store
	 * @Return String itemName, integer randInt1 
	 */
	@Override 
	public String toString()
	{
		StringBuilder myString = new StringBuilder();
		for (int row = 0; row< Stock.length; row ++)
			for(int col = 0; col < Stock[row].length; col++)
		{
			myString.append(Stock[row][col] + "\n");
		}
		return myString.toString();


	}


	public void generateStock() 
	{
		Random rand = new Random();

		for (int row = 0; row < Stock.length; row++)
		{
			for(int col = 0; col < Stock[row].length; col++)
			{
				typeOfArmor = rand.nextInt(4) + 0;
				//System.out.println("Type of Armor: " + typeOfArmor);
				tierOfArmor = rand.nextInt(6) + 0;
				//System.out.println("Tier of Armor: " + tierOfArmor);

				if (typeOfArmor == 0)
				{
					itemName = "Heart";
				}

				else if (typeOfArmor == 1)
				{
					itemName = "Helmet";
				}
				else if (typeOfArmor == 2 && tierOfArmor == 0)
				{
					itemName = "Shield";
				}
				else if (typeOfArmor == 3 && tierOfArmor == 0)
				{
					itemName = "Staff";
				}

				else if (typeOfArmor == 2 && tierOfArmor == 1)
				{
					itemName = "Wood ChestPlate";
				}
				else if (typeOfArmor == 2 && tierOfArmor == 2)
				{
					itemName = "Bronze ChestPlate";
				}

				else if (typeOfArmor == 2 && tierOfArmor == 3)
				{
					itemName = "Copper ChestPlate";
				}

				else if (typeOfArmor == 2 && tierOfArmor == 4)
				{
					itemName = "Iron ChestPlate";
				}

				else if (typeOfArmor == 2 && tierOfArmor == 5)
				{
					itemName = "Diamond ChestPlate";
				}

				else if (typeOfArmor == 3 && tierOfArmor == 1)
				{
					itemName = "Wood Claw";
				}
				else if (typeOfArmor == 3 && tierOfArmor == 2)
				{
					itemName = "Bronze Claw";
				}

				else if (typeOfArmor == 3 && tierOfArmor == 3)
				{
					itemName = "Copper Claw";
				}

				else if (typeOfArmor == 3 && tierOfArmor == 4)
				{
					itemName = "Iron Claw";
				}

				else if (typeOfArmor == 3 && tierOfArmor == 5)
				{
					itemName = "Diamond Claw";
				}

				switch (tierOfArmor)
				{
					case 0: 
						Items myItem1 = new Items(typeOfArmor, tierOfArmor);
						Stock[row][col] = myItem1;
						break;

					case 1:
						Items myItem2 = new Items(typeOfArmor, tierOfArmor);
						Stock[row][col] = myItem2;
						break;

					case 2: 
						Items myItem3 = new Items(typeOfArmor, tierOfArmor);
						Stock[row][col] = myItem3;
						break;

					case 3: 
						Items myItem4 = new Items(typeOfArmor, tierOfArmor);
						Stock[row][col] = myItem4;
						break;

					case 4:
						Items myItem5 = new Items(typeOfArmor, tierOfArmor);
						Stock[row][col] = myItem5;
						break;

					case 5:
						Items myItem6 = new Items(typeOfArmor, tierOfArmor);
						Stock[row][col] = myItem6;
						break;
				}
			}
		}
	}

	public static void main(String args[])
	{
		Store test = new Store();

		System.out.println(test);

	}
}

