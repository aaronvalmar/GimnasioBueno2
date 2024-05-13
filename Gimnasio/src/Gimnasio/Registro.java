package Gimnasio;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.sql.SQLException;

public class Registro extends JFrame {

    private JPanel contentPane;
    private JPasswordField passwordField;
    private JTextField NombreField;
    private JTextField UsuarioField;
    private JTextField CorreoField;
    private Date fecha;

    public Registro() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Registro.class.getResource("/Recursos/images.jpg")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 353);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nombre");
        lblNewLabel.setBounds(245, 32, 46, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1_2 = new JLabel("Usuario");
        lblNewLabel_1_2.setBounds(245, 92, 46, 14);
        contentPane.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
        lblNewLabel_1_1.setBounds(245, 145, 91, 14);
        contentPane.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1 = new JLabel("Correo");
        lblNewLabel_1.setBounds(245, 196, 46, 14);
        contentPane.add(lblNewLabel_1);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(311, 142, 113, 20);
        contentPane.add(passwordField);
        
        NombreField = new JTextField();
        NombreField.setBounds(311, 29, 119, 20);
        contentPane.add(NombreField);
        NombreField.setColumns(10);
        
        UsuarioField = new JTextField();
        UsuarioField.setBounds(305, 89, 119, 20);
        contentPane.add(UsuarioField);
        UsuarioField.setColumns(10);
        
        CorreoField = new JTextField();
        CorreoField.setBounds(307, 193, 117, 20);
        contentPane.add(CorreoField);
        CorreoField.setColumns(10);
        
        Button RegistrarseButton = new Button("Regístrate");
        RegistrarseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de los campos
                String nombre = NombreField.getText();
                String usuario = UsuarioField.getText();
                String contraseña = new String(passwordField.getPassword());
                String correo = CorreoField.getText();
                
                // Llamar al método para insertar el usuario en la base de datos
                Conexion conexion = new Conexion();
				conexion.insertarUsuario(nombre, usuario, contraseña, correo,fecha);
                
                
            }
        });
        RegistrarseButton.setBounds(137, 50, 70, 22);
        contentPane.add(RegistrarseButton);
        
        JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("");
        lblNewJgoodiesLabel.setIcon(new ImageIcon(Registro.class.getResource("/Recursos/jordi wild.jpg")));
        lblNewJgoodiesLabel.setBounds(0, 0, 434, 314);
        contentPane.add(lblNewJgoodiesLabel);
        lblNewJgoodiesLabel.setIcon(new ImageIcon(Registro.class.getResource("/Recursos/bocadillo.png")));
        lblNewJgoodiesLabel.setBounds(0, 0, 434, 314);
        contentPane.add(lblNewJgoodiesLabel);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registro frame = new Registro();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}