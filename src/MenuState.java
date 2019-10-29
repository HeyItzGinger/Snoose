import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuState extends Screen implements ActionListener {
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
	frame.add(this);
	animals.addActionListener(this);
	places.addActionListener(this);
	basicTerms.addActionListener(this);
	animals.setFocusable(false);
	places.setFocusable(false);
	basicTerms.setFocusable(false);
	
	this.setBackground(backgroundColor);
	gc.gridx = 0;
	gc.gridy = 0;
	gc.weightx = 0;
	gc.weighty = 0;
	
	label.setFont(new Font( "DIN Condensed", Font.PLAIN, 196));
	label.setText("Snoose");
	gc.gridx = 0;
	gc.gridy = 1;
	gc.weightx = 1;
	gc.weighty = 0;
	addJComponent(label,0, 1, 1, 0);
	//panel.add(label, gc);
	
	label2.setFont(new Font("DIN Condensed", Font.PLAIN, 70));
	label2.setText("Press any key to continue");
	gc.gridx = 0;
	gc.gridy = 2;
	gc.weightx = 1;
	gc.weighty = 1;
	//panel.add(label2, gc);
	addJComponent(label2, 0, 2, 1, 1);
	
	label3.setFont(new Font("DIN Condensed", Font.PLAIN, 50));
	label3.setText("But first, choose a category...");
	gc.gridx = 0;
	gc.gridy = 3;
	gc.weightx = 1;
	gc.weighty = 2; //panel.add(label3, gc);
	addJComponent(label3, 0, 3, 1, 2);
	
	//panel.add(animals, gc);
	gc.gridx = 0;
	gc.gridy = 4;
	gc.weightx = 0;
	gc.weighty = 1;
	addJComponent(animals, 0, 4, 1, 1);
	
	//panel.add(places, gc);
	gc.gridx = 1;
	gc.gridy = 5;
	gc.weightx = 1;
	gc.weighty = 1;
	addJComponent(places, 0, 5, 1, 1);
	
	//frame.pack();
	
	//panel.add(basicTerms, gc);
	gc.gridx = 1;
	gc.gridy = 6;
	gc.weightx = 1;
	gc.weighty = 2;
	addJComponent(basicTerms, 0, 6, 1, 2);
	
	frame.pack();
	this.repaint();
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Object source = e.getSource();
	if (source == animals) {
		category = aniWrds;
	}
	else if (source == places) {
		category = plaWrds;
	}
	else if(source == basicTerms) {
		category = basWrds;
	}
}


}
