package be.josimon.BWJFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import be.josimon.BWConnect.DBConnect;
import be.josimon.BWPOJO.Manager;
import be.josimon.BWPOJO.Organizer;
import be.josimon.BWPOJO.Person;
import be.josimon.BWPOJO.Spectator;
import be.josimon.util.Regex;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class Connexion extends JFrame {
	
	Connection conn = DBConnect.getInstance();
	
	private static final long serialVersionUID = -3252144719081695662L;
	private JPanel contentPane;
	private JTextField TFcomail;
	private JPasswordField PFco;

	/**
	 * Create the frame.
	 */
	public Connexion() {
		// Création de la frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Connexion au Bosquet Wallon");
		JFrame instance = this;
		
		// Panel de gauche
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 140, 1244, 530);
		contentPane.add(panel);
		panel.setLayout(null);
		// Label connexion
		JLabel lblNewLabel_1 = new JLabel("Connexion");
		lblNewLabel_1.setBounds(200, 20, 200, 20);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 24));
		// TextField email connexion
		TFcomail = new JTextField();
		TFcomail.setBounds(200, 100, 200, 30);
		panel.add(TFcomail);
		TFcomail.setColumns(10);
		// PasswordField connexion
		PFco = new JPasswordField();
		PFco.setBounds(200, 160, 200, 30);
		panel.add(PFco);
		// lb email
		JLabel lblNewLabel_3 = new JLabel("Email :");
		lblNewLabel_3.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(130, 100, 60, 30);
		panel.add(lblNewLabel_3);
		// lb mdp
		JLabel lblNewLabel_4 = new JLabel("Mot de passe :");
		lblNewLabel_4.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(81, 160, 109, 30);
		panel.add(lblNewLabel_4);
		// Bouton Connexion
		JButton btnco = new JButton("Connexion");

		btnco.setBounds(300, 201, 100, 30);
		panel.add(btnco);
		
		JLabel lblsys = new JLabel("");
		lblsys.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblsys.setBounds(81, 260, 1153, 123);
		panel.add(lblsys);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(1145, 496, 89, 23);
		panel.add(btnRetour);
		
		// Action
		
		// bouton retour
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil frame2 = new Accueil();
				instance.dispose();
				frame2.setVisible(true);
			}
		});
		
		// bouton connexion
		btnco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblsys.setText("");
				// Action lors de la l'enclenchement du bouton Connexion :
				if(!TFcomail.getText().isEmpty() && !String.valueOf(PFco.getPassword()).isEmpty()) {
					// si les champs sont remplie on continue
					if(Regex.verifMail(TFcomail.getText()) == true) {
						if(Regex.verifPass(String.valueOf(PFco.getPassword())) == true) {
							// Si les formats email et mot de passe sont correcte on va pouvoir tester dans la DB si ils existent
							Person pr = new Person();
							pr.setEmail(TFcomail.getText());
							pr.setPassword(String.valueOf(PFco.getPassword()));
							Person prauth = pr.find(conn);
							if(prauth != null) {
								// la combinaison est bonne alors on peu continuer, il faut connaitre le role de l'utilisateur pour savoir ou le rediriger
								if(prauth.getRole().equals("Spectator")) {
									// log client
									Spectator spectator = (Spectator) prauth;
									try {
										SpectatorAccueil frame2 = new SpectatorAccueil(spectator);
										instance.dispose();
										frame2.setVisible(true);
									} catch(Exception ex) {
										ex.printStackTrace();
									}
								} else if(prauth.getRole().equals("Organizer")) {
									// log organisateur
									Organizer orga = (Organizer) prauth;
									try {
										OrgaAccueil frame2 = new OrgaAccueil(orga);
										instance.dispose();
										frame2.setVisible(true);
									} catch(Exception ex) {
										ex.printStackTrace();
									}
								} else if(prauth.getRole().equals("Manager")) {
									// log gestionnaire
									Manager man = (Manager) prauth;
									try {
										ManagerAccueil frame2 = new ManagerAccueil(man);
										instance.dispose();
										frame2.setVisible(true);
									} catch(Exception ex) {
										ex.printStackTrace();
									}
								} else {
									lblsys.setText("Un problèmes est survenue avec votre compte, contactez un administrateur.");
								}
							} else {
								lblsys.setText("L'email ou le mot de passe est incorrecte");
							}
						} else {
							lblsys.setText("Le format de mot de passe n'est pas bon, il faut entre 8 et 20 caractères, une majuscule, une minuscule, un chiffre et un caractére spécial ( sauf - et _ ) pour continuer");
						}
					} else {
						lblsys.setText("Le format de l'email n'est pas bon.");
					}
				} else {
					lblsys.setText("Remplissez les gens pour vous connecter.");
				}
			}
		});
		
		
	}
}
