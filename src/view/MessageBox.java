package view;

import javax.swing.JOptionPane;

public class MessageBox extends JOptionPane{
//
	MessageBox(String messageString){
		super(messageString);
		super.showMessageDialog(null, messageString, "",JOptionPane.WARNING_MESSAGE);
	}

}
