package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ejercicio1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4984624336857041236L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1 frame = new ejercicio1();
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
	public ejercicio1() {
		setTitle("Ejercicio 1 Hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltexto = new JLabel("hola mundo");
		lbltexto.setHorizontalAlignment(SwingConstants.CENTER);
		lbltexto.setBackground(Color.RED);
		lbltexto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbltexto.setBounds(131, 58, 152, 44);
		contentPane.add(lbltexto);
		
		JButton btnAceptar = new JButton("aceptar");
		btnAceptar.setBounds(160, 128, 88, 23);
		btnAceptar.setForeground(Color.RED);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				lbltexto.setText("Ha pulsado Aceptar.");

				
			}
		});
		contentPane.add(btnAceptar);
		

	}
}
