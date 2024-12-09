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

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Items;

public class InventoryView extends JFrame {

	private JLabel[] itemSlots = new JLabel[20];
	private JButton[] removeItemButton = new JButton[20];
	private JButton[] addItemButtons = new JButton[20];
	private JLabel[] itemSlotsText = new JLabel[20];
	private JButton closeInventoryButton = new JButton("Exit");

	// Margins around the top and left side of screen, margins between each
	// panel X,
	// Y
	private final int margins = 30, betweenMarginsY = 90, betweenmarginsX = 10;

	// Changes length, width of the panels and the relating variables that
	// depend on
	// it
	private final int panelLengthWidth = 100;

	// amount of JPanels per row
	private final int amountPerRow = 9;

	final int SCREEN_WIDTH = 1100, SCREEN_HEIGHT = 800;

	/**
	 * Constructor to create the inventory view for the player
	 * 
	 */
	public InventoryView() {
		super("Inventory/Equipment");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		super.setLayout(null);
		setInventorySlots(itemSlots);
		setInventoryButtons(addItemButtons, itemSlotsText, removeItemButton);
		setCloseButton();
		update();
		setVisible(true);
	}

	/**
	 * Sets the Inventory Panels
	 * 
	 * @param theLabels
	 */
	private void setInventorySlots(JLabel[] theLabels) {
		// offsets to be used later, DO NOT CHANGE
		int yOffset = 0;
		int xOffset = 0;

		// Populates the array with JLabels, Sets them blue, and aligns them
		for (int i = 0; i < theLabels.length; i++) {
			// For each "slot" in the array, create JPanel
			theLabels[i] = new JLabel();
			// theLabels[i].setBackground(Color.white);
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

	/**
	 * Sets the Stock Buttons
	 * 
	 * @param theButtons
	 * @param theText
	 * @param removeButtons
	 */
	private void setInventoryButtons(JButton[] theButtons, JLabel[] theText, JButton[] removeButtons) {
		// offsets to be used later, DO NOT CHANGE
		int yOffset = 100, xOffset = 0;
		for (int i = 0; i < theButtons.length; i++) {
			switch (i) {
			case 16:
				theButtons[i] = new JButton("Unequip"); // MISC
				theButtons[i].setVisible(false);
				theText[i] = new JLabel();
				theText[i].setText("Misc");
				break;
			case 17:
				theButtons[i] = new JButton("Unequip"); // Head
				theText[i] = new JLabel();
				theText[i].setText("Head");
				theButtons[i].addActionListener(new UnequipEquipmentListener());
				break;
			case 18:
				theButtons[i] = new JButton("Unequip"); // body
				theText[i] = new JLabel();
				theText[i].setText("Body");
				theButtons[i].addActionListener(new UnequipEquipmentListener());
				break;
			case 19:
				theButtons[i] = new JButton("Unequip"); // claw
				theText[i] = new JLabel();
				theText[i].setText("Claw");
				theButtons[i].addActionListener(new UnequipEquipmentListener());
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

			if (i == 16 || i == 17 || i == 18 || i == 19) {

			} else {
				theButtons[i].addActionListener(new InventoryListenerEquipItems());
			}
			removeButtons[i].addActionListener(new RemoveItemsButton());
			theButtons[i].setBounds(xOffset + margins, yOffset + margins + 10, panelLengthWidth, 25);
			theText[i].setBounds(xOffset + margins, yOffset + margins - 120, panelLengthWidth, 25);
			removeButtons[i].setBounds(xOffset + margins, yOffset + margins + 40, panelLengthWidth, 25);
			add(removeButtons[i]);
			add(theButtons[i]);
			add(theText[i]);
			xOffset = xOffset + panelLengthWidth + margins + betweenmarginsX;
		}
	}

	/**
	 * Sets the close button for the inventory
	 * 
	 */
	private void setCloseButton() {
		closeInventoryButton.setBounds(450, 650, 100, 50);
		closeInventoryButton.addActionListener(new CloseButtonListener());
		add(closeInventoryButton);
	}

	/**
	 * Updates the player inventory and equipment
	 * 
	 */
	private void update() {
		for (int i = 0; i < 16; i++) {
			if (!CombatView.getPlayer().playerInventory.itemExist(i)) { // No item
				disable(i);
			} else { // Found Item
				enable(i);
				showIcon(i);
				itemSlotsText[i].setText(CombatView.getPlayer().playerInventory.getItem(i).getItemName());
			}

		}
		for (int index = 16; index < 20; index++)// Equipment Stuff
		{
			if (!CombatView.getPlayer().isItemEquipped(index - 16)) // offsets index
			// to pull
			// correctly
			// from
			// equipment
			{

				disable(index);

				if (index == 16) // special case for hearts
				{
					enable(index);
					itemSlotsText[index].setText("Hearts : " + CombatView.getPlayer().heartCounter);
					itemSlots[index].setIcon(MainMenuView.gameAssets[2]);

				}
			} else { // Found Equipped Item!
				enable(index);
				// showIcon(index);
				itemSlotsText[index].setText(CombatView.getPlayer().getEquippedItem(index - 16).getItemName());
				showEquippedIcon(index);

			}
		}

		CharacterSelectionView.combatGUI.updateInfo();

	}

	/**
	 * Method to set the Buttons and Texts visible when needed
	 * 
	 * @param index
	 */
	private void enable(int index) {
		itemSlotsText[index].setVisible(true);
		addItemButtons[index].setVisible(true);
		removeItemButton[index].setVisible(true);
		itemSlots[index].setVisible(true);
		addItemButtons[index].setEnabled(true);
		removeItemButton[index].setEnabled(true);
		addItemButtons[16].setVisible(false);
		removeItemButton[16].setVisible(false);
	}

	/**
	 * Method to set the Buttons and Texts not visible when needed
	 * 
	 * @param index
	 */
	private void disable(int index) {
		itemSlotsText[index].setVisible(false);
		addItemButtons[index].setVisible(false);
		removeItemButton[index].setVisible(false);
		itemSlots[index].setVisible(false);
		addItemButtons[index].setEnabled(false);
		removeItemButton[index].setEnabled(false);

	}

	/**
	 * Method to show the game images in a certain slot as needed
	 * 
	 * @param index
	 */
	private void showIcon(int index) {
		int itemTier = CombatView.getPlayer().playerInventory.getItem(index).getItemTier();
		int itemType = CombatView.getPlayer().playerInventory.getItem(index).getItemType();

		if (itemType == 0) // heart
		{

			itemSlots[index].setIcon(MainMenuView.gameAssets[2]);

		} else if (itemType == 1) // helmet
		{

			itemSlots[index].setIcon(MainMenuView.gameAssets[3]);
		} else if (itemType == 2) // chestPlate
		{

			if (itemTier == 0) // Shield
			{
				itemSlots[index].setIcon(MainMenuView.gameAssets[4]);
			} else {
				itemSlots[index].setIcon(MainMenuView.gameAssets[0]);
			}

		} else if (itemType == 3) // claw
		{

			if (itemTier == 0) // staff
			{
				itemSlots[index].setIcon(MainMenuView.gameAssets[5]);
			} else {
				itemSlots[index].setIcon(MainMenuView.gameAssets[1]);
			}
		}

	}

	/**
	 * 
	 * @param index Index of of the array, minus 16 to access equipped item.
	 */
	private void showEquippedIcon(int index) {
		int itemTier = CombatView.getPlayer().getEquippedItem(index - 16).getItemTier();
		int itemType = CombatView.getPlayer().getEquippedItem(index - 16).getItemType();

		if (itemType == 0) // heart
		{

			itemSlots[index].setIcon(MainMenuView.gameAssets[2]);

		} else if (itemType == 1) // helmet
		{

			itemSlots[index].setIcon(MainMenuView.gameAssets[3]);
		} else if (itemType == 2) // chestPlate
		{

			if (itemTier == 0) // Shield
			{
				itemSlots[index].setIcon(MainMenuView.gameAssets[4]);
			} else {
				itemSlots[index].setIcon(MainMenuView.gameAssets[0]);
			}

		} else if (itemType == 3) // claw
		{

			if (itemTier == 0) // staff
			{
				itemSlots[index].setIcon(MainMenuView.gameAssets[5]);
			} else {
				itemSlots[index].setIcon(MainMenuView.gameAssets[1]);
			}
		}

	}

	/**
	 * Button to equip the item to the player's equipment slots accordingly to type
	 * of gear
	 * 
	 */
	private class InventoryListenerEquipItems implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Integer index = null;
			for (int i = 0; i < addItemButtons.length; i++) {

				if (e.getSource() == addItemButtons[i]) {
					index = CombatView.getPlayer().playerInventory.getItem(i).getItemType();

					if (!CombatView.getPlayer().isItemEquipped(index)) {
						boolean isEquipped = CombatView.getPlayer().equipEquipmentItem(i);
						if (isEquipped) {
							CombatView.getPlayer().playerInventory
									.removeItemFromInventory(CombatView.getPlayer().playerInventory.getItem(i));
							update();
						} else {
							// System.out.println("Reach Messagebox");
							new MessageBox("Not Right Class To Equip");
							update();
						}
						CombatView.getPlayer().resetPlayer();
						update();
					}

				}

			}
		}

	}

	/**
	 * Button to un-equip the player's equipped gear
	 * 
	 */
	private class UnequipEquipmentListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (CombatView.getPlayer().playerInventory.roomExist()) {
				for (int i = 0; i < addItemButtons.length; i++) {
					if (e.getSource() == addItemButtons[i]) {
						CombatView.getPlayer().playerInventory
								.addItemToInventory(CombatView.getPlayer().getEquippedItem(i - 16));
						CombatView.getPlayer().removeEquippedItem(i - 16);
						CombatView.getPlayer().resetPlayer();
						update();
					}
				}
			}
		}

	}

	/**
	 * Button to remove the items from the player's inventory
	 * 
	 */
	private class RemoveItemsButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			for (int i = 0; i < removeItemButton.length; i++) {

				if (e.getSource() == removeItemButton[i]) {

					if (i == 16 || i == 17 || i == 18 || i == 19) {
						CombatView.getPlayer().removeEquippedItem(i - 16);
						// System.out.println("item is removed from inventory.");
						CombatView.getPlayer().resetPlayer();
						update();
					} else

						CombatView.getPlayer().playerInventory
								.removeItemFromInventory(CombatView.getPlayer().playerInventory.getItem(i));
					CombatView.getPlayer().resetPlayer();
					update();

				}
			}
		}

	}

	/**
	 * Button to close the inventory view
	 * 
	 */
	private class CloseButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

}
