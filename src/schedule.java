package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class schedule {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					schedule window = new schedule();
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
	public schedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 883, 658);
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
		
		JLabel lblLetsTalk = new JLabel("Let Us Talk");
		lblLetsTalk.setForeground(Color.GRAY);
		lblLetsTalk.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 30));
		lblLetsTalk.setBackground(Color.GRAY);
		lblLetsTalk.setBounds(326, 12, 238, 42);
		frame.getContentPane().add(lblLetsTalk);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(223, 68, 615, 477);
		frame.getContentPane().add(panel_2);
		
		JLabel lblMySchedule = new JLabel("My Schedule");
		lblMySchedule.setFont(new Font("Dialog", Font.BOLD, 30));
		lblMySchedule.setBounds(106, 94, 307, 36);
		panel_2.add(lblMySchedule);
		
		JLabel lblNewLabel_1 = new JLabel("Write down your plan to avoid missing important meetings and events");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 188, 591, 63);
		panel_2.add(lblNewLabel_1);
		
		JButton btnView = new JButton("VIiew My Schedule");
		btnView.setBounds(241, 274, 202, 52);
		panel_2.add(btnView);
	}

}
