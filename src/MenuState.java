import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuState extends Screen {
JLabel label;
JLabel label2;
	public MenuState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 255, 187);
		// TODO Auto-generated constructor stub
		label = new JLabel();
		label2 = new JLabel();
	}



public void drawMenuScreen() {
	frame.add(panel);
	panel.setBackground(backgroundColor);
	gc.gridx = 0;
	gc.gridy = 0;
	panel.add(label, gc);
	label.setFont(new Font( "Nanum Pen Script", Font.PLAIN, 200));
	label.setText("Snoose");
	gc.gridx = 1;
	gc.gridy = 1;
	panel.add(label2, gc);
	label2.setFont(new Font("Nanum Brush Script", Font.PLAIN, 50));
	label2.setText("Press any key to continue");
	panel.repaint();
	frame.pack();
}
}
