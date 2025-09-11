package main;
import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("chess");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		//Add GamePanel to the window
		GamePanel gp = new GamePanel();
		window.add(gp);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		//once the window is created we call this method
		gp.launchGame();
	}

}
