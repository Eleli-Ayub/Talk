package src;
import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createAccount {
	
	
	

	private JFrame frame;
	private static JTextField firstNameInput;
	private static JTextField lastNameInput;
	private static JPasswordField createAccountPassword;
	private static JPasswordField createAccountConfirmPassword;
	private static JTextField userEmailInput;
	
	public void registerUser() {
		String url = "jdbc:mysql://localhost:3306/user1";
		String uName = "root";
		String pass = "";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url,uName,pass);
			String firstName = firstNameInput.getText();
			String lastName = lastNameInput.getText();
			String email = userEmailInput.getText();
			String password = createAccountPassword.getText();
			String confirmPassword = createAccountConfirmPassword.getText();
			
			String registerQuery = "INSERT INTO users (firstName, lastName, email, password) VALUES (?,?,?,?)";
			
			if(firstName.length() != 0) {
				if(lastName.length() != 0) {
					if(email.contains("@.com")) {	
						if(password == confirmPassword) {
							
							PreparedStatement pd = connection.prepareStatement(registerQuery);
							
							pd.setString(1,firstName);
							pd.setString(2,lastName);
							pd.setString(3,email);
							pd.setString(4,password);
							
							pd.executeUpdate();
										
							JOptionPane.showMessageDialog(null, firstName + " user has been created. Proceed to Login. Redirecting to Login Page");
							
							loginPage loginpage = new loginPage();
							loginpage.main(null);
							frame.dispose();
						}else {
							JOptionPane.showMessageDialog(null, "Passwords Don't match");
						}
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Email");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Last Name");
				}				
			}else {
				JOptionPane.showMessageDialog(null, "Invalid First Name");

			}
			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createAccount window = new createAccount();
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
	public createAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 944, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLetsTalk = new JLabel("Let Us Talk");
		lblLetsTalk.setForeground(Color.GRAY);
		lblLetsTalk.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 30));
		lblLetsTalk.setBackground(Color.GRAY);
		lblLetsTalk.setBounds(347, 24, 238, 42);
		frame.getContentPane().add(lblLetsTalk);
		
		JLabel lblCreateAccount = new JLabel("Create Account");
		lblCreateAccount.setFont(new Font("Courier 10 Pitch", Font.BOLD, 25));
		lblCreateAccount.setBounds(321, 62, 286, 42);
		frame.getContentPane().add(lblCreateAccount);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(281, 104, 328, 455);
		frame.getContentPane().add(panel);
		
		JLabel firstNameINput = new JLabel("First Name");
		firstNameINput.setFont(new Font("Dialog", Font.BOLD, 17));
		firstNameINput.setBounds(113, 12, 136, 22);
		panel.add(firstNameINput);
		
		firstNameInput = new JTextField();
		firstNameInput.setColumns(10);
		firstNameInput.setBackground(Color.WHITE);
		firstNameInput.setBounds(32, 46, 284, 29);
		panel.add(firstNameInput);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblPassword.setBounds(113, 238, 136, 22);
		panel.add(lblPassword);
		
		JButton btnCreateAccount = new JButton("Create");
		btnCreateAccount.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				registerUser();
			}
		});
		btnCreateAccount.setToolTipText("Create Account Button");
		btnCreateAccount.setFont(new Font("Dialog", Font.BOLD, 17));
		btnCreateAccount.setBackground(Color.GRAY);
		btnCreateAccount.setBounds(100, 381, 117, 25);
		panel.add(btnCreateAccount);
		
		JButton createAccountLink = new JButton("Already have an account?  Log in...");
		createAccountLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPage loginpage = new loginPage();
				loginpage.main(null);
				frame.dispose();
			}
		});
		createAccountLink.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		createAccountLink.setBackground(Color.WHITE);
		createAccountLink.setBounds(24, 418, 271, 25);
		panel.add(createAccountLink);
		
		JLabel lastNameINput = new JLabel("Last Name");
		lastNameINput.setFont(new Font("Dialog", Font.BOLD, 17));
		lastNameINput.setBounds(113, 87, 136, 22);
		panel.add(lastNameINput);
		
		lastNameInput = new JTextField();
		lastNameInput.setColumns(10);
		lastNameInput.setBackground(Color.WHITE);
		lastNameInput.setBounds(32, 121, 284, 29);
		panel.add(lastNameInput);
		
		createAccountPassword = new JPasswordField();
		createAccountPassword.setBounds(32, 269, 284, 29);
		panel.add(createAccountPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		lblConfirmPassword.setBounds(70, 306, 207, 22);
		panel.add(lblConfirmPassword);
		
		createAccountConfirmPassword = new JPasswordField();
		createAccountConfirmPassword.setBounds(32, 340, 284, 29);
		panel.add(createAccountConfirmPassword);
		
		JLabel lblEmailAdress = new JLabel("Email Adress");
		lblEmailAdress.setFont(new Font("Dialog", Font.BOLD, 17));
		lblEmailAdress.setBounds(113, 162, 136, 22);
		panel.add(lblEmailAdress);
		
		userEmailInput = new JTextField();
		userEmailInput.setColumns(10);
		userEmailInput.setBackground(Color.WHITE);
		userEmailInput.setBounds(32, 196, 284, 29);
		panel.add(userEmailInput);
	}
}
