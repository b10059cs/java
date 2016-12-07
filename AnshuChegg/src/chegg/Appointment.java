package chegg;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Appointment extends JFrame {
	// variable declaration
	private static final int WIDTH = 250;
	private static final int HEIGHT = 300;

	private JComboBox<String> weekDays;
	private JComboBox<String> scheduleTime;
	private JTextField textField;

	private JButton schedule; // Schedule the application

	private String[] dayOptions =

			{ "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday" };
	private String[] timeOptions =

			{ "9:00", "10:00", "11:00", "1:00", "2:00", "3:00" };

	public Appointment() {

		setTitle("Appointment Scheduling ");

		setSize(WIDTH, HEIGHT);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		createContents();

		setVisible(true);

	}

	private void createContents()

	{
		JPanel windowPanel = new JPanel(new BorderLayout(0, 10));

		windowPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

		// centerPanel holds all components
		GridLayout layout = new GridLayout(11, 1);
		layout.setVgap(10);
		layout.setHgap(20);
		JPanel centerPanel = new JPanel(layout);

		weekDays = new JComboBox<>(dayOptions);
		scheduleTime = new JComboBox<>(timeOptions);
		textField = new JTextField();

		schedule = new JButton("Schedule");
		// adding component into panel
		centerPanel.add(new JLabel("Select day and time for you appointment"));
		centerPanel.add(weekDays);
		centerPanel.add(scheduleTime);
		centerPanel.add(schedule);
		centerPanel.add(new JLabel("Your appointment is scheduled for:"));
		centerPanel.add(textField);

		windowPanel.add(centerPanel, BorderLayout.CENTER);
		add(windowPanel);
		schedule.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (weekDays.getSelectedItem() != null && scheduleTime.getSelectedItem() != null) {
					// setting value in textField
					textField.setText(weekDays.getSelectedItem() + " at " + scheduleTime.getSelectedItem());
				}

			}
		});

	}

}
