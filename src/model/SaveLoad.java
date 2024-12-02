package model;

import java.io.*;

import view.CharacterSelectionView;
import view.CombatView;

public class SaveLoad {
	
	public void binarySave(PlayerChicken object) {
		try
		{
			FileOutputStream fstream = new FileOutputStream("ChickenFighterSave.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fstream);
			oos.writeObject(object);
			oos.close();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void binaryLoad() {
		try 
		{
		FileInputStream fileIn = new FileInputStream("ChickenFighterSave.dat");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        Object obj = objectIn.readObject();
        PlayerChicken p = (PlayerChicken) obj;
        CharacterSelectionView.combatGUI = new CombatView(p);
		}
		catch (IOException | ClassNotFoundException e)
		{
		
		}
	}
}