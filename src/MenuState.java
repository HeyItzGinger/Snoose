import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuState extends Screen {
JLabel label;
JLabel label2;
JLabel label3;

JButton animals;
JButton places;
JButton basicTerms;
	public MenuState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 255, 187);
		// TODO Auto-generated constructor stub
		label = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		
		animals = new JButton ("Animals");
		places = new JButton ("Places");
		basicTerms = new JButton ("Basic Middle School Terminology");
	}



public void drawMenuScreen() {
	frame.add(panel);
	panel.setBackground(backgroundColor);
	gc.gridx = 0;
	gc.gridy = 0;
	gc.weightx = 1;
	gc.weighty = 0;
	
	label.setFont(new Font( "Nanum Pen Script", Font.PLAIN, 200));
	label.setText("Snoose");
	gc.gridx = 0;
	gc.gridy = 1;
	gc.weightx = 1;
	gc.weighty = 0;
	addJComponent()
	//panel.add(label, gc);
	
	label2.setFont(new Font("Nanum Pen Script", Font.PLAIN, 90));
	label2.setText("Press any key to continue");
	gc.gridx = 0;
	gc.gridy = 2;
	gc.weightx = 1;
	gc.weighty = 1;
	//panel.add(label2, gc);
	addJComponent(panel, label2, 0, 2, 1, 1);
	
	label3.setFont(new Font("Nanum Pen Script", Font.PLAIN, 50));
	label3.setText("But first, choose a category...");
	gc.gridx = 0;
	gc.gridy = 3;
	gc.weightx = 1;
	gc.weighty = 2; //panel.add(label3, gc);
	addJComponent(panel, label3, 0, 3, 1, 2);
	
	//panel.add(animals, gc);
	gc.gridx = 0;
	gc.gridy = 4;
	gc.weightx = 0;
	gc.weighty = 1;
	addJComponent(panel, animals, 0, 4, 0, 1);
	
	//panel.add(places, gc);
	gc.gridx = 1;
	gc.gridy = 5;
	gc.weightx = 1;
	gc.weighty = 1;
	addJComponent(panel, places, 1, 5, 1, 1);
	
	//frame.pack();
	
	//panel.add(basicTerms, gc);
	gc.gridx = 1;
	gc.gridy = 6;
	gc.weightx = 1;
	gc.weighty = 2;
	addJComponent(panel, basicTerms, 1, 6, 1, 2);
	
	panel.repaint();
	frame.pack();
}

void addJComponent (JPanel panel, JComponent jc, int x, int y, int wX, int wY) {
	GridBagConstraints c = new GridBagConstraints();
	c.gridx = x;
	c.gridy = y;
	c.weightx = wX;
	c.weighty = wY;
	
	panel.add(jc, c);
	
}
}
