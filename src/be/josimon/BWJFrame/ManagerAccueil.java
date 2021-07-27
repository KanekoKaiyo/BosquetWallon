package be.josimon.BWJFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.josimon.BWPOJO.Manager;

public class ManagerAccueil extends JFrame {
	private static final long serialVersionUID = 4026188630484673662L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ManagerAccueil(Manager man) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
