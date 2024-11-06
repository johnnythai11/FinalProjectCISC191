package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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

public class InventoryView extends JFrame
{

	private JLabel[] itemSlots = new JLabel[20];
	private JButton[] itemButtons = new JButton[20];
	private JTextArea[] itemSlotsText = new JTextArea[20];
	private JButton closeShopButton = new JButton("Exit");

	// Margins around the top and left side of screen, margins between each panel X, Y
	private final int margins = 15, betweenMarginsY = 30, betweenmarginsX = 10;


	// Changes lenght, width of the panels and the relating variables that depend on it
	private final int panelLengthWidth = 100;

	//amount of Jpanels per row
	private final int amountPerRow = 5;


	final int SCREEN_WIDTH = 650, SCREEN_HEIGHT = 800;
	public InventoryView()
	{
		super("Inventory/Equipment");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setResizable(false);
		super.setLayout(null);
		setInventorySlots(itemSlots);
		setInventoryButtons(itemButtons, itemSlotsText);
		setCloseButton();
		setVisible(true);
	}


	public static void main(String[] args)
	{
		new InventoryView();
	}

	// Sets the Inventory Panels
	private void setInventorySlots(JLabel[] theLabels)
	{
		// offsets to be used later, DO NOT CHANGE 
		int yOffset = 0, xOffset = 0;

		// Populates the array with JLabels, Sets them blue, and aligns them
		for (int i = 0; i < theLabels.length; i++)
		{
			//For each "slot" in the array, create JPanel
			theLabels[i] = new JLabel("Insert Icon");
			theLabels[i].setBackground(Color.BLUE);
			theLabels[i].setOpaque(true);
			// amountPerRow changes amountPerRow
			if (xOffset > (panelLengthWidth * amountPerRow))
			{
				xOffset = 0;
				yOffset = yOffset + panelLengthWidth + margins + betweenMarginsY;
			}
			theLabels[i].setBounds(xOffset + margins, yOffset + margins, panelLengthWidth , panelLengthWidth );
			add(theLabels[i]);
			xOffset = xOffset + panelLengthWidth + margins + betweenmarginsX;	
		}
	}

	//sets the Stock Buttons
	private void setInventoryButtons(JButton[] theButtons, JTextArea[] theText)
	{
		// offsets to be used later, DO NOT CHANGE 
		int yOffset = 100, xOffset = 0;
		for (int i = 0; i < theButtons.length; i ++)
		{


			if ( i == 16)
			{
				theButtons[i] = new JButton("Remove");
				theButtons[i].setVisible(false);
				theText[i] = new JTextArea("Head");
				theText[i].setEditable(false);
			}
			else if(i == 17)
			{
				theButtons[i] = new JButton("");
				theButtons[i].setOpaque(false);
				theButtons[i].setContentAreaFilled(false);
				theButtons[i].setBorderPainted(false);
				theText[i] = new JTextArea("Body");
				theText[i].setEditable(false);
			}
			else if(i == 18)
			{
				theButtons[i] = new JButton("");
				theButtons[i].setOpaque(false);
				theButtons[i].setContentAreaFilled(false);
				theButtons[i].setBorderPainted(false);
				theText[i] = new JTextArea("Foot");
				theText[i].setEditable(false);
			}
			else if(i == 19)
			{
				theButtons[i] = new JButton("");

				theButtons[i].setOpaque(false);
				theButtons[i].setContentAreaFilled(false);
				theButtons[i].setBorderPainted(false);
				theText[i] = new JTextArea("MISC");
				theText[i].setEditable(false);
			}


			else
			{
				theButtons[i] = new JButton("Add");
				theText[i] = new JTextArea();
			}

			if (xOffset > (panelLengthWidth * amountPerRow))
			{
				xOffset = 0;
				yOffset = yOffset + panelLengthWidth + margins + betweenMarginsY;
			}

			theButtons[i].setBounds(xOffset + margins, yOffset + margins + 10, panelLengthWidth , 25);
			theText[i].setBounds(xOffset + margins, yOffset + margins + 10, panelLengthWidth , 25);
			add(theButtons[i]);	
			add(theText[i]);
			xOffset = xOffset + panelLengthWidth + margins + betweenmarginsX;	
		}
	}

	private void setCloseButton()
	{
		//closeShopButton.setBounds((int)(panelLengthWidth * 4.5),(int) (panelLengthWidth * 4.5), (int) (panelLengthWidth * 1.5), 25);
		closeShopButton.setBounds(450,650,100,50);
		add(closeShopButton);
	}

}
