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
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.SaveLoad;
import javax.swing.*;

public class MainMenuView extends JFrame {

	private JButton howToPlayButton;
	private JButton charecterSelectScreenButton;
	private JButton loadButton;
	private JPanel mainPanel;
	final int SCREEN_WIDTH = 750, SCREEN_HEIGHT = 800;
	protected static ImageIcon[] gameAssets = new ImageIcon[11];

	/**
	 * Constructor to create the main menu screen with the three buttons needed
	 *
	 */
	public MainMenuView() {

		super("Main Menu");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		setPanels();
		setIcons();
		add(mainPanel);
		setVisible(true);
	}

	/**
	 * Method to set the images of the game
	 * 
	 */
	private void setIcons() {
		try {
			gameAssets[0] = new ImageIcon("./Assets/Chestplate.png");
			gameAssets[1] = new ImageIcon("./Assets/ClawIcon.png");
			gameAssets[2] = new ImageIcon("./Assets/Heart.png");
			gameAssets[3] = new ImageIcon("./Assets/Helmet.png");
			gameAssets[4] = new ImageIcon("./Assets/Shield.png");
			gameAssets[5] = new ImageIcon("./Assets/Staff.png");
			gameAssets[6] = new ImageIcon("./Assets/Chicken.png");
			gameAssets[7] = new ImageIcon("./Assets/EnemyChicken.png");
			gameAssets[8] = new ImageIcon("./Assets/MageChicken.png");
			gameAssets[9] = new ImageIcon("./Assets/TankChicken.png");
			gameAssets[10] = new ImageIcon("./Assets/MeleeChicken.png");
		} catch (Exception e) {
			new MessageBox("Assets Not Found", true);
			System.exit(100);
		}

	}

	/**
	 * Sets all the buttons needed for the main menu screen
	 * 
	 */
	private void setPanels() {
		final int BUTTON_WIDTH = 150;
		final int BUTTON_HEIGHT = 50;
		int verticalOffset = 75;

		int offsetLength = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightChar = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 2) - verticalOffset;

		int offsetHeightHow = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 2) + verticalOffset;

		int offsetHeightLoad = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 2) + verticalOffset / 18;

		charecterSelectScreenButton = new JButton("Character Selection");
		howToPlayButton = new JButton("How To Play");
		loadButton = new JButton("Load Game");

		charecterSelectScreenButton.addActionListener(new CharacterSelectListener());
		howToPlayButton.addActionListener(new HowToPlayListener());
		loadButton.addActionListener(new LoadListener());

		charecterSelectScreenButton.setBounds(offsetLength, offsetHeightChar, BUTTON_WIDTH, BUTTON_HEIGHT);
		howToPlayButton.setBounds(offsetLength, offsetHeightHow, BUTTON_WIDTH, BUTTON_HEIGHT);
		loadButton.setBounds(offsetLength, offsetHeightLoad, BUTTON_WIDTH, BUTTON_HEIGHT);

		mainPanel.add(charecterSelectScreenButton);
		mainPanel.add(howToPlayButton);
		mainPanel.add(loadButton);
	}

	/**
	 * loads the character selection screen for the player to choose their 3 classes
	 * to play
	 * 
	 */
	private class CharacterSelectListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new CharacterSelectionView();
			dispose();
		}
	}

	/**
	 * loads the how to play screen for the player to read the instructions
	 * 
	 */
	private class HowToPlayListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			new HowToPlayScreenView();
			dispose();
		}

	}

	/**
	 * loads the saved combat Screen with all the information needed
	 * 
	 */
	private class LoadListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			SaveLoad.binaryLoad();
			dispose();
		}
	}

	public static void main(String[] args) {
		new MainMenuView();
	}
}