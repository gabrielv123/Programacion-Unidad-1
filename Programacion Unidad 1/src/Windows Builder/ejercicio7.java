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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ejercicio7 extends JFrame implements ActionListener {

	private JButton boton;
	private	JLabel texto;
	/**
	 * 
	 */
	private static final long serialVersionUID = 6264283746529962648L;
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
					ejercicio7 frame = new ejercicio7();
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
	public ejercicio7() {
		setTitle("foco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto = new JLabel("Anonymo");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(139, 34, 143, 37);
		contentPane.add(texto);
		
		usuario = new JTextField();
		usuario.setText("usuario");
		usuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				usuario.select(0, usuario.getText().length());

			}
			@Override
			public void focusLost(FocusEvent e) {
				usuario.select(0, 0);

			}
		});
		usuario.setHorizontalAlignment(SwingConstants.CENTER);
		usuario.setBounds(149, 98, 117, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		usuario.addActionListener(this);
		
		password = new JPasswordField();
		password.setText("contraseña");
		password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				password.setSelectionStart(0);
				String contrasena = new String(password.getPassword());
				password.setSelectionEnd(contrasena.length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				password.select(0, 0);
			}
		});
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(149, 140, 117, 20);
		contentPane.add(password);
		password.addActionListener(this);
		
		boton = new JButton("boton");
		boton.setBounds(149, 197, 117, 23);
		contentPane.add(boton);
		boton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String usuario1 = "gabriel";
		String contraseña1 = "gabriel";
		String password1 = new String(password.getPassword());
		
		if (usuario.getText().equals(usuario1) && password1.equals(contraseña1)) {
			texto.setText("seccion iniciada");
		
		}
		
	else {
		
		texto.setText("incorrecto" );
		
		}
		
	}
}
