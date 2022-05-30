package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class workspace {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					workspace window = new workspace();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public workspace() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 865, 618);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.window);
		panel.setBounds(12, 12, 177, 521);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Work Space");
		btnNewButton.setBackground(SystemColor.windowBorder);
		btnNewButton.setBounds(24, 12, 129, 78);
		panel.add(btnNewButton);
		
		JButton btnMyFiles = new JButton("My FIles");
		btnMyFiles.setBackground(SystemColor.windowBorder);
		btnMyFiles.setBounds(24, 97, 129, 78);
		panel.add(btnMyFiles);
		
		JButton btnEntertainment = new JButton("Entertainment");
		btnEntertainment.setBackground(SystemColor.windowBorder);
		btnEntertainment.setBounds(24, 187, 129, 78);
		panel.add(btnEntertainment);
		
		JButton btnSocialSpace = new JButton("Social Space");
		btnSocialSpace.setBackground(SystemColor.windowBorder);
		btnSocialSpace.setBounds(24, 280, 129, 78);
		panel.add(btnSocialSpace);
		
		JButton btnMySchedule = new JButton("My Schedule");
		btnMySchedule.setBackground(SystemColor.windowBorder);
		btnMySchedule.setBounds(24, 369, 129, 78);
		panel.add(btnMySchedule);
		
		JLabel lblLetsTalk = new JLabel("Let Us Talk");
		lblLetsTalk.setForeground(Color.GRAY);
		lblLetsTalk.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 30));
		lblLetsTalk.setBackground(Color.GRAY);
		lblLetsTalk.setBounds(332, 12, 238, 42);
		frame.getContentPane().add(lblLetsTalk);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(223, 56, 615, 477);
		frame.getContentPane().add(panel_2);
		
		JLabel lblMyWorkspace = new JLabel("My WorkSpace");
		lblMyWorkspace.setFont(new Font("Dialog", Font.BOLD, 30));
		lblMyWorkspace.setBounds(106, 94, 272, 36);
		panel_2.add(lblMyWorkspace);
		
		JLabel lblNewLabel_1 = new JLabel("Manage your work and professional issues here");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBounds(64, 207, 494, 68);
		panel_2.add(lblNewLabel_1);
		
		JButton btnUpcomingMeetings = new JButton("Upcoming Meetings");
		btnUpcomingMeetings.setBounds(64, 303, 173, 52);
		panel_2.add(btnUpcomingMeetings);
		
		JButton btnFilesAndDocs = new JButton("Files and Docs");
		btnFilesAndDocs.setBounds(324, 303, 150, 52);
		panel_2.add(btnFilesAndDocs);
	}
}
