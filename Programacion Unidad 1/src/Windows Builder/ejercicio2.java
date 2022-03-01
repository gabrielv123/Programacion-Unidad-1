package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ejercicio2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6244261271003723661L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2 frame = new ejercicio2();
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
	public ejercicio2() {
		setTitle("eventoClick");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltexto = new JLabel("no se ha pulsado aceptar");
		lbltexto.setHorizontalAlignment(SwingConstants.CENTER);
		lbltexto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbltexto.setForeground(Color.BLUE);
		lbltexto.setBounds(138, 42, 157, 34);
		contentPane.add(lbltexto);
		
		JButton btnaceptar = new JButton("apretar aceptar");
		btnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbltexto.setText("se ha apretado aceptar");
				
			}
		});
		btnaceptar.setBounds(123, 148, 184, 23);
		contentPane.add(btnaceptar);
	}
}
