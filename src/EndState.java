
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EndState extends Screen {
	JLabel label;
	JLabel label2;
	JLabel label3;

	public EndState(JFrame frame) {
		super(frame);

		backgroundColor = new Color(255, 204, 204);
		label = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		// TODO Auto-generated constructor stub
	}

	public void drawEndScreen() {
		frame.add(this);
		this.setBackground(backgroundColor);
		gc.gridx = 0;
		gc.gridy = 0;
		this.add(label, gc);
		label.setFont(new Font("Impact", Font.BOLD, 125));
		label.setText("GAME OVER");
		gc.gridx = 0;
		gc.gridy = 1;
		this.add(label2, gc);
		label2.setFont(new Font("Impact", Font.PLAIN, 90));
		label2.setText("The word was " + GameState.getAnswer() + "");
		gc.gridx = 0;
		gc.gridy = 2;
		this.add(label3, gc);
		label3.setFont(new Font("Impact", Font.PLAIN, 40));
		//label3.setText("Press any key if you'd like to restart");
		this.repaint();
		frame.pack();
	}

}
