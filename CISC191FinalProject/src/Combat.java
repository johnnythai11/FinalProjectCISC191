
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
public class Combat {


	PlayerChicken player;
	EnemyChicken enemy;
	int attackDamage;
	int enemyHealth;
	int playerHealth;

	/*
	 * sets the attack damage of the type of the player dependent on the item worn
	 * @parameters PlayerChicken, Items
	 * @returns attackDamage of the player
	 */

	public int basicAttack(PlayerChicken player, Items playeritem)
	{

		int attackStat = playeritem.getAttackStat();

		attackDamage = attackStat + player.getBaseDamage();

		return attackDamage;
	}


	/*
	 * Calculates the damage taken for the player base on enemy's attack damage
	 * @parameters PlayerChicken, EnemyChicken
	 * @returns playerHealth of the player
	 */

	public int takeDamageForPlayer(PlayerChicken player, EnemyChicken enemy)
	{
		if(player.getBaseHealth() != 0);
		{
			playerHealth = enemy.doDamage() - player.getBaseHealth();
		}

		if (player.getBaseHealth() <= 0)
		{
			playerHealth = 0;
		}
		return playerHealth;
	}

	public static void main(String args[])
	{


	}

}
