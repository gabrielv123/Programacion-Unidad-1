package evaluacion1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ejercicio12a extends JFrame implements ActionListener {


	private JButton boton;
	private JLabel texto;
	/**
	 * 
	 */
	private static final long serialVersionUID = -8165725627426511460L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio12a frame = new ejercicio12a();
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
	public ejercicio12a() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 boton = new JButton("aceptar");
		boton.setBounds(160, 158, 89, 23);
		contentPane.add(boton);
		
		texto = new JLabel("");
		texto.setBounds(157, 78, 96, 23);
		contentPane.add(texto);
		boton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String respuesta = (String)JOptionPane.showInputDialog(this,(String)"Introduzca su Nombre: ","Cuadro de Diálogo de Introducción de Datos", JOptionPane.QUESTION_MESSAGE,null, null, "Sin Nombre");
	
		if (respuesta==null) {
			texto.setText("nooo");	
		}
			
				
		
		if (respuesta.equals(respuesta)) {
			
			texto.setText("hola "+respuesta);
		}
		
	}

}
