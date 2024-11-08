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

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MainMenuView extends JFrame {

	private JButton howToPlayButton;
	private JButton charecterSelectScreenButton;
	private JPanel mainPanel;

	final int SCREEN_WIDTH = 750, SCREEN_HEIGHT = 800;


	MainMenuView()
	{


		super("Main Menu");
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
		final int BUTTON_WIDTH = 150;
		final int BUTTON_HEIGHT = 50;
		int verticalOffset = 75;

		int offsetLengthChar = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightChar = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 2) - verticalOffset;

		int offsetLengthHow = ((SCREEN_WIDTH - BUTTON_WIDTH) / 2);
		int offsetHeightHow = ((SCREEN_HEIGHT - BUTTON_HEIGHT) / 2) + verticalOffset;


		charecterSelectScreenButton = new JButton("Charecter Selection");
		howToPlayButton = new JButton("How To Play");
		
		charecterSelectScreenButton.addActionListener(new CharacterSelectListener());
		howToPlayButton.addActionListener(new HowToPlayListener());

		charecterSelectScreenButton.setBounds(offsetLengthChar,offsetHeightChar,BUTTON_WIDTH,BUTTON_HEIGHT);
		howToPlayButton.setBounds(offsetLengthHow, offsetHeightHow, BUTTON_WIDTH, BUTTON_HEIGHT);


		mainPanel.add(charecterSelectScreenButton);
		mainPanel.add(howToPlayButton);
	}

	public static void main(String[] args)
	{
		new MainMenuView();

	}
	
	private class CharacterSelectListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			new CharacterSelectionView();
			dispose();
		}
		
	}
	
	private class HowToPlayListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			new HowToPlayScreenView();
			dispose();
		}
		
	}
}
