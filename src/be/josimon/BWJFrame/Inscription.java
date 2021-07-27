package be.josimon.BWJFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.ibm.icu.util.Calendar;
import com.toedter.calendar.JCalendar;

import be.josimon.BWConnect.DBConnect;
import be.josimon.BWPOJO.Manager;
import be.josimon.BWPOJO.Organizer;
import be.josimon.BWPOJO.Spectator;
import be.josimon.util.Regex;

import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Inscription extends JFrame {
	
	Connection conn = DBConnect.getInstance();
	
	private static final long serialVersionUID = 158177734488049655L;
	private JPanel contentPane;
	private JPasswordField PFins;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TFnom;
	private JTextField TFprenom;
	private JTextField TFrue;
	private JTextField TFnum;
	private JTextField TFcp;
	private JTextField TFville;
	private JTextField TFinsmail;
	private JTextField TFtelephone;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();
	private Date birthDate;

	/**
	 * Create the frame.
	 */
	public Inscription() {
		// Création de la frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		buttonGroup.clearSelection();
		setTitle("Inscription au Bosquet Wallon");
		JFrame instance = this;
		
		// Panel de droite
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 140, 1180, 530);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		// Label Inscription
		JLabel lblNewLabel_2 = new JLabel("Inscription");
		lblNewLabel_2.setBounds(200, 20, 200, 20);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Serif", Font.PLAIN, 24));
		// TextField Email Inscription
		TFinsmail = new JTextField();
		TFinsmail.setColumns(10);
		TFinsmail.setBounds(275, 100, 200, 30);
		panel_1.add(TFinsmail);
		// PasswordField Inscription
		PFins = new JPasswordField();
		PFins.setBounds(275, 160, 200, 30);
		panel_1.add(PFins);
		// radiobouton client
		JRadioButton rdclient = new JRadioButton("Client");
		rdclient.setBounds(275, 200, 100, 25);
		panel_1.add(rdclient);
		buttonGroup.add(rdclient);
		// radiobouton organisateur
		JRadioButton rdorga = new JRadioButton("Organisateur");
		rdorga.setBounds(275, 230, 100, 25);
		panel_1.add(rdorga);
		buttonGroup.add(rdorga);
		// radiobouton gestionnaire
		JRadioButton rdgest = new JRadioButton("Gestionnaire");
		rdgest.setBounds(275, 258, 100, 25);
		panel_1.add(rdgest);
		buttonGroup.add(rdgest);
		// tf nom
		TFnom = new JTextField();
		TFnom.setBounds(100, 200, 130, 20);
		panel_1.add(TFnom);
		TFnom.setColumns(10);
		// tf prenom
		TFprenom = new JTextField();
		TFprenom.setBounds(100, 225, 130, 20);
		panel_1.add(TFprenom);
		TFprenom.setColumns(10);
		// tf rue
		TFrue = new JTextField();
		TFrue.setBounds(100, 250, 130, 20);
		panel_1.add(TFrue);
		TFrue.setColumns(10);
		// tf num rue
		TFnum = new JTextField();
		TFnum.setBounds(100, 275, 130, 20);
		panel_1.add(TFnum);
		TFnum.setColumns(10);
		// tf cp
		TFcp = new JTextField();
		TFcp.setBounds(100, 300, 130, 20);
		panel_1.add(TFcp);
		TFcp.setColumns(10);
		// tf ville
		TFville = new JTextField();
		TFville.setBounds(100, 325, 130, 20);
		panel_1.add(TFville);
		TFville.setColumns(10);
		// lb email
		JLabel lblNewLabel_3_1 = new JLabel("Email :");
		lblNewLabel_3_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(205, 100, 60, 30);
		panel_1.add(lblNewLabel_3_1);
		// lb mdp
		JLabel lblNewLabel_4_1 = new JLabel("Mot de passe :");
		lblNewLabel_4_1.setFont(new Font("Serif", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(156, 160, 109, 30);
		panel_1.add(lblNewLabel_4_1);
		// lb nom
		JLabel lblNewLabel_5 = new JLabel("Nom :");
		lblNewLabel_5.setBounds(44, 205, 46, 14);
		panel_1.add(lblNewLabel_5);
		// lb prenom
		JLabel lblNewLabel_6 = new JLabel("Prenom :");
		lblNewLabel_6.setBounds(44, 230, 46, 14);
		panel_1.add(lblNewLabel_6);
		// lb rue
		JLabel lblNewLabel_7 = new JLabel("Rue :");
		lblNewLabel_7.setBounds(44, 253, 46, 14);
		panel_1.add(lblNewLabel_7);
		// lb numero
		JLabel lblNewLabel_8 = new JLabel("Numero :");
		lblNewLabel_8.setBounds(44, 278, 46, 14);
		panel_1.add(lblNewLabel_8);
		// lb cp
		JLabel lblNewLabel_9 = new JLabel("CP :");
		lblNewLabel_9.setBounds(44, 307, 46, 14);
		panel_1.add(lblNewLabel_9);
		// lb ville
		JLabel lblNewLabel_10 = new JLabel("Ville :");
		lblNewLabel_10.setBounds(44, 328, 46, 14);
		panel_1.add(lblNewLabel_10);
		// lb téléphone
		JLabel lblNewLabel = new JLabel("T\u00E9l\u00E9phone :");
		lblNewLabel.setBounds(30, 354, 60, 14);
		panel_1.add(lblNewLabel);
		// TF telephone
		TFtelephone = new JTextField();
		TFtelephone.setBounds(100, 351, 130, 20);
		panel_1.add(TFtelephone);
		TFtelephone.setColumns(10);
		// lbl genre
		JLabel lblGenre = new JLabel("Genre :");
		lblGenre.setBounds(40, 379, 46, 14);
		panel_1.add(lblGenre);
		// rdbutton genre male
		JRadioButton rdcmale = new JRadioButton("Male");
		rdcmale.setBounds(100, 378, 60, 30);
		panel_1.add(rdcmale);
		buttonGroupGender.add(rdcmale);
		//rd button genre female
		JRadioButton rdcfemale = new JRadioButton("Female");
		rdcfemale.setBounds(160,378,60,30);
		panel_1.add(rdcfemale);
		buttonGroupGender.add(rdcfemale);
		// rd button genre x
		JRadioButton rdcx = new JRadioButton("Autre");
		rdcx.setBounds(220,378,60,30);
		panel_1.add(rdcx);
		buttonGroupGender.add(rdcx);
		// jcalendar date de naissance
		JCalendar calendar = new JCalendar();
		calendar.setBounds(640, 100, 190, 146);
		panel_1.add(calendar);
		// lbl date de naissance
		JLabel lblDateNaissance = new JLabel("Date de naissance :");
		lblDateNaissance.setBounds(507, 100, 123, 14);
		panel_1.add(lblDateNaissance);
		// button inscription
		JButton btnins = new JButton("Inscription");
		btnins.setBounds(44, 489, 100, 30);
		panel_1.add(btnins);
		// message d'information
		JTextPane txtpnLesChampsSuivant = new JTextPane();
		txtpnLesChampsSuivant.setText("Les champs suivant sont obligatoire seulement pour les clients : Telephone, Genre et Date de naissance");
		txtpnLesChampsSuivant.setBounds(220, 477, 314, 42);
		panel_1.add(txtpnLesChampsSuivant);
		
		JLabel lblsys = new JLabel("");
		lblsys.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblsys.setBounds(532, 303, 638, 77);
		panel_1.add(lblsys);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBounds(1081, 493, 89, 23);
		panel_1.add(btnRetour);
			
		// action
		
		// Attribué la date du calendar dans la variable birthdate
		calendar.getDayChooser().addPropertyChangeListener("day",new PropertyChangeListener() {
			@SuppressWarnings("deprecation")
			public void propertyChange(PropertyChangeEvent evt) {
				Calendar cal = Calendar.getInstance();
				Date today = Calendar.getInstance().getTime();
				
				if(cal.getTime().after(today)) {
					// Si la date selectionner est après la date d'aujourd'hui
					lblsys.setText("Vous ne pouvez pas être né dans le futur, le voyage dans le temps n'existe pas.");
				} else {
					if(cal.getTime().getYear() - today.getYear() < 18) {
						if(cal.getTime().getMonth() - today.getMonth() >= 0) {
							if(cal.getTime().getDay() - today.getDay() >= 0) {
								cal.set(calendar.getYearChooser().getYear(), calendar.getMonthChooser().getMonth(), calendar.getDayChooser().getDay());
								birthDate = cal.getTime();
							} else {
								lblsys.setText("Vous devez avoir 18 ans");
							}
						} else {
							lblsys.setText("Vous devez avoir 18 ans");
						}
					} else {
						lblsys.setText("Vous devez avoir 18 ans");
					}
				} 
			}	
		});
		
		// bouton retour
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil frame2 = new Accueil();
				instance.dispose();
				frame2.setVisible(true);
			}
		});
		
		// bouton inscription
		btnins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblsys.setText("");
				// Action lors de la l'enclenchement du bouton inscription :
				if (!TFnom.getText().isEmpty() && !TFprenom.getText().isEmpty() && !TFrue.getText().isEmpty()
						&& !TFnum.getText().isEmpty() && !TFcp.getText().isEmpty() && !TFville.getText().isEmpty()
						&& !TFinsmail.getText().isEmpty() && !String.valueOf(PFins.getPassword()).isEmpty()) {
					// Si tout les champs sont remplie alors on peut continuer, on va tester si
					// l'email est valide
					if (Regex.verifMail(TFinsmail.getText()) == true) {
						// Si l'email est bonne on continue, on va tester le mot de passe
						if (Regex.verifPass(String.valueOf(PFins.getPassword())) == true) {
							// si mot de passe respecte la regle on continue, on va tester les champs lettre
							// only
							if (Regex.verifLettre(TFnom.getText()) && TFnom.getText().length() <= 40) {
								// si le nom ne contient que des lettres et n'est pas plus long que 40 c'est bon
								if (Regex.verifLettre(TFprenom.getText()) == true
										&& TFprenom.getText().length() <= 40) {
									// idem pour le prenom
									if (Regex.verifLettre(TFrue.getText()) == true && TFrue.getText().length() <= 50) {
										// test rue ici
										if (Regex.verifNum(TFnum.getText()) == true && TFnum.getText().length() <= 3) {
											// test numéro rue
											if (Regex.verifCP(TFcp.getText()) == true) {
												// test du CP
												if (Regex.verifLettre(TFville.getText()) == true
														&& TFville.getText().length() <= 40) {
													// test du nom de la ville
													String address = (new StringBuilder().append(TFrue.getText()).append(" ").append(TFnum.getText()).append(" ")
															.append(TFcp.getText()).append(" ").append(TFville.getText())).toString();
													// SI on arrive ici c'est que l'utilisateur a bien entré les
													// information comme il faut, on va pouvoir creer l'objet et
													// l'ajouter dans la base de donnée
													if (rdclient.isSelected()) {											
														// Vérification téléphone
														if(Regex.verifPhone(TFtelephone.getText()) == true) {
															if(birthDate != null) {
																// Création objet
																
																String sex = null;
																if(rdcmale.isSelected()) {
																	sex = "m";
																} else if(rdcfemale.isSelected()) {
																	sex = "f";
																} else if(rdcx.isSelected()) {
																	sex = "x";
																} else {
																	lblsys.setText("Choisiez un genre.");
																}
																
																if(sex != null) {
																	Spectator spec = new Spectator(TFnom.getText(), TFprenom.getText(), address, TFinsmail.getText(), String.valueOf(PFins.getPassword()), 
																			"Spectator", TFtelephone.getText(), sex, birthDate);
																	// Création de l'enregistrement dans la DB
																	boolean result = spec.create(conn);
																	if(result) {
																		lblsys.setText("Le compte a bien été créer, vous pouvez vous connecter");
																	} else {
																		lblsys.setText("Une erreur est survenue lors de la création du compte, contacter un Administrateur si le problème persiste.");
																	}
																} 
															} else {
																lblsys.setText("Vous devez entrer une date de naissance valide");
															}
														} else {
															lblsys.setText("Votre numéro de téléphone est invalide.");
														}
													} else if (rdorga.isSelected() == true) {
														if(Regex.verifPhone(TFtelephone.getText()) == true) { 
															// Création objet
															Organizer orga = new Organizer(TFnom.getText(), TFprenom.getText(),
																	address, TFinsmail.getText(), String.valueOf(PFins.getPassword()),
																	"Organizer",TFtelephone.getText());
															// Création de l'enregistrement dans la DB
															boolean result = orga.create(conn);
															if(result) {
																lblsys.setText("Le compte a bien été créer, vous pouvez vous connecter");
															} else {
																lblsys.setText("Une erreur est survenue lors de la création du compte, contacter un Administrateur si le problème persiste.");
															}
														}
													} else if (rdgest.isSelected() == true) {
														if(Regex.verifPhone(TFtelephone.getText()) == true) {
															// Création objet
															Manager man = new Manager(TFnom.getText(), TFprenom.getText(),
																	address, TFinsmail.getText(), String.valueOf(PFins.getPassword()),
																	"Manager", TFtelephone.getText());
															// Création de l'enregistrement dans la DB
															boolean result = man.create(conn);
															if(result) {
																lblsys.setText("Le compte a bien été créer, vous pouvez vous connecter");
															} else {
																lblsys.setText("Une erreur est survenue lors de la création du compte, contacter un Administrateur si le problème persiste.");
															}
														}
													} else {
														lblsys.setText("Il faut choisir un rôle pour continuer");
													}
												} else {
													lblsys.setText(
															"Le champ ville ne peut contenir que des caractères et faire 40 de long");
												}
											} else {
												lblsys.setText(
														"Le code postale ne peut contenir que des nombre et faire 4 de long");
											}
										} else {
											lblsys.setText(
													"Le champ numéro ne peut contenir que des numéro et faire 3 de long");
										}
									} else {
										lblsys.setText(
												"Le champ rue de peut contenir que des caractères et faire 50 de long");
									}
								} else {
									lblsys.setText(
											"Le champ nom de peut contenir que des caractères et faire 40 de long");
								}
							} else {
								lblsys.setText("Le champ nom de peut contenir que des caractères et faire 40 de long");
							}
						} else {
							lblsys.setText("Le format de mot de passe n'est pas bon, il faut entre 8 et 20 caractères, une majuscule, une minuscule, un chiffre et un caractére spécial ( sauf - et _ ) pour continuer");
						}
					} else {
						// Affichage d'un message d'erreur
						lblsys.setText("Le format de l'email n'est pas bon");
					}
				} else {
					// Affichage d'un message d'erreur
					lblsys.setText("Veillez remplir tout les champs pour continuer votre inscription");
				}
			}
		});

	}
}
