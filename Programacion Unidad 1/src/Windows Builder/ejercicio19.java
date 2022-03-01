package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Color;

public class ejercicio19 extends JFrame implements ChangeListener , ActionListener {

	private JLabel texto;
	private JCheckBox checkcursiva;
	private JCheckBox checknegrita;
	private JRadioButton rtazul;
	private JRadioButton rtrojo;
	private JRadioButton rtnegro;
	private ButtonGroup btgColores;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5093825449615192866L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio19 frame = new ejercicio19();
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
	public ejercicio19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 texto = new JLabel("texto de prueba");
		texto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(5, 5, 424, 78);
		contentPane.add(texto);
	
		
		 checkcursiva = new JCheckBox("cursiva");
		checkcursiva.setBounds(16, 144, 97, 23);
		contentPane.add(checkcursiva);
		checkcursiva.addChangeListener(this);

		
		 checknegrita = new JCheckBox("negrita");
		checknegrita.setBounds(16, 170, 97, 23);
		contentPane.add(checknegrita);
		
		 rtnegro = new JRadioButton("negro");
		rtnegro.setBounds(291, 108, 109, 23);
		contentPane.add(rtnegro);
		rtnegro.addActionListener(this);
		
		 rtrojo = new JRadioButton("rojo");
		rtrojo.setForeground(Color.RED);
		rtrojo.setBounds(291, 144, 109, 23);
		contentPane.add(rtrojo);
		rtrojo.addActionListener(this);
		
		 rtazul = new JRadioButton("azul");
		rtazul.setForeground(Color.BLUE);
		rtazul.setBounds(291, 184, 109, 23);
		rtazul.addActionListener(this);
		contentPane.add(rtazul);
		checknegrita.addChangeListener(this);
		
		//agrupo los radio buttons.
		 btgColores = new ButtonGroup();
		 btgColores.add(rtnegro);
		 btgColores.add(rtrojo);
		 btgColores.add(rtazul);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		// cojo la fuente actual
		 Font fuenteNueva = this.texto.getFont();
		 int formato = 0;
		 // actualizo la fuente
		 if (this.checkcursiva.isSelected()){
		 // si hay que ponerla en cursiva
		 formato = formato + Font.ITALIC;
		 }
		 if (this.checknegrita.isSelected()){
			 

	
		// si hay que ponerla en negrita
		 formato = formato + Font.BOLD;
		 }
		 // actualizo el formato de la fuente
		 this.texto.setFont(new Font(fuenteNueva.getFamily(), formato, fuenteNueva.getSize()));
		 
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// compruebo que JRadioButton se ha pulsado
		 Object o = e.getSource();
		 if (o == this.rtnegro){
		 // si se ha pulsado negro
		 this.texto.setForeground(Color.BLACK);
		 }
		 else if (o == this.rtrojo){
		 // si se ha pulsado rojo
		 this.texto.setForeground(Color.RED);
		 }
		 else if (o == this.rtazul){
		 // si se ha pulsado azul
		 this.texto.setForeground(Color.BLUE);
		 }
		
	}
}