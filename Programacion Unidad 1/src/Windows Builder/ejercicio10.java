package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ejercicio10 extends JFrame implements ActionListener {
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton botonborrar;
	int num;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5303169518799462255L;
	private JPanel contentPane;
	private JTextField texto;

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
	public ejercicio10() {
		setTitle("calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		boton1 = new JButton("-");
		boton1.setBounds(0, 23, 145, 122);
		contentPane.add(boton1);
		boton1.addActionListener (this);
		
		boton2 = new JButton("x2");
		boton2.setBounds(145, 23, 145, 122);
		contentPane.add(boton2);
		boton2.addActionListener (this);
		
		boton3 = new JButton("x3");
		boton3.setBounds(290, 23, 144, 122);
		contentPane.add(boton3);
		boton3.addActionListener (this);
		
		boton4 = new JButton("raiz cuadrada");
		boton4.setBounds(0, 144, 145, 117);
		contentPane.add(boton4);
		boton4.addActionListener (this);
		
		boton5 = new JButton("1/x");
		boton5.setBounds(145, 144, 145, 117);
		contentPane.add(boton5);
		boton5.addActionListener (this);
		
		botonborrar = new JButton("CE");
		botonborrar.setBounds(290, 144, 145, 117);
		contentPane.add(botonborrar);
		botonborrar.addActionListener (this);
		
		texto = new JTextField();
		texto.setHorizontalAlignment(SwingConstants.TRAILING);
		texto.setText("0.0");
		texto.setBounds(0, 0, 434, 25);
		contentPane.add(texto);
		texto.setColumns(10);
		texto.addActionListener (this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		 
		String signo;
		
		double n12;
		
		double n1;
		
		if (o == boton1){
			

			n1=Double.parseDouble(texto.getText());
			
			signo="-";

			texto.setText(Double.toString(n1*-1));
		
		 
		}
		else if (o == boton2){
			
			n1=Double.parseDouble(texto.getText());
			
			signo="x2";

			texto.setText(Double.toString(n1*n1));

	
		}
		else if (o == boton3){
			
			n1=Double.parseDouble(texto.getText());
			
			signo="x3";

			texto.setText(Double.toString(n1*n1*n1));
			
		}
		
		else if (o == boton4){
			
			n1=Double.parseDouble(texto.getText());
			
			double raiz= Math.sqrt(n1);
			
			
			
			signo="raiz";

			texto.setText(Double.toString(raiz));
			
			
		}
		
		else if (o == boton5){
			
			n1=Double.parseDouble(texto.getText());
			
			signo="/";

			texto.setText(Double.toString(n1/1));
			
		}
		
		else if (o == botonborrar){
			
			texto.setText("0.0");
		}

		//n1=Integer.parseInt(texto.getText());
		//signo="/";
		//texto.setText(Integer.toString(n1/1));
	
}
}
