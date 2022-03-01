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

public class ejercicicio15 extends JFrame implements ActionListener {
	
	private JButton boton;
	private JLabel texto;
	/**
	 * 
	 */
	private static final long serialVersionUID = 2035457285805294619L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicicio15 frame = new ejercicicio15();
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
	public ejercicicio15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 boton = new JButton("boton");
		boton.setBounds(154, 166, 89, 23);
		contentPane.add(boton);
		boton.addActionListener(this);
		
		 texto = new JLabel("botonnn");
		texto.setBounds(135, 51, 122, 35);
		contentPane.add(texto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ImageIcon icono = new ImageIcon(this.getClass().getResource("/windowsbuilder.iconos/aplicacion.png"));
		
		String[] opciones = {"1AS3", "2AS3", "1DW3", "2DW3", "1SM2", "2SM2"};
		int opcion = JOptionPane.showOptionDialog(this,"Prueba de Cuadros de Diálogo","Cuadro de Diálogo con OpcionesPersonalizadas",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[2]); 
	
		
		String texto1="";
		
		if (opcion==-1) {
			
			texto.setText("errorrrrr");
			
		}
	
		else {
			
			texto1 = "ola " + opciones[opcion];

			texto.setText(texto1);
		}
	}
}
