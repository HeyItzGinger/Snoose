import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameState extends Screen implements ActionListener, MouseListener {
	JLabel hangmanImage1;
	JLabel hangmanImage2;
	JTextField text;
	JTextField word;
	JButton submit;
	Random rand = new Random();
	String spaces;
	char[] answer;
	String strAnswer;
	static String secretWrd;
	int c = 0;
	boolean showHint;
	ArrayList<String> h;
	int hintNum = 0;
	int catNum = 0;
	boolean hintRequest = false;
	boolean correctResponse = false;

	public GameState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 170, 187);
		text = new JTextField(1);
		submit = new JButton("Guess");
		word = new JTextField();
		hangmanImage1 = createLabelImage("pixil-girl-0.png");
		hangmanImage1.addMouseListener(this);

		// TODO Auto-generated constructor stub
	}

	public void drawGameScreen() {
		frame.add(this);
		this.setBackground(backgroundColor);
		int wrdLength = rand.nextInt(category.length);
		catNum = wrdLength;

		h = hints.get(category);

		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		this.add(hangmanImage1, gc);

		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 2;
		gc.weighty = 1;
		this.add(text, gc);

		gc.gridx = 0;
		gc.gridy = 2;
		gc.weightx = 2;
		gc.weighty = 1;
		this.add(submit, gc);

		gc.gridx = 0;
		gc.gridy = 3;
		gc.weightx = 2;
		gc.weighty = 1;
		this.add(word, gc);

		submit.addActionListener(this);

		secretWrd = category[wrdLength];

		answer = new char[secretWrd.length()];

		for (int i = 0; i < secretWrd.length(); i++) {
			answer[i] = '_';
		}

		strAnswer = new String(answer);
		word.setText(strAnswer);
		submit.addActionListener(this);
		frame.pack();
		this.revalidate();
		this.repaint();

	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawString("" + GamePanel.counter, 20, 20);
		System.out.println(GamePanel.counter);

		System.out.println("paint");

		if (hintRequest == true) {
			g.drawString(getHint(), 560, 122);
			hintRequest = false;
		}

		if (showHint) {
			showHint = false;
			if (hintNum < hints.get(category[catNum]).size()) {
				System.out.println(catNum);
				System.out.println(hintNum);

			}
			if (h != null) {
				if (hintNum > h.size()) {

				}
			}

		}

	}

	static String getAnswer() {
		return secretWrd;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < secretWrd.length(); i++) {
			if (secretWrd.charAt(i) == text.getText().charAt(0)) {
				answer[i] = text.getText().charAt(0);
				strAnswer = new String(answer);
				word.setText(strAnswer);
				if(strAnswer.equals(secretWrd)) {
					GamePanel.state = GamePanel.END;
					GamePanel.selectScreen();
					System.out.println("pressed");
				}
				System.out.println(secretWrd + " is the word. your guess is correct");
				

			} else {
				System.out.println(secretWrd + " is the word. your guess is incorrect");
			}
		}
		this.repaint();
		System.out.println("paint (2)");
	}

	public String getHint() {
		System.out.println(catNum);
		System.out.println(hintNum);
		String hintString = hints.get(category[catNum]).get(hintNum);
		hintNum++;
		hintNum = hintNum % 3;
		return hintString;

	}
	
	public boolean isAnswerCorrect() {
		return correctResponse;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Point p = e.getPoint();
		if (p.x >= 100 && p.x <= 350) {
			showHint = true;
			System.out.println("here");

			hintRequest = true;
		}
		if (p.y >= 10 && p.y <= 460) {

		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
