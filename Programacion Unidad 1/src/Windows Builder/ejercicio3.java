package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class ejercicio3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3885970181314163151L;
	private JPanel contentPane;
	private JTextField txtGabriel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio3 frame = new ejercicio3();
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
	public ejercicio3() {
		setTitle("ventana jfield");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtGabriel = new JTextField();
		txtGabriel.setText("nombre");
		txtGabriel.setHorizontalAlignment(SwingConstants.CENTER);
		txtGabriel.setForeground(Color.RED);
		txtGabriel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtGabriel.setBounds(155, 104, 110, 38);
		contentPane.add(txtGabriel);
		txtGabriel.setColumns(10);
		
		JLabel lbltexto = new JLabel("anonymo");
		lbltexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbltexto.setHorizontalAlignment(SwingConstants.CENTER);
		lbltexto.setForeground(Color.BLACK);
		lbltexto.setBounds(155, 39, 110, 41);
		contentPane.add(lbltexto);
		txtGabriel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbltexto.setText("bienvenido "+txtGabriel.getText());
			}
		});
		
		JButton btnaceptar = new JButton("nombre secreto");
		btnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbltexto.setText("bienvenido "+txtGabriel.getText());
			}
		});
		btnaceptar.setBounds(102, 180, 207, 23);
		contentPane.add(btnaceptar);
		
		
	

	
	}
}

