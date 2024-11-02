package view;
import javax.swing.JFrame;
import javax.swing.JPanel;

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

	CombatView()
	{
		super("Chicken Fighter");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setResizable(false);
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		setPanels();
		add(mainPanel);
		setVisible(true);
	}

	private void setPanels()
	{

	}


	public static void main(String args[])
	{
		CombatView fightScreen = new CombatView();
	}

}
