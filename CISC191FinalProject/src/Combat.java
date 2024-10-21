
public class Combat {


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
	 * Calculates the damage taken for the enemy chicken base on player's attack damage
	 * @parameters EnemyChicken
	 * @returns enemyHealth of the enemy
	 */
	public int takeDamageForEnemy(EnemyChicken enemy)
	{
		if (enemy.getCurrentHealth() != 0)
		{
			enemyHealth = enemy.getCurrentHealth() - attackDamage;	
		}
		if (enemy.getCurrentHealth() <= 0)
		{
			enemyHealth = 0;
		}
		return enemyHealth;
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
//		Items woodClawPrice = new Items(1,"wood tier");
//		Items woodClawStat = new Items(5,0,0, "wood");
//		PlayerChicken player = new MeleeChicken(90);
//		PlayerChicken player2 = new MageChicken(50);
//		PlayerChicken player3 = new TankChicken(50);
//		
//		Combat stat2 = new Combat();
		Combat man = new Combat();
//		Combat hi = new Combat();
		PlayerChicken melee = new MeleeChicken(1);
		Items woodClawStat = new Items(1,0,0, "wood");
		int attack = man.basicAttack(melee, woodClawStat);
//		
//		int stat = stat2.basicAttack(player, woodClawStat);
//		int hello = man.basicAttack(player2, woodClawStat);
//		int stat3 = hi.basicAttack(player3, woodClawStat);
		EnemyChicken enemy = new EnemyChicken(50);
		int test = man.takeDamageForEnemy(enemy);
		
		
//		System.out.println(woodClawPrice.getPrice());
//		System.out.println(woodClawStat.getAttackStat());
//		System.out.println(woodClawStat.getDefenseStat());
//		System.out.println(woodClawStat.getHealthStat());
//		System.out.println(stat);
//		System.out.println(hello);
//		System.out.println(stat3);
		System.out.println(test);
	}

}
