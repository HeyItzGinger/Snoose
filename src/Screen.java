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

public class Screen extends JPanel{
	JFrame frame;
	Color backgroundColor;;
	GridBagConstraints gc;
	//TO DO: change category once done w testing
	static String[] category ;
	String[] aniWrds = {"frog", "penguin", "skunk", "panda", "squid"};
	String[] plaWrds = {"france", "athens", "rome", "louisiana", "guatemala"};
	String[] basWrds = {"yeet", "oop", "sksksk", "ily", "tea"};
	
	HashMap<String, ArrayList<String>>
	hints = new HashMap<String, ArrayList<String>>();
	
public Screen(JFrame frame) {
	this.frame = frame;
	this.setLayout(new GridBagLayout());
	gc = new GridBagConstraints();
	frame.pack();
	
	for(int a = 0; a < aniWrds.length; a++) {
		ArrayList<String> h = new ArrayList <String>();
		hints.put(aniWrds[a], h);
	}
	
	for(int p = 0; p < plaWrds.length; p++) {
		ArrayList<String> i = new ArrayList <String>();
		hints.put(plaWrds[p], i);
	}
	
	for(int b = 0; b < basWrds.length; b++) {
		ArrayList<String> j = new ArrayList <String>();
		hints.put(basWrds[b], j);
	}


	//animals
	hints.get("frog").add("It can be slimy");
	hints.get("frog").add("Can be many different colors, but is most commonly green");
	hints.get("frog").add("Is THE CUTEST animal um.. ever.");
	
	hints.get("penguin").add("They 'propose' to eachother by gifting them a rock");
	hints.get("penguin").add("Can't fly, but is a bird");
	hints.get("penguin").add("Inhabit colder areas");
	
	hints.get("skunk").add("Black and white");
	hints.get("skunk").add("Furry");
	hints.get("skunk").add("With _____, they can temporarily blind a human if it's sprayed in the eyes");
	
	hints.get("panda").add("Can be black and white or red and white");
	hints.get("panda").add("Species of bear");
	hints.get("panda").add("BAMBOO.");
	
	hints.get("squid").add("Similar to an octopus");
	hints.get("squid").add("Can be giant or noramal sized");
	hints.get("squid").add("Shoots ink");
	
	//places
	hints.get("france").add("Flag colors: red, white, & blue. NOT AMERICA!!");
	hints.get("france").add("Its capital is Paris");
	hints.get("france").add("CrOsSaNt ;)");
	
	hints.get("athens").add("City in Greece");
	hints.get("athens").add("Olive tree??");
	hints.get("athens").add("Athena!!!");
	
	hints.get("rome").add("Home to the Colosseum!");
	hints.get("rome").add("Home to the Pantheon!");
	hints.get("rome").add("Capital of Italy.");
	
	hints.get("louisiana").add("Its capital is Baton Rouge.");
	hints.get("louisiana").add("Its state flower is the magnolia?");
	hints.get("louisiana").add("Its state animal is the Louisiana black bear!!");
	
	hints.get("guatemala").add("It is a country in central America!");
	hints.get("guatemala").add("Its state animal is the quetzal.");
	hints.get("guatemala").add("Its capital is Guatemala City");
	
	//Basic Middle School Terminology
	hints.get("yeet").add("To agressively throw, verb");
	hints.get("yeet").add("The past tense of this word is 'yote'.");
	hints.get("yeet").add("This word is primarily used by the males of the student body.");
	
	hints.get("oop").add("Primarily used by VSCO girls");
	hints.get("oop").add("Not 'sksksk' but '______'.");
	hints.get("oop").add("'And I ___'.");
	
	hints.get("sksksk").add("Not 'And I oop' but '______', interjection.");
	hints.get("sksksk").add("Primarily used by VSCO girls");
	hints.get("sksksk").add("Starts with an 's'...?");
	
	hints.get("ily").add("Common abreviated phrase");
	hints.get("ily").add("A way of expressing one's love for another");
	hints.get("ily").add("Three words that are abbreviated into a three letter acronym.");
	
	hints.get("tea").add("The general gossip, noun");
	hints.get("tea").add("Mostly used by girls");
	hints.get("tea").add("Spill the '___'");
	
//	for(int p = 0; p < plaWrds.length; p++) {
//		ArrayList<String> x = new ArrayList <String>();
//		hints.put(plaWrds[p], x);
//	}
//	for(int b = 0; b < basWrds.length; b++) {
//		ArrayList<String> y = new ArrayList<String>();
//		hints.put(basWrds[b], y);
//	}
	
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
	this.frame.getContentPane().remove(this);
	this.removeAll();
}
void addJComponent (JComponent jc, int x, int y, int wX, int wY) {
	GridBagConstraints c = new GridBagConstraints();
	c.gridx = x;
	c.gridy = y;
	c.weightx = wX;
	c.weighty = wY;
	
	this.add(jc, c);
	
}
}
