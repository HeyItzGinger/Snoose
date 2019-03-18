import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameState extends Screen {
	JLabel hangmanImage;
	JTextField text;
	JButton answer;

	public GameState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 170, 187);
		text = new JTextField();
		answer = new JButton("Guess");
		// TODO Auto-generated constructor stub
	}

	public void drawGameScreen() {
		frame.add(panel);
		panel.setBackground(backgroundColor);
		

	}
}
