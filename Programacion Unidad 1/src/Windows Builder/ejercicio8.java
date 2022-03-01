package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ejercicio8 extends JFrame implements ActionListener {

	private JLabel texto;
	private JButton boton;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1173517824282651344L;
	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio8 frame = new ejercicio8();
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
	public ejercicio8() {
		setTitle("nueva ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto = new JLabel("anonymo");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(150, 37, 89, 35);
		contentPane.add(texto);
		
		usuario = new JTextField();
		usuario.setHorizontalAlignment(SwingConstants.CENTER);
		usuario.setBounds(150, 83, 86, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		usuario.addActionListener(this);
		
		password = new JPasswordField();
		password.setBounds(150, 131, 86, 20);
		contentPane.add(password);
		password.addActionListener(this);
		
		boton = new JButton("New button");
		boton.setBounds(147, 195, 89, 23);
		contentPane.add(boton);
		boton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String usuario1 = "gabriel";
		String contraseña1 = "gabriel";
		String password1 = new String(password.getPassword());
	
		
		 if(usuario1.equals(usuario.getText()) && password1.equals(contraseña1)){
			
			 ejercicio2 vh = new ejercicio2();
			
			 vh.setTitle("Bienvenido "+usuario.getText());
		
			 vh.setVisible(true);
			 
			
			 this.dispose();
			 }
			 else{
			 this.setTitle("Datos Incorrectos.");
			 }
		
	}

}
