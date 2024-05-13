package Gimnasio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.Choice;

public class Accesorios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAccesorios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accesorios frame = new Accesorios();
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
	public Accesorios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 586, 66);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtAccesorios = new JTextField();
		txtAccesorios.setBounds(0, 0, 586, 66);
		panel_1.add(txtAccesorios);
		txtAccesorios.setText("                                                                Accesorios");
		txtAccesorios.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 77, 240, 279);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JEditorPane Mancuernas = new JEditorPane();
		Mancuernas.setBounds(49, 5, 107, 20);
		Mancuernas.setText("Mancuernas");
		panel.add(Mancuernas);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("                                                ");
		lblNewJgoodiesLabel.setBounds(30, 30, 144, 14);
		panel.add(lblNewJgoodiesLabel);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("1,5kg");
		chckbxNewCheckBox_1.setBounds(4, 49, 63, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("2kg");
		chckbxNewCheckBox.setBounds(69, 49, 53, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("5kg");
		chckbxNewCheckBox_2.setBounds(121, 49, 53, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("8kg");
		chckbxNewCheckBox_3.setBounds(177, 49, 53, 23);
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("10kg");
		chckbxNewCheckBox_4.setBounds(4, 77, 53, 23);
		panel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("20kg");
		chckbxNewCheckBox_5.setBounds(73, 77, 63, 23);
		panel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("12,5kg");
		chckbxNewCheckBox_6.setBounds(152, 77, 65, 23);
		panel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("17,5kg");
		chckbxNewCheckBox_7.setBounds(4, 105, 72, 23);
		panel.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("25kg");
		chckbxNewCheckBox_8.setBounds(78, 105, 58, 23);
		panel.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("30kg");
		chckbxNewCheckBox_9.setBounds(162, 105, 55, 23);
		panel.add(chckbxNewCheckBox_9);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Accesorios.class.getResource("/Recursos/mancuernas.jpg")));
		lblNewLabel.setBounds(4, 134, 226, 145);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Accesorios.class.getResource("/Recursos/mancuernaFondo.jpg")));
		lblNewLabel_1.setBounds(0, 0, 586, 383);
		contentPane.add(lblNewLabel_1);
		
		Choice choice = new Choice();
		choice.setBounds(315, 139, 146, 50);
		contentPane.add(choice);
		choice.add("Guantes");
		choice.add("Rodillo");
		choice.add("Mallas");
		
	}
}
