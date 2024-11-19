package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Equipment;
import model.Items;
import model.PlayerChicken;

/**
 * Lead Author(s):
 * 
 * @author Full name: Johnny Thai
 * @author Full name: Jacob Wiemann
 * @author Full name: Daniel Soto
 *
 *         Other Contributors: none
 *
 *         References: Morelli, R., & Walde, R. (2016). Java, Java, Java:
 *         Object-Oriented Problem Solving
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 *         Version: 2024-10-16
 * 
 */

public class InventoryView extends JFrame {


	private JLabel[] itemSlots = new JLabel[20];
	private JButton[] removeItemButton = new JButton[20];
	private JButton[] additemButtons = new JButton[20];
	private JLabel[] itemSlotsText = new JLabel[20];
	private JButton closeShopButton = new JButton("Exit");

	// Margins around the top and left side of screen, margins between each panel X,
	// Y
	private final int margins = 30, betweenMarginsY = 90, betweenmarginsX = 10;

	// Changes lenght, width of the panels and the relating variables that depend on
	// it
	private final int panelLengthWidth = 100;

	// amount of Jpanels per row
	private final int amountPerRow = 9;

	final int SCREEN_WIDTH = 1100, SCREEN_HEIGHT = 800;

	public InventoryView() {
		super("Inventory/Equipment");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		super.setLayout(null);
		setInventorySlots(itemSlots);

		setInventoryButtons(additemButtons, itemSlotsText, removeItemButton);
		setCloseButton();
		update();
		setVisible(true);
	}

	public static void main(String[] args) {
		new InventoryView();
	}

	// Sets the Inventory Panels
	private void setInventorySlots(JLabel[] theLabels) {
		// offsets to be used later, DO NOT CHANGE
		int yOffset = 0, xOffset = 0;

		// Populates the array with JLabels, Sets them blue, and aligns them
		for (int i = 0; i < theLabels.length; i++) {
			// For each "slot" in the array, create JPanel
			theLabels[i] = new JLabel("Insert Icon");
			theLabels[i].setBackground(Color.white);
			theLabels[i].setOpaque(true);
			// amountPerRow changes amountPerRow
			if (xOffset > (panelLengthWidth * amountPerRow)) {
				xOffset = 0;
				yOffset = yOffset + panelLengthWidth + margins + betweenMarginsY;
			}
			theLabels[i].setBounds(xOffset + margins, yOffset + margins, panelLengthWidth, panelLengthWidth);
			add(theLabels[i]);
			xOffset = xOffset + panelLengthWidth + margins + betweenmarginsX;
		}
	}

	// sets the Stock Buttons
	private void setInventoryButtons(JButton[] theButtons, JLabel[] theText, JButton[] removeButtons) {
		// offsets to be used later, DO NOT CHANGE
		int yOffset = 100, xOffset = 0;
		for (int i = 0; i < theButtons.length; i++) {

			switch (i) {
				case 16:
					theButtons[i] = new JButton("Unequip"); // MISC
					theText[i] = new JLabel();
					theText[i].setText("Misc");
					break;
				case 17:
					theButtons[i] = new JButton("Unequip"); // Head
					theText[i] = new JLabel();
					theText[i].setText("Head");
					break;
				case 18:
					theButtons[i] = new JButton("Unequip"); // body
					theText[i] = new JLabel();
					theText[i].setText("Body");
					break;
				case 19:
					theButtons[i] = new JButton("Unequip"); // claw
					theText[i] = new JLabel();
					theText[i].setText("Claw");
					break;
				default:
					theButtons[i] = new JButton("Equip");
					theText[i] = new JLabel();
					theText[i].setText("Item name");
			}

			removeButtons[i] = new JButton("Delete");
			theText[i].setOpaque(true);

			if (xOffset > (panelLengthWidth * amountPerRow)) {
				xOffset = 0;
				yOffset = yOffset + panelLengthWidth + margins + betweenMarginsY;
			}

			theButtons[i].addActionListener(new InventoryListenerEquipItems());
			theButtons[i].setBounds(xOffset + margins, yOffset + margins + 10, panelLengthWidth, 25);
			theText[i].setBounds(xOffset + margins, yOffset + margins - 120, panelLengthWidth, 25);
			removeButtons[i].setBounds(xOffset + margins, yOffset + margins + 40, panelLengthWidth, 25);
			add(removeButtons[i]);
			add(theButtons[i]);
			add(theText[i]);
			xOffset = xOffset + panelLengthWidth + margins + betweenmarginsX;
		}
	}

	private void setCloseButton() {
		// closeShopButton.setBounds((int)(panelLengthWidth * 4.5),(int)
		// (panelLengthWidth * 4.5), (int) (panelLengthWidth * 1.5), 25);
		closeShopButton.setBounds(450, 650, 100, 50);
		closeShopButton.addActionListener(new CloseButtonListener());
		add(closeShopButton);
	}

	private void update() {
		for (int i = 0; i < 16; i++) {
			if (!CombatView.player.playerInventory.itemExist(i)) {
				itemSlotsText[i].setVisible(false);
				additemButtons[i].setVisible(false);
				removeItemButton[i].setVisible(false);
				itemSlots[i].setVisible(false);
				additemButtons[i].setEnabled(false);
				removeItemButton[i].setEnabled(false);

			} else {
				itemSlotsText[i].setVisible(true);
				additemButtons[i].setVisible(true);
				removeItemButton[i].setVisible(true);
				itemSlots[i].setVisible(true);
				additemButtons[i].setEnabled(true);
				removeItemButton[i].setEnabled(true);

				itemSlotsText[i].setText(CombatView.player.playerInventory.getItem(i).getItemName());
			}
		}

	}

	private class InventoryListenerEquipItems implements ActionListener 
	{	

		@Override
		public void actionPerformed(ActionEvent e) {
			//Integer removeItemLater = null;
			Integer index = null;
			for (int i = 0; i < additemButtons.length; i++)
			{

				if (e.getSource() == additemButtons[i])
				{
					index = CombatView.player.playerInventory.getItem(i).getItemType();

					if (!CombatView.player.isItemEquipped(index))
					{
						CombatView.player.equipEquipmentItem(i);
						CombatView.player.playerInventory.removeItemFromInventory(CombatView.player.playerInventory.getItem(i));
						CombatView.player.resetPlayer();
						update(); // this <----------
					}

					//itemExists = CombatView.player.playerInventory.itemExist(i);


				}


			}


		}

	}



	private class CloseButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}


}
