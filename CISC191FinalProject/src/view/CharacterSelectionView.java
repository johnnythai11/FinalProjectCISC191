package view;

/**
 * Lead Author(s):
 * 
 * @author Full name: Johnny Thai
 * @author Full name: Jacob Wiemann
 * @author Full name: Daniel Soto
 *
 *         Other Contributors: none
 *
 *         References:
 *         Morelli, R., & Walde, R. (2016).
 *         Java, Java, Java: Object-Oriented Problem Solving
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 *         Version: 2024-10-16
 * 
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.MageChicken;
import model.MeleeChicken;
import model.TankChicken;

public class CharacterSelectionView extends JFrame
{
	final int SCREEN_WIDTH = 650, SCREEN_HEIGHT = 750;
	private JLabel characterIcon, statField;
	private JButton mage, tank, melee, confirmButton;
	private int setSelection = 0;

	CharacterSelectionView()
	{
		super("Select Your Fighter");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		setResizable(false);
		super.setLayout(null);
		setElements();
		setVisible(true);
	}

	private void setElements()
	{
		characterIcon = new JLabel();
		mage = new JButton("Mage");
		tank = new JButton("Tank");
		melee = new JButton("Melee");
		confirmButton = new JButton("Confirm");
		statField = new JLabel();

		statField.setText("Daniel is 5' 3'' ");
		statField.setOpaque(true);
		statField.setBackground(Color.RED);
		characterIcon.setBackground(Color.black);
		characterIcon.setOpaque(true);

		characterIcon.setBounds(25, 25, 250, 250);
		mage.setBounds(25, 290, 250, 50);
		tank.setBounds(25, 355, 250, 50);
		melee.setBounds(25, 420, 250, 50);
		confirmButton.setBounds(350, 290, 250, 50);
		statField.setBounds(350, 25, 250, 250);

		mage.addActionListener(new RPGListener());
		tank.addActionListener(new RPGListener());
		melee.addActionListener(new RPGListener());
		confirmButton.addActionListener(new ContinueListener());
		
		add(mage);
		add(tank);
		add(melee);
		add(confirmButton);
		add(statField);
		add(characterIcon);
	}

	public static void main(String[] args)
	{
		new CharacterSelectionView();
	}
	
	private class RPGListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == mage)
			{
				System.out.println("I'm A-Maging ba dum tiss");
				characterIcon.setBackground(Color.blue);
				setSelection = 1;
			}
			else if (e.getSource() == tank)
			{
				System.out.println("M1A2 Abrams");
				characterIcon.setBackground(Color.magenta);
				setSelection = 2;
			}
			else if (e.getSource() == melee)
			{
				System.out.println("Oi there you got a lisence for that stabbin?");
				characterIcon.setBackground(Color.red);
				setSelection = 3;
			}
			
		}
		
		
	}
	
	private class ContinueListener implements ActionListener
	{


		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			switch (setSelection){
				
				case 0:
					break;
				case 1:
					new CombatView(setSelection);
					dispose();
					break;
				case 2:
					new CombatView(setSelection);
					dispose();
					break;
				case 3:
					new CombatView(setSelection);
					dispose();
					break;
			}			
		}		
	}
}
