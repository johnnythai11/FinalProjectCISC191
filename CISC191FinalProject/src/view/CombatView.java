package view;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.EnemyChicken;
import model.PlayerChicken;
import model.MeleeChicken;

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



public class CombatView extends JFrame
{

	final int SCREEN_WIDTH = 1500;
	final int SCREEN_HEIGHT = 1000;

	JPanel mainPanel;

	JButton inventory;
	JButton attack;
	JButton specialAttack;
	JButton retreat;
	JButton store;

	JPanel characterPanel;
	JPanel enemyPanel;

	JTextField characterInfo;
	JTextField enemyInfo;

	static PlayerChicken player = null;
	static EnemyChicken enemy = null;

	CombatView()
	{
		super("Chicken Fighter");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setResizable(false);
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		setButtons();
		setPanels();
		add(mainPanel);
		setVisible(true);
	}

	private void setButtons()
	{
		final int BUTTON_WIDTH = 150;
		final int BUTTON_HEIGHT = 50;

		int verticalOffset = 40;

		int offsetLengthInventory = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightInventory = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 5) - verticalOffset;

		int offsetLengthAttack = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightAttack = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 5) + verticalOffset;

		int offsetLengthSpecialAttack = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightSpecialAttack = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 5) + 3*verticalOffset;

		int offsetLengthRetreat = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightRetreat = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 5) + 5*verticalOffset;

		int offsetLengthStore = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightStore = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 5) + 7*verticalOffset;

		inventory = new JButton("Inventory");
		attack = new JButton("Attack");
		specialAttack = new JButton("Special Attack");
		retreat = new JButton("Retreat");
		store = new JButton("Store");

		inventory.setBounds(offsetLengthInventory,offsetHeightInventory,BUTTON_WIDTH,BUTTON_HEIGHT);
		attack.setBounds(offsetLengthAttack,offsetHeightAttack,BUTTON_WIDTH,BUTTON_HEIGHT);
		specialAttack.setBounds(offsetLengthSpecialAttack,offsetHeightSpecialAttack,BUTTON_WIDTH,BUTTON_HEIGHT);
		retreat.setBounds(offsetLengthRetreat,offsetHeightRetreat,BUTTON_WIDTH,BUTTON_HEIGHT);
		store.setBounds(offsetLengthStore,offsetHeightStore,BUTTON_WIDTH,BUTTON_HEIGHT);

		mainPanel.add(inventory);
		mainPanel.add(attack);
		mainPanel.add(specialAttack);
		mainPanel.add(retreat);
		mainPanel.add(store);
	}

	private void setPanels()
	{

		characterPanel = new JPanel();
		characterPanel.setSize(660,400);
		characterPanel.setLocation(0,10);
		characterPanel.setBackground(Color.BLUE);

		enemyPanel = new JPanel();
		enemyPanel.setSize(660,400);
		enemyPanel.setLocation(840,10);
		enemyPanel.setBackground(Color.BLUE);

		JTextArea characterInfo = new JTextArea(1,5);
		Font info = new Font("Times New Roman", Font.BOLD, 45);
		characterInfo.setFont(info);
		characterInfo.append("Health: " + player.getCurrentHealth() + "\n");
		characterInfo.append("Defense: " + player.getBaseDefense() + "\n");
		characterInfo.append("Attack: " + player.getBaseDamage() + "\n");
		characterInfo.append("Balance: " + player.getBoneBalance() + "\n");
		characterInfo.setEditable(false);
		characterInfo.setSize(660,400);
		characterInfo.setLocation(0,440);

		JTextArea enemyInfo = new JTextArea(1,5);

		enemyInfo.setFont(info);
		enemyInfo.append("Health: " + enemy.getMaxHealth() + "\n");
		enemyInfo.append("Defense: " + enemy.getDefense() + "\n");
		enemyInfo.append("Attack: " + enemy.getAttack() + "\n");
		enemyInfo.setEditable(false);
		enemyInfo.setSize(660,400);
		enemyInfo.setLocation(840,440);


		mainPanel.add(characterPanel);
		mainPanel.add(enemyPanel);
		mainPanel.add(characterInfo);
		mainPanel.add(enemyInfo);


	}


	public static void main(String args[])
	{
		player = new MeleeChicken(4);
		enemy = new EnemyChicken();

		CombatView fightScreen = new CombatView();

	}

}
