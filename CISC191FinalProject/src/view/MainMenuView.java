package view;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.MainMenuController;

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

public class MainMenuView
{
	
	private JFrame window;
	private JButton newGame;
	private JButton howToPlay;

	public MainMenuView()
	{
		// TODO Auto-generated constructor stub
	}
	
	public JFrame window()
	{
		window = new JFrame();
		window.setSize(750,750);
		window.setVisible(true);
		window.setLayout(null);
		
		

		return window;
	}

	public static void main(String args[])
	{
		MainMenuView gamePlay = new MainMenuView();
		gamePlay.window();
	}


}
