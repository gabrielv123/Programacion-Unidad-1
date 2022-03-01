package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ejercicio9 extends JFrame implements ActionListener {

	private JLabel texto1;
	private JButton hola;
	private JButton caixo;
	private JButton adios;
	private JButton agur;
	/**
	 * 
	 */
	private static final long serialVersionUID = -4408537358581139380L;
	private JPanel contentPane;
	private JTextField nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio9 frame = new ejercicio9();
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
	public ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		hola = new JButton("hola");
		hola.setBounds(0, 23, 209, 92);
		contentPane.add(hola);
		hola.addActionListener(this);
		
		caixo = new JButton("caixo");
		caixo.setBounds(0, 116, 209, 92);
		contentPane.add(caixo);
		caixo.addActionListener(this);
		
		adios = new JButton("adios");
		adios.setBounds(209, 23, 215, 92);
		contentPane.add(adios);
		adios.addActionListener(this);
		
		agur = new JButton("agur");
		agur.setBounds(209, 116, 215, 92);
		contentPane.add(agur);
		agur.addActionListener(this);
		
		texto1 = new JLabel("accion realiza");
		texto1.setHorizontalAlignment(SwingConstants.CENTER);
		texto1.setBounds(0, 205, 424, 45);
		contentPane.add(texto1);
		
		nombre = new JTextField();
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setText("nombre");
		nombre.setBounds(0, 0, 424, 25);
		contentPane.add(nombre);
		nombre.setColumns(10);
		nombre.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		Object o = e.getSource();
		
		if (o == hola){
			texto1.setText("hola " +nombre.getText()); 
		}
		
		else if (o == adios){
			texto1.setText("adios " +nombre.getText()); 
		}
		else if (o == caixo){
			texto1.setText("caixo " +nombre.getText()); 
		}
		
		else if (o == agur){
		texto1.setText("agur " +nombre.getText()); ;
		}
		
		else if (o== nombre) {
			texto1.setText(""+nombre.getText()); ;
		}
	}

}
