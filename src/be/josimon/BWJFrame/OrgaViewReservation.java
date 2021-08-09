package be.josimon.BWJFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import be.josimon.BWConnect.DBConnect;
import be.josimon.BWPOJO.Booking;
import be.josimon.BWPOJO.Organizer;


public class OrgaViewReservation extends JFrame {
	private static final long serialVersionUID = 8844762404654614280L;

	Connection conn = DBConnect.getInstance();
	
	private JPanel contentPane;
	JFrame instance = this;
	private JTable table;
	private JButton btnpay;
	private JScrollPane scrollPane;
	/**
	 * Create the frame.
	 */
	public OrgaViewReservation(Organizer orga) {
		orga.getReservation(conn); // TODO need to be tested
		orga.getPlaning(conn); // TODO need to be tested
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Vos réservations de la salle");
		Object[] toTable = new Object[7];
				
		JButton btnleave = new JButton("Quitter");
		btnleave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrgaAccueil frame2 = new OrgaAccueil(orga);
				instance.dispose();
				frame2.setVisible(true);
			}
		});
		btnleave.setBounds(759, 626, 113, 44);
		contentPane.add(btnleave);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 727, 659);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date d\u00E9but", "Date Fin", "Statut", "Prix", "Acompte", "Solde", "idReservation"
			}
		));
		contentPane.add(table.getTableHeader());
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for(Booking book:orga.getListBooking()) {
			toTable[0] = book.getPlanning().getBeginDate();
			toTable[1] = book.getPlanning().getEndDate();
			toTable[2] = book.getStatus();
			toTable[3] = book.getPrice();
			toTable[4] = book.getDeposite();
			toTable[5] = book.getBalance();
			toTable[6] = book.getId();
			model.addRow(toTable);
		}
		
		btnpay = new JButton("Payer");
		btnpay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int row = table.getSelectedRow();
					int id = (Integer) table.getModel().getValueAt(row, 6);
					String statut = (String) table.getModel().getValueAt(row, 2);
					if(statut.equals("Payé")) {
						JOptionPane.showMessageDialog(null,"Vous ne pouvez pas payer une reservation déja payé");
					} else {
						boolean test = orga.payReservation(id);
						if(test == true) {
							JOptionPane.showMessageDialog(null, "Payement effectué.");
							table.setValueAt("Payé", row, 2);
						} else {
							JOptionPane.showMessageDialog(null, "Un problème est survenue, contactez un administrateur.");
						}
					}
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Pour payer, il faut selectionner une reservation a payer.");
				}
			}
		});
		btnpay.setBounds(759, 11, 113, 37);
		contentPane.add(btnpay);
	}

}
