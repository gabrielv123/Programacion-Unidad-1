package evaluacion1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;

public class ejercicio11 extends JFrame implements ActionListener  {

	private JButton boton0;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton botonmultiplicar;
	private JButton botondividir;
	private JButton botonsumar;
	private JButton botonrestar;
	private JButton botonigual;
	private JButton botonborrar;
	private JButton botonpunto;
	private JLabel texto;
	
	private JMenuBar menuBar;
	
	
	private JMenuItem menusalir;
	
	private JMenu menuoperacion;
	private JMenuItem menunuevo;
	private JMenuItem menunormal;
	private JMenuItem menusuma;
	private JMenuItem menurestar;
	private JMenuItem menumultiplicar;
	private JMenuItem menudivision;
	
	private JButton btnuevo;
	private JButton btsalir;
	private JLabel textolisto;
	
	
	String signo ="";
	
	double n1=0;
	
	double n2=0;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4466690830731146315L;
	private JPanel contentPane;
	private final JLabel texto1 = new JLabel("");
	private JMenuBar barraicon;
	private JButton btsuma;
	private JButton btresta;
	private JButton btmultiplicar;
	private JButton btdivision;
	private JButton btigual;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio11 frame = new ejercicio11();
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
	public ejercicio11() {
		setTitle("calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 466);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);


		
		menunormal = new JMenu("menu");
		menuBar.add(menunormal);
		menunormal.addActionListener (this);
		
		 menunuevo = new JMenuItem("nuevo");
		menunuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		menunormal.add(menunuevo);
		menunuevo.addActionListener (this);
		
		menusalir = new JMenuItem("salir");
		menusalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.ALT_MASK));
		menunormal.add(menusalir);
		menusalir.addActionListener (this);
		
		 menuoperacion = new JMenu("operaciones");
		menuBar.add(menuoperacion);
		menuoperacion.addActionListener (this);
		
		 menusuma = new JMenuItem("sumar");
		menusuma.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		menuoperacion.add(menusuma);
		menusuma.addActionListener (this);
		
