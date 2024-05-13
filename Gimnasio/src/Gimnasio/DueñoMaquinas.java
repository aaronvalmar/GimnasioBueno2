package Gimnasio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;

public class DueñoMaquinas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

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
	public DueñoMaquinas() {
		setTitle("DUEÑO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 573);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botonBancas = new JButton("Bancas");
		botonBancas.setIcon(new ImageIcon(DueñoMaquinas.class.getResource("/Recursos/banca.jpg")));
		buttonGroup.add(botonBancas);
		botonBancas.setBounds(30, 77, 322, 150);
		contentPane.add(botonBancas);
		
		JButton botonDiscos = new JButton("Discos");
		botonDiscos.setIcon(new ImageIcon(DueñoMaquinas.class.getResource("/Recursos/discos.jpg")));
		botonDiscos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonDiscos.setBounds(449, 77, 321, 165);
		contentPane.add(botonDiscos);
		
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
