package Gimnasio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IniciosSesion extends JFrame {
    private JComboBox<String> comboBoxRoles;
    private JTextField textFieldUsuario;
    private JPasswordField passwordFieldContraseña;
    private JButton btnIniciarSesion;
    private JButton btnRegistrarse; // Corregido el nombre del botón

    public IniciosSesion() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(IniciosSesion.class.getResource("/Recursos/images.jpg")));
        setTitle("Inicio de Sesión");
        setSize(744, 464);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        JLabel lblRol = new JLabel("Soy");
        lblRol.setBounds(0, 1, 87, 102);
        comboBoxRoles = new JComboBox<>(new String[]{"Dueño", "Usuario"});
        comboBoxRoles.setBounds(88, 36, 199, 32);
        panel.setLayout(null);
        panel.add(lblRol);
        panel.add(comboBoxRoles);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(0, 108, 361, 102);
        textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(61, 143, 274, 32);
        panel.add(lblUsuario);
        panel.add(textFieldUsuario);

        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(0, 215, 361, 102);
        passwordFieldContraseña = new JPasswordField();
        passwordFieldContraseña.setBounds(73, 250, 191, 32);
        panel.add(lblContraseña);
        panel.add(passwordFieldContraseña);

        btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.setBounds(93, 306, 177, 87);
        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUsuario.getText();
                char[] contraseña = passwordFieldContraseña.getPassword();
                String rol = (String) comboBoxRoles.getSelectedItem();
               
                
                System.out.println("Rol: " + rol);
                System.out.println("Usuario: " + usuario);
                System.out.println("Contraseña: " + new String(contraseña));
            }
        });
        panel.add(btnIniciarSesion);

        getContentPane().add(panel);
        
        btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setBounds(351, 306, 177, 87);
        btnRegistrarse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Abre la ventana de registro
                Registro registro = new Registro();
                registro.setVisible(true);
            }
        });
        panel.add(btnRegistrarse);
    }

    public static void main(String[] args) {
        IniciosSesion inicioSesion = new IniciosSesion();
        inicioSesion.setVisible(true);
    }
}




