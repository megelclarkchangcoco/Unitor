package sourcecode;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;

public class Login {

	private JFrame frame;
	
//	 private ImageIcon backgroundImage = new ImageIcon(
//	             new ImageIcon(Login.class.getResource("/img/Login Background.gif"))
//	                .getImage().getScaledInstance(1680, 906, Image.SCALE_DEFAULT));
	  private ImageIcon profileicon = new ImageIcon(
	            new ImageIcon("	 C:\\Users\\megel\\eclipse-workspace\\Unitour\\img\\img\\Background.png")
	                .getImage().getScaledInstance(1680, 906, Image.SCALE_DEFAULT));
	 
	 private JTextField tfEmail;
	 private JTextField tfPassword;
	 private JTextField emailfield;
	 private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		frame = new JFrame();
		frame.setTitle("Learningpy");
		frame.setBounds(100, 100, 1680, 945);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		
		JPanel background_panel = new JPanel();
		background_panel.setBounds(0, 0, 1664, 906);
		frame.getContentPane().add(background_panel);
		background_panel.setLayout(null);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(490, 97, 700, 750);
		loginPanel.setBackground(new Color(255,255,255,120));
		background_panel.add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(Login.class.getResource("/img/profile-circle-logo.png")));
//		logo.setIcon(profileicon);
		logo.setBounds(280, 55, 150, 150);
		loginPanel.add(logo);
		
		JPanel emailPanel = new JPanel();
		emailPanel.setOpaque(false);
		emailPanel.setBounds(108, 266, 473, 87);
		loginPanel.add(emailPanel);
		emailPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email Address");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel.setBounds(0, 0, 330, 32);
		emailPanel.add(lblNewLabel);
		
		RoundedJTextField emailfield_1 = new RoundedJTextField(10);
		emailfield_1.setBounds(0, 31, 473, 56);
		emailPanel.add(emailfield_1);
		
		JPanel passwordPanel = new JPanel();
		passwordPanel.setOpaque(false);
		passwordPanel.setBounds(108, 381, 473, 87);
		loginPanel.add(passwordPanel);
		passwordPanel.setLayout(null);
		
		RoundedJPasswordField passwordField = new RoundedJPasswordField(10);
		passwordField.setBounds(0, 31, 473, 56);
		passwordPanel.add(passwordField);

		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblPassword.setBounds(0, 0, 330, 32);
		passwordPanel.add(lblPassword);
		
		JPanel loginsPanel = new JPanel();
		loginsPanel.setBackground(new Color(74, 144, 226));
		loginsPanel.setBounds(212, 550, 280, 50);
		loginPanel.add(loginsPanel);
		loginsPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(114, 11, 97, 28);
		loginsPanel.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(108, 514, 473, 158);
		loginPanel.add(panel);
		panel.setOpaque(false);
		panel.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(84, 123, 316, 2);
		panel.add(separator_1);
		
		JLabel text1 = new JLabel("Don't have account ?");
		text1.setBounds(103, 138, 160, 14);
		text1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel.add(text1);
		
		JLabel createaccount = new JLabel("Create account");
		createaccount.setBounds(270, 138, 109, 14);
		createaccount.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		panel.add(createaccount);
		
		JLabel backgroundlabel = new JLabel("");
		backgroundlabel.setIcon(new ImageIcon(Login.class.getResource("/img/Background.png")));
		backgroundlabel.setBounds(0, 0, 46, 14);
		backgroundlabel.setBounds(0, 0, 1664, 906);
		background_panel.add(backgroundlabel);

	}
}
