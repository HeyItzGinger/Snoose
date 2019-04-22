import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuState extends Screen {
JLabel label;
JLabel label2;
JLabel label3;

JButton animals;
JButton places;
JButton objects;
	public MenuState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 255, 187);
		// TODO Auto-generated constructor stub
		label = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		
		animals = new JButton ("Animals");
		places = new JButton ("Places");
		objects = new JButton ("Objects");
	}



public void drawMenuScreen() {
	frame.add(panel);
	panel.setBackground(backgroundColor);
	gc.gridx = 0;
	gc.gridy = 0;
	panel.add(label, gc);
	label.setFont(new Font( "Nanum Pen Script", Font.PLAIN, 200));
	label.setText("Snoose");
	gc.gridx = 0;
	gc.gridy = 1;
	panel.add(label2, gc);
	label2.setFont(new Font("Nanum Pen Script", Font.PLAIN, 90));
	label2.setText("Press any key to continue");
	gc.gridx = 0;
	gc.gridy = 2;
	panel.add(label3, gc);
	label3.setFont(new Font("Nanum Pen Script", Font.PLAIN, 50));
	label3.setText("But first, choose a category...");
	gc.gridx = 0;
	gc.gridy = 3;
	panel.add(label3, gc);
	label3.add(animals);
	label3.add(places);
	label3.add(objects);
	
	panel.repaint();
	frame.pack();
}
}
