package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveLoad {
	private PlayerChicken player;
	private Inventory inventory;
	private Equipment equipment;
	private Human human;

	public boolean save() {

		StringBuilder builder = new StringBuilder();
		builder.append("ChickenFighterSave:");
		builder.append(player.toStringSave());
		builder.append(inventory.toStringSave());
		builder.append(equipment.toStringSave());
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
				// player 
				// inventory
				// equipment 
				// human
				
				
				
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