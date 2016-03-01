package stickpire;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Frame extends JFrame {

	// Stickmans
	private ImageIcon stickman = new ImageIcon("sticks/stickman.gif");
	private ImageIcon stickmanangrif = new ImageIcon("sticks/stickmanangrif.gif");
	private ImageIcon stickmandeath = new ImageIcon("sticks/stickmandeath.gif");

	// Pannels
	private JPanel contentPane;

	// Gr��e
	private int xAchse = Toolkit.getDefaultToolkit().getScreenSize().width;
	private int yAchse = Toolkit.getDefaultToolkit().getScreenSize().height;
	private int breite = Toolkit.getDefaultToolkit().getScreenSize().width / 100;
	private int h�he = Toolkit.getDefaultToolkit().getScreenSize().height / 100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setBounds(0, 0, this.xAchse, this.yAchse);
		JLabel lblNewLabel = new JLabel(this.stickman);
		lblNewLabel.setBounds(0, 0, 250, 200);
		contentPane.add(lblNewLabel);
		
		
		//Kleines Beispiel f�r Sp�ter, wenn wir die Icons tauschen
		sleep(3000, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setIcon(stickmanangrif);
				repaint();
				
				sleep(3000, new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						lblNewLabel.setIcon(stickmandeath);
				repaint();
					}});
				
			}
		});
		
		
		
		
		
	}

	/**
	 * wartet ms Millisekunden ab, bevor es (mit dem, was im Listener steht)
	 * weiter macht. L�uft Parallel!
	 * 
	 * @Aufruf: sleep(ms, new ActionListener(){alles Folgende});
	 * @param ms
	 *            Pause in Millisekunden
	 * @param listener
	 *            Alles Folgende nach der Pause
	 * @author Jonathan Horn
	 */
	public void sleep(final int ms, final ActionListener listener) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Timer timer = new Timer(ms, listener);
				timer.setRepeats(false);
				timer.setCoalesce(false);
				timer.start();
			}
		});
	}
}
