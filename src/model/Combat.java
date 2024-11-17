package model;

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

	/*
	 * sets the attack damage of the type of the player dependent on the item worn
	 * @parameters PlayerChicken, Items
	 * @returns attackDamage of the player
	 */

	public static int basicAttack(PlayerChicken player, Items playeritem)
	{


		int attackDamage = playeritem.getAttackStat() + player.getBaseDamage();

		return attackDamage;
	}


	/*
	 * Calculates the damage taken for the player base on enemy's attack damage
	 * @parameters PlayerChicken, EnemyChicken, item of the player
	 * @returns playerHealth of the player
	 */
	public static int takeDamageForPlayer(PlayerChicken player, EnemyChicken enemy)
	{


		int health = player.getBaseHealth();
		int defense = player.getBaseDefense();
		int enemyDamage = enemy.doDamage();

		int currentHealth = health;

		if ((enemyDamage > defense) && (defense > 0))
		{
			defense = 0;
		}
		// Else if defense is not broken it decreases defense
		else if (defense != 0)
		{
			defense = defense - enemyDamage;
		}
		//finally if there is no defense, decrease current health
		else if (defense == 0 && currentHealth != 0 && currentHealth > 0)
		{
			currentHealth = health - enemyDamage;
		}
		return currentHealth;
	}

	/*
	 * Calculates the damage taken for the enemy base on player's attack damage
	 * @parameters PlayerChicken, EnemyChicken
	 * @returns enemyHealth of the enemy
	 */
	public static int takeDamageForEnemy(PlayerChicken player, EnemyChicken enemy)
	{


		int health = enemy.getMaxHealth();
		int defense = enemy.getDefense();
		int playerDamage = player.getBaseDamage();

		int currentHealth = health;

		if ((playerDamage > defense) && (defense > 0))
		{
			defense = 0;
		}
		// Else if defense is not broken it decreases defense
		else if (defense != 0)
		{
			defense = defense - playerDamage;
		}
		//finally if there is no defense, decrease current health
		else if (defense == 0 && currentHealth != 0 && currentHealth > 0)
		{
			currentHealth = health - playerDamage;
		}
		return currentHealth;
	}


	public static int attackCombatRound(PlayerChicken player, EnemyChicken enemy)
	{
		int playerDamage = player.dealDamage();
		int enemyDamage = enemy.doDamage();

		enemy.takeDamage(playerDamage);
		player.takeDamage(enemyDamage);

		if (player.getCurrentHealth() <= 0)
		{
			return 1;
		}
		else if (enemy.getMaxHealth() <= 0)
		{
			return 2;
		}
		else
		{
			return 0;
		}

	}


	public static void main(String args[])
	{

		PlayerChicken player1 = new MeleeChicken(1);
		EnemyChicken enemy1 = new EnemyChicken();
		Items wood = new Items(3,5);
		int x = basicAttack(player1, wood);
		int c = takeDamageForPlayer(player1, enemy1);
		//takeDamageForEnemy(player1, enemy1);
		System.out.println("Current Health: "+ c);
		System.out.println("basic Attack: "+ x);

	}




}
