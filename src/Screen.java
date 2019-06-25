import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Screen {
	JFrame frame;
	JPanel panel;
	Color backgroundColor;;
	GridBagConstraints gc;
	//TO DO: change category once done w testing
	static String[] category ;
	String[] aniWrds = {"frog", "penguin", "skunk", "panda", "llama"};
	String[] plaWrds = {"Paris", "Athens", "Rome", "Guatemala", "Washington"};
	String[] basWrds = {"yeet", "wait there was homework?", "sksksk", "okur", "spill the tea sis"};
	
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
void addJComponent (JComponent jc, int x, int y, int wX, int wY) {
	GridBagConstraints c = new GridBagConstraints();
	c.gridx = x;
	c.gridy = y;
	c.weightx = wX;
	c.weighty = wY;
	
	this.panel.add(jc, c);
	
}
}
