package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {
	public boolean loginStatus = false;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 12));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(100, 100, 895, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLetsTalk = new JLabel("Let Us Talk");
		lblLetsTalk.setForeground(Color.GRAY);
		lblLetsTalk.setFont(new Font("FreeSerif", Font.BOLD | Font.ITALIC, 30));
		lblLetsTalk.setBackground(Color.GRAY);
		lblLetsTalk.setBounds(312, 33, 238, 42);
		frame.getContentPane().add(lblLetsTalk);
		
		
		JButton loginBtn = new JButton("Login");
		System.out.println("Login status" + loginStatus);
		loginBtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("An attempt to sign in has been made");
			
			loginPage loginpage = new loginPage();
			System.out.println(loginpage);
					loginpage.main(null);
					frame.dispose();
				}
			});
		loginBtn.setFont(new Font("DejaVu Serif", Font.PLAIN, 18));
		loginBtn.setBackground(Color.RED);
		loginBtn.setBounds(734, 41, 117, 30);
		frame.getContentPane().add(loginBtn);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Chat WIth Family");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 192, 203));
		lblNewLabel.setBounds(68, 156, 179, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblConnectWithFriends = new JLabel("Connect with friends");
		lblConnectWithFriends.setForeground(Color.BLACK);
		lblConnectWithFriends.setFont(new Font("Dialog", Font.BOLD, 14));
		lblConnectWithFriends.setBackground(new Color(255, 192, 203));
		lblConnectWithFriends.setBounds(68, 247, 179, 52);
		frame.getContentPane().add(lblConnectWithFriends);
		
		JLabel lblJoinWorkgroups = new JLabel("Join Workgroups");
		lblJoinWorkgroups.setForeground(Color.BLACK);
		lblJoinWorkgroups.setFont(new Font("Dialog", Font.BOLD, 14));
		lblJoinWorkgroups.setBackground(new Color(255, 192, 203));
		lblJoinWorkgroups.setBounds(68, 339, 179, 52);
		frame.getContentPane().add(lblJoinWorkgroups);
		
		JLabel lblManageFiles = new JLabel("Upload & Manage Files");
		lblManageFiles.setForeground(Color.BLACK);
		lblManageFiles.setFont(new Font("Dialog", Font.BOLD, 14));
		lblManageFiles.setBackground(new Color(255, 192, 203));
		lblManageFiles.setBounds(68, 433, 179, 52);
		frame.getContentPane().add(lblManageFiles);
		
		JLabel lblPlayYourFavourite = new JLabel("Play your Favourite music");
		lblPlayYourFavourite.setForeground(Color.BLACK);
		lblPlayYourFavourite.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPlayYourFavourite.setBackground(new Color(255, 192, 203));
		lblPlayYourFavourite.setBounds(550, 156, 261, 52);
		frame.getContentPane().add(lblPlayYourFavourite);
		
		JLabel lblWaatchMoviesAnd = new JLabel("Watch Movies and VIdeos");
		lblWaatchMoviesAnd.setForeground(Color.BLACK);
		lblWaatchMoviesAnd.setFont(new Font("Dialog", Font.BOLD, 14));
		lblWaatchMoviesAnd.setBackground(new Color(255, 192, 203));
		lblWaatchMoviesAnd.setBounds(550, 247, 261, 52);
		frame.getContentPane().add(lblWaatchMoviesAnd);
		
		JLabel lblManageYourWorkers = new JLabel("Manage Your Workers");
		lblManageYourWorkers.setForeground(Color.BLACK);
		lblManageYourWorkers.setFont(new Font("Dialog", Font.BOLD, 14));
		lblManageYourWorkers.setBackground(new Color(255, 192, 203));
		lblManageYourWorkers.setBounds(550, 339, 261, 52);
		frame.getContentPane().add(lblManageYourWorkers);
		
		JLabel lblAndManyMore = new JLabel("And many more...");
		lblAndManyMore.setForeground(Color.BLACK);
		lblAndManyMore.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAndManyMore.setBackground(new Color(255, 192, 203));
		lblAndManyMore.setBounds(550, 433, 261, 52);
		frame.getContentPane().add(lblAndManyMore);
	}
}
