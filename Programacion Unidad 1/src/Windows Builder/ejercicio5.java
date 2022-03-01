package evaluacion1;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class ejercicio5 extends JFrame implements ActionListener {

	private JLabel texto;
	private JButton boton;
	/**
	 * 
	 */
	private static final long serialVersionUID = 2191375744873630610L;
	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio5 frame = new ejercicio5();
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
	public ejercicio5() {
		setTitle("password");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto = new JLabel("anonymo");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(160, 21, 102, 50);
		contentPane.add(texto);
		
		usuario = new JTextField();
		usuario.setBounds(131, 96, 157, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		usuario.addActionListener(this);

		
		contraseña = new JPasswordField();
		contraseña.setBounds(131, 127, 157, 20);
		contentPane.add(contraseña);
		contraseña.addActionListener(this);
		
		boton = new JButton("inicia seccion");
		boton.addActionListener(this);
		
		boton.setBounds(123, 195, 177, 23);
		contentPane.add(boton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String usuario1 = "gabriel";
		String contraseña1 = "gabriel";
		String password1 = new String(contraseña.getPassword());
		
		if (usuario.getText().equals(usuario1) && password1.equals(contraseña1)) {
			texto.setText("seccion iniciada");
		
		}
		
	else {
		
		texto.setText("incorrecto" );
		
		}
		
	}

	
		
	}

