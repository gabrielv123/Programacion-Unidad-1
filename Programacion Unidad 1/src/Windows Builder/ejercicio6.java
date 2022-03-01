package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ejercicio6 extends JFrame implements ActionListener {

	private JLabel texto;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7315402178093947346L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio6 frame = new ejercicio6();
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
	public ejercicio6() {
		setTitle("evento continuo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 texto = new JLabel("ningun boton seleccionado");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setFont(new Font("Stencil", Font.PLAIN, 17));
		texto.setBounds(47, 44, 318, 42);
		contentPane.add(texto);
		
		
		 boton1 = new JButton("boton 1");
		boton1.setBounds(33, 148, 89, 23);
		contentPane.add(boton1);
		boton1.addActionListener(this);
		
		 boton2 = new JButton("boton 2");
		boton2.setBounds(173, 148, 89, 23);
		contentPane.add(boton2);
		boton2.addActionListener(this);
		
		boton3 = new JButton("boton 3");
		boton3.addActionListener(this);
		
		
			
			
		
		boton3.setBounds(311, 148, 89, 23);
		contentPane.add(boton3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		
		Object o = e.getSource();
		
		if (o == boton1){
			texto.setText("boton 1 ");
		}
		
		else if (o == boton2){
			texto.setText("boton 2");
		}
		else if (o == boton3){
			texto.setText("boton 3 ");
		}
		
	}
}

