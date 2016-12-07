package chegg;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class JOptionPaneYesNoDemo extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		

		int answer=JOptionPane.showConfirmDialog(null,"End Program?","Click Yes or No:",JOptionPane.YES_NO_OPTION);
		if(answer==JOptionPane.YES_OPTION)
			System.out.println("Quit");
		else if(answer==JOptionPane.NO_OPTION)
			System.out.println("One more time");
		else
			System.out.println("This is impossible");

	}

}
