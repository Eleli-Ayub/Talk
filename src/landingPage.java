package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class landingPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					landingPage window = new landingPage();
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
	public landingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 915, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Navigations", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_1.setBounds(2, 50, 187, 543);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 22, 177, 521);
		panel_1.add(panel);
		panel.setBackground(SystemColor.control);
		panel.setLayout(null);
		
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
		lblLetsTalk.setBounds(269, 12, 238, 42);
		frame.getContentPane().add(lblLetsTalk);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(236, 66, 615, 477);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setBounds(106, 94, 169, 36);
		panel_2.add(lblNewLabel);
		
		JLabel nameLabel = new JLabel("Ayub");
		nameLabel.setFont(new Font("FreeMono", Font.ITALIC, 26));
		nameLabel.setBounds(289, 95, 169, 36);
		panel_2.add(nameLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create your own universe and explore with it the multiverse");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_1.setBounds(66, 228, 494, 68);
		panel_2.add(lblNewLabel_1);
	}

}
