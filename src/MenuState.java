import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuState extends Screen {
JLabel label;
	public MenuState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 255, 187);
		// TODO Auto-generated constructor stub
	}


public void drawMenuScreen() {
	frame.add(panel);
	panel.add(label);
	panel.setBackground(backgroundColor);
	label.setFont(new Font( "Zapfino", Font.PLAIN, 60));
	label.setText("Menu");
}
}
