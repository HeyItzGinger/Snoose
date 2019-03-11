import java.awt.Color;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Screen {
	JFrame frame;
	JPanel panel;
	Color backgroundColor;;
	GridBagConstraints gc;
public Screen(JFrame frame) {
	this.frame = frame;
	panel = new JPanel();
	gc = new GridBagConstraints();
	panel.setSize(Snoose.width, Snoose.height);
	frame.pack();
	
	}
}
