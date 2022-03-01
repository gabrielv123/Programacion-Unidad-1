package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class ejercicio14 extends JFrame implements ActionListener{
	
	private JButton boton;
	private JLabel texto;

	/**
	 * 
	 */
	private static final long serialVersionUID = 6095556183503868349L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio14 frame = new ejercicio14();
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
	public ejercicio14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		boton = new JButton("boton");
		boton.setBounds(152, 143, 89, 23);
		contentPane.add(boton);
		boton.addActionListener(this);
		
		 texto = new JLabel("PULSA UN BOTONNN");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(66, 28, 284, 23);
		contentPane.add(texto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ImageIcon icono = new ImageIcon(this.getClass().getResource("/iconos/aplicacion.png"));
		
		int opcion = JOptionPane.showConfirmDialog(this,(String)"Prueba de Cuadros de Diálogo","Cuadro de Diálogo deConfirmación",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,icono);

		
		if (opcion==JOptionPane.YES_OPTION) {
			
			texto.setText("haz pulsado boton1");
			
		}
		
		else if (opcion==JOptionPane.NO_OPTION) {
			
			texto.setText("haz pulsado boton2");
			
		}
		
		else if (opcion==JOptionPane.CANCEL_OPTION) {
			
			texto.setText("haz pulsado boton3");
			
		}
		
		else if (opcion==JOptionPane.CLOSED_OPTION) {
			
			texto.setText("ERRORRRRR");
			
		}
			
		
	}

}
