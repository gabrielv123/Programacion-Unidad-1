package windowsbuilder;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ejercicio23 extends JFrame  implements ActionListener{

	private JComboBox<String> cmbGrupos;
	private JLabel lblTexto;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3626632485066096984L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio23 frame = new ejercicio23();
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
	public ejercicio23() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 
		
		
		
		// comboBox de Grupos
		 cmbGrupos = new JComboBox<String>();
		 cmbGrupos.addItem("1AS3");
		 cmbGrupos.addItem("2AS3");
		 cmbGrupos.addItem("1DW3");
		 cmbGrupos.addItem("2DW3");
		 cmbGrupos.setSelectedIndex(0);
		 cmbGrupos.addActionListener(this);
		 cmbGrupos.setBounds(97, 11, 193, 32);
			contentPane.add(cmbGrupos);
		
		lblTexto = new JLabel("texto");
		lblTexto.setBounds(38, 212, 46, 14);
		contentPane.add(lblTexto);
		
		 
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// cuando cambia el elemento seleccionado
		 // cambio el valor de la etiqueta
		 //int indiceSelecionado = lse.getFirstIndex();
		 String seleccion = (String) this.cmbGrupos.getSelectedItem();
		 this.lblTexto.setText(seleccion);

		
	}
}
