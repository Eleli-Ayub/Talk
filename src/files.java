package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class files {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					files window = new files();
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
	public files() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 884, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.window);
		panel.setBounds(12, 24, 177, 521);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(223, 68, 615, 477);
		frame.getContentPane().add(panel_2);
		
		JLabel lblFileManagement = new JLabel("File Management");
		lblFileManagement.setFont(new Font("Dialog", Font.BOLD, 30));
		lblFileManagement.setBounds(106, 94, 307, 36);
		panel_2.add(lblFileManagement);
		
		JLabel lblNewLabel_1 = new JLabel("Upload, edit, delete and manage your files and documents here");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 214, 591, 80);
		panel_2.add(lblNewLabel_1);
		
		JButton btnUpload = new JButton("Upload Files");
		btnUpload.setBounds(53, 292, 151, 52);
		panel_2.add(btnUpload);
		
		JButton btnView = new JButton("VIew Files");
		btnView.setBounds(296, 292, 141, 52);
		panel_2.add(btnView);
		
		JLabel lblLetsTalk = new JLabel("Let Us Talk");
		lblLetsTalk.setForeground(Color.GRAY);
		lblLetsTalk.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 30));
		lblLetsTalk.setBackground(Color.GRAY);
		lblLetsTalk.setBounds(326, 12, 238, 42);
		frame.getContentPane().add(lblLetsTalk);
	}
}
