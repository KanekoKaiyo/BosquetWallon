package be.josimon.BWJFrame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.josimon.BWPOJO.Organizer;

public class OrgaAccueil extends JFrame {
	private static final long serialVersionUID = 3287489519008992364L;
	private JPanel contentPane;
	JFrame instance = this;

	/**
	 * Create the frame.
	 */
	public OrgaAccueil(Organizer orga) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnrsvsalle = new JButton("Reserver la Salle");
		contentPane.setLayout(null);
		btnrsvsalle.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnrsvsalle.setBounds(666, 7, 588, 315);
		contentPane.add(btnrsvsalle);
		
		JButton btnViewReservation = new JButton("Voir mes reservations");
		btnViewReservation.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btnViewReservation.setBounds(666, 355, 588, 315);
		contentPane.add(btnViewReservation);
		
		JButton btnCreateSpec = new JButton("Cr\u00E9er un Spectacle");
		btnCreateSpec.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCreateSpec.setBounds(10, 11, 286, 315);
		contentPane.add(btnCreateSpec);
		
		JButton btnCreateRepre = new JButton("Cr\u00E9er une repr\u00E9sentation");
		btnCreateRepre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnCreateRepre.setBounds(10, 355, 286, 315);
		contentPane.add(btnCreateRepre);
		
		JButton btnViewRepre = new JButton("Voir mes repr\u00E9sentation");
		btnViewRepre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnViewRepre.setBounds(306, 355, 286, 315);
		contentPane.add(btnViewRepre);
		setTitle("Accueil Gestion" + orga.getFirstname() + " " + orga.getLastname());
		
		// Action
		
		btnrsvsalle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrgaCreationReservation frame2 = new OrgaCreationReservation(orga);
				frame2.setVisible(true);
				instance.dispose();
			}
		});
		
		btnViewReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrgaViewReservation frame2 = new OrgaViewReservation(orga);
				frame2.setVisible(true);
				instance.dispose();
			}
		});
		
		btnCreateSpec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrgaCreationShow frame2 = new OrgaCreationShow(orga);
				frame2.setVisible(true);
				instance.dispose();
			}
		});
	}
}