		 menurestar = new JMenuItem("restar");
		menurestar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK));
		menuoperacion.add(menurestar);
		menurestar.addActionListener (this);
		
		menumultiplicar = new JMenuItem("multiplicar");
		menumultiplicar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
		menuoperacion.add(menumultiplicar);
		menumultiplicar.addActionListener (this);
		
		 menudivision = new JMenuItem("division");
		menudivision.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_MASK));
		 menudivision.addActionListener (this);
		
		menuoperacion.add(menudivision);
		menuBar.add(texto1);
		texto1.setHorizontalAlignment(SwingConstants.RIGHT);
		menuoperacion.addActionListener (this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton7.setBounds(178, 87, 54, 55);
		contentPane.add(boton7);
		boton7.addActionListener (this);
		
		boton5 = new JButton("5");
		boton5.setBounds(231, 141, 54, 55);
		contentPane.add(boton5);
		boton5.addActionListener (this);
		
		 boton6 = new JButton("6");
		boton6.setBounds(178, 141, 54, 55);
		contentPane.add(boton6);
		boton6.addActionListener (this);
		
		boton3 = new JButton("3");
		boton3.setBounds(178, 191, 54, 61);
		contentPane.add(boton3);
		boton3.addActionListener (this);
		
		boton8 = new JButton("8");
		boton8.setBounds(231, 87, 54, 55);
		contentPane.add(boton8);
		boton8.addActionListener (this);
		
		boton4 = new JButton("4");
		boton4.setBounds(283, 141, 54, 55);
		contentPane.add(boton4);
		boton4.addActionListener (this);
		
		boton1 = new JButton("1");
		boton1.setBounds(283, 194, 54, 55);
		contentPane.add(boton1);
		boton1.addActionListener (this);
		
		boton2 = new JButton("2");
		boton2.setBounds(231, 194, 54, 55);
		contentPane.add(boton2);
		boton2.addActionListener (this);
		
		botonsumar = new JButton("+");
		botonsumar.setBounds(336, 247, 47, 55);
		contentPane.add(botonsumar);
		botonsumar.addActionListener (this);
		
		boton9 = new JButton("9");
		boton9.setBounds(283, 87, 54, 55);
		contentPane.add(boton9);
		boton9.addActionListener (this);
		
		botonborrar = new JButton("CE");
		botonborrar.setBounds(384, 87, 77, 215);
		contentPane.add(botonborrar);
		botonborrar.addActionListener (this);
		
		botonrestar = new JButton("-");
		botonrestar.setBounds(336, 194, 47, 55);
		contentPane.add(botonrestar);
		botonrestar.addActionListener (this);
		
		botonmultiplicar = new JButton("*");
		botonmultiplicar.setBounds(336, 89, 47, 55);
		contentPane.add(botonmultiplicar);
		botonmultiplicar.addActionListener (this);
		
		 botondividir = new JButton("/");
		botondividir.setBounds(336, 141, 47, 55);
		contentPane.add(botondividir);
		botondividir.addActionListener (this);
		
		boton0 = new JButton("0");
		boton0.setBounds(178, 247, 54, 55);
		contentPane.add(boton0);
		boton0.addActionListener (this);
		
		botonigual = new JButton("=");
		botonigual.setBounds(283, 247, 54, 55);
		contentPane.add(botonigual);
		botonigual.addActionListener (this);
		
		botonpunto = new JButton(".");
		botonpunto.setBounds(231, 247, 54, 55);
		contentPane.add(botonpunto);
		
		texto = new JLabel("");
		texto.setHorizontalAlignment(SwingConstants.RIGHT);
		texto.setBounds(0, 11, 434, 13);
		
		contentPane.add(texto);
		
		barraicon = new JMenuBar();
		barraicon.setEnabled(false);
		barraicon.setBounds(136, 35, 325, 51);
		contentPane.add(barraicon);
		
		 btnuevo = new JButton("");
		btnuevo.setIcon(new ImageIcon(ejercicio11.class.getResource("/evaluacion1/Icon/nuevo.gif")));
		barraicon.add(btnuevo);
		btnuevo.addActionListener (this);
		
		btsalir = new JButton("");
		btsalir.setIcon(new ImageIcon(ejercicio11.class.getResource("/evaluacion1/Icon/salir.gif")));
		barraicon.add(btsalir);
		btsalir.addActionListener (this);
		
		
		btsuma = new JButton("+");
		barraicon.add(btsuma);
		btsuma.addActionListener (this);
		
		btresta = new JButton("-");
		btresta.setIcon(null);
		barraicon.add(btresta);
		btresta.addActionListener (this);
		
		btmultiplicar = new JButton("*");
		barraicon.add(btmultiplicar);
		btmultiplicar.addActionListener (this);
		
		btdivision = new JButton("/");
		barraicon.add(btdivision);
		btdivision.addActionListener (this);
		
		btigual = new JButton("=");
		barraicon.add(btigual);
		
		JPanel panel = new JPanel();
		panel.setBounds(178, 303, 283, 39);
		contentPane.add(panel);
		
		textolisto = new JLabel("estado listo");
		textolisto.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(textolisto);
		
		
		btigual.addActionListener (this);
	
		
		
		
		botonpunto.addActionListener (this);
		
		
		botonpunto.addActionListener (this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		 
		
		//acciones de botones
		
		if (o == boton0){
			
			texto.setText(texto.getText()+"0");
		
		}
		else if (o == boton1){
			
			texto.setText(texto.getText()+"1");
			texto1.setText(texto1.getText() + ((JButton)o).getText());

	
		}
		else if (o == boton2){
			
			texto.setText(texto.getText()+"2");
			texto1.setText(texto1.getText() + ((JButton)o).getText());
			
		}
		
		else if (o == boton3){
			
			texto.setText(texto.getText()+"3");
			texto1.setText(texto1.getText() + ((JButton)o).getText());
			
		}
		
		else if (o == boton4){
			
			texto.setText(texto.getText()+"4");
			texto1.setText(texto1.getText() + ((JButton)o).getText());			
		}
		
		else if (o == boton5){
			
			texto.setText(texto.getText()+"5");
			texto1.setText(texto1.getText() + ((JButton)o).getText());

	
		}
		else if (o == boton6){
			
			texto.setText(texto.getText()+"6");
			
			texto1.setText(texto1.getText() + ((JButton)o).getText());
			
		}
		
		else if (o == boton7){
			
			texto.setText(texto.getText()+"7");
			
			texto1.setText(texto1.getText() + ((JButton)o).getText());
			
			
			
		}
		
		else if (o == boton8){
			
			texto.setText(texto.getText()+"8");
			
			texto1.setText(texto1.getText() + ((JButton)o).getText());
			
			
			
		}
		
		else if (o == boton9){
			
			texto.setText(texto.getText()+"9");
			
			texto1.setText(texto1.getText() + ((JButton)o).getText());
			
			
			
		}

	
		else if (o==botonsumar || o==btsuma) {
			
			n1=Double.parseDouble(texto.getText());
			
			signo="+";
			
			texto.setText("");
			
			texto1.setText(texto1.getText() + ((JButton)botonsumar).getText());
			
			textolisto.setText("estado operando");
			
		}

		else if (o==botonrestar || o==btresta) {
					
					n1=Double.parseDouble(texto.getText());
					
					signo="-";
					
					texto.setText("");
					
					texto1.setText(texto1.getText() + ((JButton)botonrestar).getText());
					
					textolisto.setText("estado operando");
					
				}
		
				
		else if (o==botonmultiplicar || o==btmultiplicar) {
			
			n1=Double.parseDouble(texto.getText());
			
			signo="*";
			
			texto.setText("");
			
			texto1.setText(texto1.getText() + ((JButton)botonmultiplicar).getText());
			
			textolisto.setText("estado operando");
			
		}
		
				
		else if (o==botondividir || o==btdivision ) {
			
			n1=Double.parseDouble(texto.getText());
			
			signo="/";
			
			texto.setText("");
			
			texto1.setText(texto1.getText() + ((JButton)botondividir).getText());
			
			textolisto.setText("estado operando");
			
		}
		
		
		
		
		
		
			else if (o==btnuevo) {
			
			
			texto.setText("");
			texto1.setText("");
			
			textolisto.setText("estado listo");

			
		}
		
			else if (o==btsalir) {
				
				
				System.exit(0);
				
			}
			
		
		//menu
			else if (o.equals(menusuma)) {
				
				botonsumar.doClick();
			} else if (o.equals(menurestar)) {
				
				botonrestar.doClick();
			} else if (o.equals(menudivision)) {
				
				botondividir.doClick();
			} else if (o.equals(menumultiplicar)) {
				
				botonmultiplicar.doClick();
			} else if (o.equals(menunuevo)) {
				
				botonborrar.doClick();
			} else if (o.equals(menusalir)) {
				System.exit(0);
			}
		
		else if (o.equals(botondividir) || o.equals(botonmultiplicar) || o.equals(botonsumar) || o.equals(botonrestar) ) {
			
			
				
			textolisto.setText("estado operando");
			
				texto1.setText(texto.getText() + ((JButton)o).getText());
			
			
		}

		//botones del punto y borrar
		
		else if (o==botonpunto) {
			
			texto.setText(texto.getText()+".");
				
	
		}
		
		
		else if (o == botonborrar){
			
			texto.setText("");
			texto1.setText("");
			
			textolisto.setText("estado listo");
		}
		
		
		else if (o==botonigual || o==btigual ) {
			
			n2=Double.parseDouble(texto.getText());
			
			texto1.setText("");
			
			textolisto.setText("estado listo");
				
		
		//case de las operaciones
			
		switch (signo) {
		
		case "+":
			
			texto.setText(Double.toString(n1+n2));
			
			break;
			
		case "-":
			
			texto.setText(Double.toString(n1-n2));
			
			break;
			
		case "*":
	
		texto.setText(Double.toString(n1*n2));
		
			break;
		
		case "/":
		
		texto.setText(Double.toString(n1/n2));
		
			break;
	
		
		}
		}
		
	}
}
