package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio4 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3520194111337765977L;
	private JPanel contentPane;
	private JPasswordField password;
	private JTextField textpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio4 frame = new ejercicio4();
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
	public ejercicio4() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(179, 79, 10, 10);
		getContentPane().add(panel);
		setTitle("VentanaJPasswordField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		password = new JPasswordField();
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(129, 134, 146, 34);
		contentPane.add(password);
		

		
		JLabel lblTexto = new JLabel("anonymo");
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setBounds(142, 33, 103, 34);
		contentPane.add(lblTexto);
		
		textpassword = new JTextField();
		textpassword.setHorizontalAlignment(SwingConstants.CENTER);
		textpassword.setBounds(129, 85, 146, 38);
		contentPane.add(textpassword);
		textpassword.setColumns(10);
		textpassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String user="1wa3";
				String contra="1wa3";
				String password1 = new String(password.getPassword());
					
					if (textpassword.getText().equals(user) && password1.equals(contra)) {
						lblTexto.setText("seccion iniciada");
					
					}
					
				else {
					
					lblTexto.setText("incorrecto" );
				}
			
			}
		});
		
		
		JButton btncomprobar = new JButton("comprobar");
		btncomprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String user="1wa3";
				String contra="1wa3";
				String password1 = new String(password.getPassword());
					
					if (textpassword.getText().equals(user) && password1.equals(contra)) {
						lblTexto.setText("seccion iniciada");
					
					}
					
				else {
					
					lblTexto.setText("incorrecto" );
					
					}
			}

			

			
				
			
		});
		btncomprobar.setBounds(139, 194, 120, 23);
		contentPane.add(btncomprobar);
	}
}
