package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ejercicio12 extends JFrame implements ActionListener {
	
	
	private JButton boton;

	/**
	 * 
	 */
	private static final long serialVersionUID = 780857801672877505L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio12 frame = new ejercicio12();
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
	public ejercicio12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 boton = new JButton("aceptar");
		boton.setBounds(154, 177, 89, 23);
		contentPane.add(boton);
		boton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(this,(String)"Prueba de Cuadros de Diálogo","Cuadro de Diálogo Mensaje",JOptionPane.INFORMATION_MESSAGE,null);

		
		
	}

}
