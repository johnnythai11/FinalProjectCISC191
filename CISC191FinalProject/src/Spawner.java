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

public class Spawner extends EnemyChicken {

	public EnemyChicken generateEnemy()
	{

		EnemyChicken newChicken = new EnemyChicken();
		return newChicken;
	}

	public static void main (String args[])
	{
		Spawner chicken = new Spawner();

		System.out.println(chicken.generateEnemy());
	}
}
