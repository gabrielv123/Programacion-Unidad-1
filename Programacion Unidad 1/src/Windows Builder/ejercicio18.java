package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.WindowAdapter;

public class ejercicio18 extends JFrame implements ChangeListener, ActionListener, WindowListener {

	private JLabel texto;
	private JCheckBox checkcursiva;
	private JCheckBox checknegrita;
	private JRadioButton rtazul;
	private JRadioButton rt12;
	private JRadioButton rt14;
	private JRadioButton rt16;
	private JRadioButton rtrojo;
	private JRadioButton rtnegro;
	private ButtonGroup btgColores;
	private ButtonGroup btgtamaño;

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
					ejercicio18 frame = new ejercicio18();
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
	public ejercicio18() {
	
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
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

		// agrupo los radio buttons.
		btgColores = new ButtonGroup();
		btgColores.add(rtnegro);
		btgColores.add(rtrojo);
		btgColores.add(rtazul);

		

		rt12 = new JRadioButton("12");
		rt12.setBounds(140, 90, 109, 23);
		contentPane.add(rt12);
		rt12.addActionListener(this);

		rt14 = new JRadioButton("14");
		rt14.setBounds(140, 124, 109, 23);
		contentPane.add(rt14);
		rt14.addActionListener(this);

		rt16 = new JRadioButton("16");
		rt16.setBounds(140, 157, 109, 23);
		contentPane.add(rt16);
		rt16.addActionListener(this);
		
		btgtamaño = new ButtonGroup();
		btgtamaño.add(rt12);
		btgtamaño.add(rt14);
		btgtamaño.add(rt16);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub

		// cojo la fuente actual
		Font fuenteNueva = this.texto.getFont();
		int formato = 0;

		// actualizo la fuente
		if (this.checkcursiva.isSelected()) {
			// si hay que ponerla en cursiva
			formato = formato + Font.ITALIC;
		}
		if (this.checknegrita.isSelected()) {

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
		if (o == this.rtnegro) {
			// si se ha pulsado negro
			this.texto.setForeground(Color.BLACK);
		} else if (o == this.rtrojo) {
			// si se ha pulsado rojo
			this.texto.setForeground(Color.RED);
		} else if (o == this.rtazul) {
			// si se ha pulsado azul
			this.texto.setForeground(Color.BLUE);

		}

		if (o == this.rt12) {
				
			texto.setFont(new Font("Tahoma", Font.PLAIN, 12));
			
		}

		if (o == this.rt14) {

			texto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		}

		if (o == this.rt16) {
			
			texto.setFont(new Font("Tahoma", Font.PLAIN, 16));

		}
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(this,(String)"antonio un cafee","Agur",JOptionPane.INFORMATION_MESSAGE,null);
		 System.exit(0);

		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}

