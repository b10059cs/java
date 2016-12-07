package chegg;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SeaPortProgram extends JFrame {
	//JTextField jtf;

	public World world;
	private static final String TITLE = "Sea Port Program";
	public static final String OPEN_FILE = "Open File";
	public static final String SEARCH = "Search";
	// typeComboBox = new JComboBox <String> ();
	// typeComboBox.addItem("Index");
	// typeComboBox.addItem("Type");
	// typeComboBox.addItem("Name");

	//variables used by the GUI interface
	//JFileChooser

	JButton openFileButton = null;
	JButton searchButton = null;

	//JComboBox
	JComboBox<String> typeComboBox = null;

	//JTextField
	JTextField jTF = null;

	//JTextArea
	JTextArea outPutArea = null;
	JScrollPane scrollPane = null;

	//JPanel 
	JPanel buttonsPanel = null;

	public SeaPortProgram(){
		world = new World("Earth", 0, 0) ;
		//make a frame
		super.setTitle(SeaPortProgram.TITLE);
		super.setLayout(new BorderLayout());
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//make the widget
		buttonsPanel = getButtonspanel();
		outPutArea = getOutPutArea();
		scrollPane = getScrollPane(outPutArea);

		//add the widget  to the frame 
		super.add(buttonsPanel, BorderLayout.PAGE_START);
		super.add(scrollPane);
		super.pack();

		//display the frame
		super.setVisible(true);
		super.validate();
		super.setLocationRelativeTo(null);

		//TextField
		jTF = new JTextField(10);

		//ComboBox
		typeComboBox = new JComboBox <String>();
		typeComboBox.addItem("Index");
		typeComboBox.addItem("Type");
		typeComboBox.addItem("Name");

	}    


	public JTextArea getOutPutArea() {
		if(outPutArea == null){
			outPutArea = new JTextArea("Select \" Open File\" to load the file");
			outPutArea.setEditable(false);

		}
		return outPutArea;
	}


	private JScrollPane getScrollPane( JTextArea outPutArea2) {
		if(scrollPane == null){
			scrollPane = new JScrollPane(outPutArea2);
			scrollPane.setPreferredSize(new Dimension(500, 300));
		}
		return scrollPane;
	}


	private JPanel getButtonspanel() {
		if(buttonsPanel == null){
			buttonsPanel = new JPanel();
			buttonsPanel.setLayout(new BorderLayout());

			openFileButton = getOpenFileButton();
			searchButton = getSearchButton();

			buttonsPanel.add(openFileButton, BorderLayout.WEST);
			buttonsPanel.add(searchButton, BorderLayout.EAST);
			//buttonsPanel.add(typeComboBox, BorderLayout.CENTER);
			//buttonsPanel.add(jTF, BorderLayout.CENTER);
		}
		return buttonsPanel;
	}


	private JButton getSearchButton() {
		if(searchButton == null){
			searchButton = new JButton(SeaPortProgram.SEARCH);
			searchButton.addActionListener(new SeaPortListener(this));
			searchButton.setActionCommand(SeaPortProgram.SEARCH);
		}

		return searchButton;
	}


	private JButton getOpenFileButton() {
		if(openFileButton  == null){
			openFileButton = new JButton(SeaPortProgram.OPEN_FILE);
			openFileButton.addActionListener(new SeaPortListener(this) );
			openFileButton.setActionCommand(SeaPortProgram.OPEN_FILE);
		}
		return openFileButton;
	}




	public static void main (String[] args){
		JFrame.setDefaultLookAndFeelDecorated(true);
		SeaPortProgram gui = new SeaPortProgram();
	}
}