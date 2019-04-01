
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EndState extends Screen{
	JLabel label;
	public EndState(JFrame frame) {
		super(frame);
		
		backgroundColor = new Color(255, 204, 204);
		label = new JLabel();
		// TODO Auto-generated constructor stub
	}
	public void drawEndScreen() {
		frame.add(panel);
		panel.add(label);
		panel.setBackground(backgroundColor);
		label.setFont(new Font("Tahoma", Font.PLAIN, 80));
		label.setText("GAME OVER");
		panel.repaint();
		frame.pack();
	}

}
