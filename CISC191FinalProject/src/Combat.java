
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

	public static int takeDamageForPlayer(PlayerChicken player, EnemyChicken enemy)
	{
		//enemy.getLevelOfChicken();
		
		
		if ((enemy.doDamage() > player.getBaseDefense()) && (player.getBaseDefense() > 0))
		{
			
			player.setDefense(0);
		}
		// Else if defense is not broken it decreases defense
		else if (player.getBaseDefense() != 0)
		{
			int defense = player.getBaseDefense();
			
			defense = defense - enemy.doDamage();
			
		}
		//finally if there is no defense, decrease current health
		else
		{
			maxHealth = maxHealth - incomingDamage;
			if (maxHealth < 0) // If the health is less than 0 set to 0
			{
				maxHealth = 0;
			}
		}
		
		if(player.getBaseHealth() != 0);
		{
			player.g = ( player.getBaseDefense() + player.getBaseHealth()) - enemy.doDamage();
		}

		if (player.getBaseHealth() <= 0)
		{
			playerHealth = 0;
		}
		return playerHealth;
	}

	public static void main(String args[])
	{
		
		PlayerChicken player1 = new MeleeChicken(3);
		EnemyChicken enemy1 = new EnemyChicken();
		System.out.println(player1);
		System.out.println(enemy1);
		System.out.println(takeDamageForPlayer(player1, enemy1));


	}

}
