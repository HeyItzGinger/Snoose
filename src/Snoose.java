import javax.swing.JFrame;

public class Snoose {
static JFrame frame;
static int width = 1000;
static int height = 800;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Snoose().setup();
	}
	public Snoose() {
		frame = new JFrame();
		GamePanel gp = new GamePanel();
	}
	public void setup() {
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
