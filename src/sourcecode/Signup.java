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
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Signup {

	private JFrame frame;
	
//	 private ImageIcon backgroundImage = new ImageIcon(
//	             new ImageIcon(Signup.class.getResource("/img/Login Background.gif"))
//	                .getImage().getScaledInstance(1680, 906, Image.SCALE_DEFAULT));
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
					Signup window = new Signup();
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
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		loginPanel.setBounds(215, 97, 1250, 750);
		loginPanel.setBackground(new Color(255,255,255,120));
		background_panel.add(loginPanel);
		loginPanel.setLayout(null);
		
		JPanel loginsPanel = new JPanel();
		loginsPanel.setBounds(496, 596, 280, 50);
		loginsPanel.setBackground(new Color(74, 144, 226));
		loginPanel.add(loginsPanel);
		loginsPanel.setLayout(null);
		
		JLabel createAccount = new JLabel("Create An Account");
		createAccount.setHorizontalAlignment(SwingConstants.CENTER);
		createAccount.setForeground(new Color(255, 255, 255));
		createAccount.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		createAccount.setBounds(0, 11, 280, 28);
		loginsPanel.add(createAccount);
		
		JPanel personalInfo = new JPanel();
		personalInfo.setBounds(107, 164, 495, 389);
		loginPanel.add(personalInfo);
		personalInfo.setLayout(null);
		personalInfo.setOpaque(false);
		
		JPanel PhonePanel = new JPanel();
		PhonePanel.setLayout(null);
		PhonePanel.setOpaque(false);
		PhonePanel.setBounds(10, 272, 473, 87);
		personalInfo.add(PhonePanel);
		
		RoundedJPasswordField passwordField_1 = new RoundedJPasswordField(10);
		passwordField_1.setBounds(0, 31, 473, 56);
		PhonePanel.add(passwordField_1);
		
		JLabel phonenumber = new JLabel("Phone Number *");
		phonenumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		phonenumber.setBounds(0, 0, 330, 32);
		PhonePanel.add(phonenumber);
		
		JPanel FirstNamePanel = new JPanel();
		FirstNamePanel.setBounds(10, 31, 473, 87);
		personalInfo.add(FirstNamePanel);
		FirstNamePanel.setOpaque(false);
		FirstNamePanel.setLayout(null);
		
		JLabel firstname = new JLabel("First Name *");
		firstname.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		firstname.setBounds(0, 0, 330, 32);
		FirstNamePanel.add(firstname);
		
		RoundedJTextField emailfield_1 = new RoundedJTextField(10);
		emailfield_1.setBounds(0, 31, 473, 56);
		FirstNamePanel.add(emailfield_1);
		
		JPanel LastNamePanel = new JPanel();
		LastNamePanel.setBounds(10, 151, 473, 87);
		personalInfo.add(LastNamePanel);
		LastNamePanel.setOpaque(false);
		LastNamePanel.setLayout(null);
		
		RoundedJPasswordField passwordField_2 = new RoundedJPasswordField(10);
		passwordField_2.setBounds(0, 31, 473, 56);
		LastNamePanel.add(passwordField_2);
		
				
				JLabel lastname = new JLabel("Last Name *");
				lastname.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				lastname.setBounds(0, 0, 330, 32);
				LastNamePanel.add(lastname);
				
				JPanel personalInfo_1 = new JPanel();
				personalInfo_1.setBounds(678, 164, 490, 389);
				personalInfo_1.setLayout(null);
				loginPanel.add(personalInfo_1);
				personalInfo_1.setOpaque(false);
				
				JPanel passwordPanel_1_1 = new JPanel();
				passwordPanel_1_1.setLayout(null);
				passwordPanel_1_1.setOpaque(false);
				passwordPanel_1_1.setBounds(10, 272, 473, 87);
				personalInfo_1.add(passwordPanel_1_1);
				
				RoundedJPasswordField passwordField_1_1 = new RoundedJPasswordField(10);
				passwordField_1_1.setBounds(0, 31, 473, 56);
				passwordPanel_1_1.add(passwordField_1_1);
				
				JLabel confirmpassword = new JLabel("Confirm Password *");
				confirmpassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				confirmpassword.setBounds(0, 0, 330, 32);
				passwordPanel_1_1.add(confirmpassword);
				
				JPanel emailPanel_1 = new JPanel();
				emailPanel_1.setLayout(null);
				emailPanel_1.setOpaque(false);
				emailPanel_1.setBounds(10, 31, 473, 87);
				personalInfo_1.add(emailPanel_1);
				
				JLabel email = new JLabel("Email *");
				email.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				email.setBounds(0, 0, 330, 32);
				emailPanel_1.add(email);
				
				RoundedJTextField emailfield_1_1 = new RoundedJTextField(10);
				emailfield_1_1.setBounds(0, 31, 473, 56);
				emailPanel_1.add(emailfield_1_1);
				
				JPanel passwordPanel_2 = new JPanel();
				passwordPanel_2.setLayout(null);
				passwordPanel_2.setOpaque(false);
				passwordPanel_2.setBounds(10, 150, 473, 87);
				personalInfo_1.add(passwordPanel_2);
				
				RoundedJPasswordField passwordField_2_1 = new RoundedJPasswordField(10);
				passwordField_2_1.setBounds(0, 31, 473, 56);
				passwordPanel_2.add(passwordField_2_1);
				
				JLabel password = new JLabel("Password  *");
				password.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
				password.setBounds(0, 0, 330, 32);
				passwordPanel_2.add(password);
				
				JPanel signinpanel = new JPanel();
				signinpanel.setBounds(107, 11, 1061, 155);
				loginPanel.add(signinpanel);
				signinpanel.setLayout(null);
				signinpanel.setOpaque(false);
				
				JLabel signin = new JLabel("Sign In");
				signin.setBounds(482, 53, 101, 43);
				signinpanel.add(signin);
				signin.setHorizontalAlignment(SwingConstants.CENTER);
				signin.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
				
				JLabel personalinfo = new JLabel("Personal Information");
				personalinfo.setHorizontalAlignment(SwingConstants.CENTER);
				personalinfo.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
				personalinfo.setBounds(0, 112, 494, 43);
				signinpanel.add(personalinfo);
				
				JLabel lblSignIn = new JLabel("Sign - In Information");
				lblSignIn.setHorizontalAlignment(SwingConstants.CENTER);
				lblSignIn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
				lblSignIn.setBounds(569, 112, 482, 43);
				signinpanel.add(lblSignIn);
				
				JLabel login = new JLabel("Login");
				login.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					}
				});
				login.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
				login.setHorizontalAlignment(SwingConstants.CENTER);
				login.setBounds(562, 666, 152, 26);
				loginPanel.add(login);
		
		JLabel backgroundlabel = new JLabel("");
		backgroundlabel.setIcon(new ImageIcon(Signup.class.getResource("/img/Background.png")));
		backgroundlabel.setBounds(0, 0, 46, 14);
		backgroundlabel.setBounds(0, 0, 1664, 906);
		background_panel.add(backgroundlabel);
		
		
		
	}
}
