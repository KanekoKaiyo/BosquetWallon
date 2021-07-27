package be.josimon.BWJFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.josimon.BWPOJO.Spectator;

public class SpectatorAccueil extends JFrame {
	private static final long serialVersionUID = -2896656775662536034L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public SpectatorAccueil(Spectator spec) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
