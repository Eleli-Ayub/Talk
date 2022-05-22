package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginPage {

	private JFrame frame;
	private JTextField usernameINout;
	private JTextField userpasswordInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage window = new loginPage();
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
	public loginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setBounds(100, 100, 932, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLetUsTalk = new JLabel("Let us Talk");
		lblLetUsTalk.setForeground(Color.GRAY);
		lblLetUsTalk.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 30));
		lblLetUsTalk.setBackground(Color.GRAY);
		lblLetUsTalk.setBounds(339, 12, 238, 42);
		frame.getContentPane().add(lblLetUsTalk);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setToolTipText("Login");
		lblNewLabel.setFont(new Font("Courier 10 Pitch", Font.BOLD, 25));
		lblNewLabel.setBounds(372, 81, 188, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(268, 163, 328, 391);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 17));
		lblUsername.setBounds(113, 43, 136, 22);
		panel.add(lblUsername);
		
		usernameINout = new JTextField();
		usernameINout.setBackground(Color.WHITE);
		usernameINout.setBounds(32, 95, 284, 29);
		panel.add(usernameINout);
		usernameINout.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPassword.setBounds(113, 150, 136, 22);
		panel.add(lblPassword);
		
		userpasswordInput = new JTextField();
		userpasswordInput.setColumns(10);
		userpasswordInput.setBackground(Color.WHITE);
		userpasswordInput.setBounds(32, 184, 284, 29);
		panel.add(userpasswordInput);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 17));
		btnLogin.setToolTipText("Login Button");
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.setBounds(111, 239, 117, 25);
		panel.add(btnLogin);
		
		JButton createAccountLink = new JButton("Don't have an account? Create one");
		createAccountLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createAccount createaccount = new createAccount();
				createaccount.main(null);
				frame.dispose();
			}
		});
		createAccountLink.setBackground(SystemColor.text);
		createAccountLink.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		createAccountLink.setBounds(32, 320, 271, 25);
		panel.add(createAccountLink);
	}
}
