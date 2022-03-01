package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaholacentrada extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4101612737205782932L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaholacentrada frame = new ventanaholacentrada();
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
	public ventanaholacentrada() {
		setTitle("evento click");
		setTitle("eventoclick");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltexto = new JLabel("no se ha pulsado aceptar");
		lbltexto.setBounds(120, 75, 198, 22);
		lbltexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lbltexto);
		
		JButton btnaceptar = new JButton("aceptar");
		btnaceptar.setBounds(169, 108, 89, 27);
		btnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbltexto.setText(" se ha aceptado aceptar");
			}
		});
		btnaceptar.setFont(new Font("Snap ITC", Font.PLAIN, 13));
		contentPane.add(btnaceptar);
	}
}
