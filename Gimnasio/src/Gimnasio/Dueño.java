package Gimnasio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class Dueño extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dueño frame = new Dueño();
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
	public Dueño() {
		setTitle("DUEÑO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 573);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Compra máquinas");
		btnNewButton.setBounds(238, 97, 238, 67);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DueñoMaquinas dueñoMaquinas=new DueñoMaquinas();
				dueñoMaquinas.setVisible(true);
			}
			
		});;
		JButton btnNewButton_1 = new JButton("Gestionar Usuarios");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(238, 201, 238, 67);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Compra de suplementos");
		btnNewButton_2.setBounds(238, 295, 238, 79);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Venta de suplementos");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(238, 399, 238, 67);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("\t\t\t\tDUEÑO");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		lblNewLabel.setBounds(286, 0, 795, 86);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 20, 523);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Dueño.class.getResource("/Recursos/ladoderecho.jpg")));
		lblNewLabel_2.setBounds(30, 0, 765, 534);
		contentPane.add(lblNewLabel_2);
	}
}
