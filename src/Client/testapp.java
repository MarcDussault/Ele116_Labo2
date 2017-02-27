package Client;

import javax.swing.JApplet;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JMenuBar;

public class testapp extends JApplet {

	/**
	 * Create the applet.
	 */
	public testapp() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("Titre");
		menuBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		menuBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		menuBar.add(btnNewButton_2);

	}

}
