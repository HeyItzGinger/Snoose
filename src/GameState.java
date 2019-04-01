import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameState extends Screen implements ActionListener {
	JLabel hangmanImage1;
	JLabel hangmanImage2;
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
		hangmanImage1 = createLabelImage("pixil-girl-0.png");
		gc.gridx = 0;
		gc.gridy = 0;
		panel.add(hangmanImage1);
		hangmanImage2 = createLabelImage("pixil-boy-0.png");
		
		gc.gridx = 0;
		gc.gridy = 1;
		panel.add(text);
		
		gc.gridx = 0;
		gc.gridy = 2;
		panel.add(answer);
		
		answer.addActionListener(this);
		panel.repaint();
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
