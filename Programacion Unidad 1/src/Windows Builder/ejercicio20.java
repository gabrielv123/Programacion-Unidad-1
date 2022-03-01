package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;

public class ejercicio20 extends JFrame implements ListSelectionListener {
	
	private JList<String> lista;
	private JLabel texto;
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8574775054634197377L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio20 frame = new ejercicio20();
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
	public ejercicio20() {
		

		
	
		
		
		
		

		 
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto = new JLabel("texto");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(78, 11, 246, 43);
		contentPane.add(texto);
		
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		dlm.addElement("1AS3");
		dlm.addElement("2AS3");
		dlm.addElement("1DW3");
		dlm.addElement("2DW3");
		lista = new JList<String>();
		// asocio el DefaultListModel a la lista de Opciones
		lista.setModel(dlm);
		lista.addListSelectionListener(this);
		lista.setBounds(21, 64, 181, 160);
		 contentPane.add(lista, BorderLayout.WEST);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
		// cuando cambia el elemento seleccionado
		
		// cambio el valor de la etiqueta
		 String seleccion = (String) this.lista.getSelectedValue();
		 this.texto.setText(seleccion);

		
	}
}
