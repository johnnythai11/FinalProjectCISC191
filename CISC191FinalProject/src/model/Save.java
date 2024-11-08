package model;

import java.io.IOException;
import java.io.PrintWriter;

public class Save
{
	private PlayerChicken player;
	private Inventory inventory;
	private Equipment equipment;
	private Human human;

	/*
	 * public abstract int expBar();
	 * public abstract int getLevel();
	 * public abstract int getBaseDamage();
	 * public abstract int getBaseHealth();
	 * public abstract int getCurrentHealth();
	 * public abstract int getBaseDefense();
	 * public abstract int getHungerBar();
	 * public abstract int getBoneBalance();
	 * public abstract void setBaseHealth(int health);
	 * public abstract void equipEquipmentItem(int indexX, int indexY);
	 */

	public boolean save()
	{

		StringBuilder builder = new StringBuilder();
		builder.append("ChickenFighterSave:");
		builder.append(player.toStringSave());
		builder.append(inventory.toStringSave());
		builder.append(equipment.toStringSave());
		builder.append(human.toStringSave());
		try {
		PrintWriter print = new PrintWriter("ChickenFigtherSave.txt");
		String saveToString = builder.toString();
		print.println(saveToString);
		print.close();
		} catch (IOException e) {}
		return true;
	}
}