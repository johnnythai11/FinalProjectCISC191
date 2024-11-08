package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.*;

public class SaveLoad {
	private PlayerChicken player;
	private Inventory inventory;
	private Equipment equipment;
	private Human human;

	public boolean save() {

		StringBuilder builder = new StringBuilder();
		builder.append("ChickenFighterSave:");
		builder.append(player.toStringSave());
		builder.append(",");
		builder.append(inventory.toStringSave());
		builder.append(",");
		builder.append(equipment.toStringSave());
		builder.append(",");
		builder.append(human.toStringSave());
		try {
			PrintWriter print = new PrintWriter("ChickenFighterSave.txt");
			String saveToString = builder.toString();
			print.println(saveToString);
			print.close();
		} catch (IOException e) {
		}
		return true;
	}

	public static void load() {
		File file = new File("ChickenFighterSave.txt");
		Scanner reader;
		try {
			reader = new Scanner(file);
			if (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
				reader.close();
				Pattern p1 = Pattern.compile("/{.*?}/gm");
				Matcher m = p1.matcher(data);
				
				String playerChickenData = m.group(1);
				Pattern playerPattern = Pattern.compile("/\\d+/gm");
				Matcher playerMatch = playerPattern.matcher(playerChickenData);
				
				String inventoryData = m.group(2);
				String equipmentData = m.group(3);
				String humanData = m.group(4);
				
				
				
			} else {
				System.out.println("no data");
				reader.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		load();
	}
}