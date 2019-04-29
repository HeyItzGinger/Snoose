import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen {
	JFrame frame;
	JPanel panel;
	Color backgroundColor;;
	GridBagConstraints gc;
	
public Screen(JFrame frame) {
	this.frame = frame;
	panel = new JPanel();
	panel.setLayout(new GridBagLayout());
	gc = new GridBagConstraints();
	frame.pack();
	
	}
public JLabel createLabelImage(String file) {
	URL imageURl = getClass().getResource(file);
	if(imageURl == null) {
		System.err.println("Could not find image " + file);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURl);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
public void removeScreen() {
	this.frame.getContentPane().remove(panel);
	this.panel.removeAll();
}
}
