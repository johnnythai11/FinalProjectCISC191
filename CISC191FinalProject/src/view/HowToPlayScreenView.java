package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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



public class HowToPlayScreenView extends JFrame
{

	final int SCREEN_WIDTH = 900;
	final int SCREEN_HEIGHT = 1000;

	JPanel mainPanel;
	JFrame mainFrame;
	JButton backToMainMenu;
	JTextArea instructions;
	JScrollPane instructionScroll;
	JPanel instructionPanel;
	File HowtoPlay;

	/*
	 * Constructor for how to play screen
	 */
	HowToPlayScreenView()
	{
		super("Chicken Fighter Instructions");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setResizable(false);

		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setLocation(900, 1000);
		setPanels();
		add(mainPanel);
		setVisible(true);
	}
	/*
	 * sets the button and JTextField
	 */
	private void setPanels() 
	{

		final int BUTTON_WIDTH = 150;
		final int BUTTON_HEIGHT = 50;

		final int instructions_WIDTH = 700;
		final int instructions_HEIGHT = 650;

		int verticalOffset = 75;
		int offsetWidthOfButton = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightOfButton = ((SCREEN_HEIGHT - BUTTON_HEIGHT)) - verticalOffset;
		backToMainMenu = new JButton("Back To Main Menu");
		backToMainMenu.setBounds(offsetWidthOfButton,offsetHeightOfButton,BUTTON_WIDTH,BUTTON_HEIGHT);
		mainPanel.add(backToMainMenu);

		int verticalOffset2 = 325;
		int offsetWidthOfinstructions = ((SCREEN_WIDTH - instructions_WIDTH) / 2);
		int offsetHeightOfinstructions = ((SCREEN_HEIGHT - instructions_HEIGHT)) - verticalOffset2;
		instructionScroll = new JScrollPane();
		instructionScroll.setSize(instructions_WIDTH,instructions_HEIGHT);

		instructionScroll.setBounds(offsetWidthOfinstructions,offsetHeightOfinstructions,instructions_WIDTH,instructions_HEIGHT);
		instructionScroll.setOpaque(true);
		instructionScroll.setVisible(true);
		instructionScroll.setWheelScrollingEnabled(true);



		//reads the file
		File file = new File("HowToPlay.txt");
		instructions = new JTextArea();
		instructions.setOpaque(true);
		instructions.setVisible(true);


		try (Scanner reading = new Scanner(file))

		{

			System.out.println("File Found");


			while (reading.hasNext()) 
			{
				String line2 = reading.nextLine();
				instructions.append(line2 +"\n");
				instructions.setLineWrap(true);
				instructions.setSize(instructions_WIDTH ,instructions_HEIGHT);
				instructions.setOpaque(true);
				instructions.setVisible(true);
				instructions.setEditable(false);
				System.out.println(line2);
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("not Found");
			e.printStackTrace();
		}
		instructionScroll.add(instructions);
		instructionScroll.setVisible(true);
		mainPanel.add(instructions);
		mainPanel.setVisible(true);
	}


	public static void main(String args[])
	{
		HowToPlayScreenView fightScreen = new HowToPlayScreenView();
	}

}
