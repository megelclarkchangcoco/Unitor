package sourcecode;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Kinder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kinder frame = new Kinder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kinder() {
		setTitle("Learningpy");
		setBounds(100, 100, 1680, 945);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JPanel background_panel = new JPanel();
		background_panel.setBounds(0, 0, 1664, 906);
		getContentPane().add(background_panel);
		background_panel.setLayout(null);
		
		JPanel panelGrade = new JPanel();
		panelGrade.setBounds(554, 172, 572, 602);
		background_panel.add(panelGrade);
		panelGrade.setLayout(null);
		panelGrade.setOpaque(false);
		
		//kinder panel
		JPanel panelKinder = new JPanel();
		panelKinder.setBounds(0, 0, 572, 188);
		panelGrade.add(panelKinder);
        panelKinder.setLayout(null);
        panelKinder.setOpaque(false);
        
        JLabel labelkinder = new JLabel("");
        labelkinder.setIcon(new ImageIcon(Portal.class.getResource("/img/portalKinder.png")));
        labelkinder.setBounds(0, 0, 572, 188);
        panelKinder.add(labelkinder);
	}

}
