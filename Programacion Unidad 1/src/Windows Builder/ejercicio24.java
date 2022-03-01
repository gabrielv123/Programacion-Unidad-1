package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JButton;


public class ejercicio24 extends JFrame implements ActionListener {

	private JLabel Texto;
	private JProgressBar barra;
	private JButton botonstar;
	private JLabel texto2 ;
	private JPanel panel;
	private javax.swing.Timer timer;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5370733455691548826L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio24 frame = new ejercicio24();
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
	public ejercicio24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 60);
		contentPane.add(panel);
		
		 Texto = new JLabel("progress");
		panel.add(Texto);
		
		barra = new JProgressBar();
		// muestro el porcentaje en la JProgressBar
		 barra.setStringPainted(true);
		 panel.add(barra);
		
		timer = new javax.swing.Timer (100,this);
		
		botonstar = new JButton("star");
		botonstar.addActionListener(this);
		panel.add(botonstar);
		
		texto2 = new JLabel("sin datos");
		texto2.setBounds(10, 236, 46, 14);
		contentPane.add(texto2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		 if (o == botonstar){
		// Si se pulsa start
		// inicializo el valor de la barra de progreso a su valor minimo
		 barra.setValue(barra.getMinimum());
		 timer.start();
		 }
		 else {
		 // si el evento lo genera el timer
		 int valor;
		 valor = barra.getValue();
		 valor = valor + 1;
		 barra.setValue(valor);
		 if (valor == barra.getMaximum()){
		 // si la barra de progreso alcanza su valor maximo
		 // paro el timer
		 timer.stop();
		 texto2.setText("fin");
		 }
		 }
	}
}
