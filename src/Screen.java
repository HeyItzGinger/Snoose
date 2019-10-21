import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

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
	String[] aniWrds = {"frog", "penguin", "skunk", "panda", "squid"};
	String[] plaWrds = {"paris", "athens", "rome", "louisana", "washington"};
	String[] basWrds = {"yeet", "oop", "sksksk", "ily", "tea"};
	
	HashMap<String, ArrayList<String>> hints = new HashMap<String, ArrayList<String>>();
	
public Screen(JFrame frame) {
	this.frame = frame;
	panel = new JPanel();
	panel.setLayout(new GridBagLayout());
	gc = new GridBagConstraints();
	frame.pack();
	
	for(int a = 0; a < aniWrds.length; a++) {
		ArrayList<String> h = new ArrayList <String>();
		hints.put(aniWrds[a], h);
	}
	hints.get("frog").add("It can be slimy");
	hints.get("frog").add("Can be many different color, but is most commonly green");
	hints.get("frog").add("Is THE CUTEST animal um.. ever.");
	
	hints.get("penquin").add("They 'propose' to eachother by gifting them a rock");
	hints.get("penquin").add("Can't fly, but is a bird");
	hints.get("penquin").add("Inhabit colder areas");
	
	hints.get("skunk").add("Black and white");
	hints.get("skunk").add("Furry");
	hints.get("skunk").add("With _____, they can temporarily blind a human if it's sprayed in the eyes");
	
	hints.get("panda").add("Can be black and white or red and white");
	hints.get("panda").add("Species of bear");
	hints.get("panda").add("BAMBOO");
	
	hints.get("squid").add("Similar to an octopus");
	hints.get("squid").add("Can be giant or noramal sized");
	hints.get("squid").add("Shoots ink");
	for(int p = 0; p < plaWrds.length; p++) {
		ArrayList<String> x = new ArrayList <String>();
		hints.put(plaWrds[p], x);
	}
	for(int b = 0; b < basWrds.length; b++) {
		ArrayList<String> y = new ArrayList<String>();
		hints.put(basWrds[b], y);
	}
	
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
