package be.josimon.BWJFrame;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Accueil extends JFrame {
	private static final long serialVersionUID = -2974693342035219410L;
	private JPanel contentPane;
	// variable dao

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
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
	public Accueil() {
		// Création de la frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnInscription = new JButton("Inscription");
		btnInscription.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnInscription.setBounds(10, 135, 601, 535);
		contentPane.add(btnInscription);
		JButton btnConnexion = new JButton("Connexion");
		btnConnexion.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnConnexion.setBounds(621, 135, 633, 535);
		contentPane.add(btnConnexion);
		setTitle("Accueil du Bosquet Wallon");
		JFrame instance = this;
		
		// Label titre du haut
				JLabel lblNewLabel = new JLabel("Gestion de salle : Bosquet Wallon");
				lblNewLabel.setBounds(400, 50, 500, 40);
				contentPane.add(lblNewLabel);
				lblNewLabel.setForeground(Color.red);
				lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 32));
		
		
				
				
		// Action
		
		btnInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inscription frame2 = new Inscription();
				instance.dispose();
				frame2.setVisible(true);
			}
		});
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connexion frame2 = new Connexion();
				instance.dispose();
				frame2.setVisible(true);
			}
		});
		
	}
}
