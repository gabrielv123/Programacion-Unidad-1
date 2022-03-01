package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JButton;

public class ejercicio21 extends JFrame implements ListSelectionListener, ActionListener {

	private JList<String> lista;
	private JList<String> list1;
	private JLabel texto;
	private DefaultListModel<String> dlm;
	private DefaultListModel<String> dlmCopia;
	private JButton botons;
	private JButton botona;

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
					ejercicio21 frame = new ejercicio21();
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
	public ejercicio21() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		texto = new JLabel("texto");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setBounds(96, 11, 246, 43);
		contentPane.add(texto);

		dlm = new DefaultListModel<String>();
		dlm.addElement("1AS3");
		dlm.addElement("2AS3");
		dlm.addElement("1DW3");
		dlm.addElement("2DW3");
		lista = new JList<String>();

		dlmCopia = new DefaultListModel<String>();

		// asocio el DefaultListModel a la lista de Opciones
		lista.setModel(dlm);
		lista.addListSelectionListener(this);
		lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		lista.setBounds(0, 39, 61, 222);
		contentPane.add(lista, BorderLayout.WEST);

		list1 = new JList<String>();
		list1.setBounds(361, 39, 73, 222);
		contentPane.add(list1);
		list1.setModel(dlmCopia);

		botons = new JButton("siguiente");
		botons.setBounds(166, 85, 89, 23);
		contentPane.add(botons);
		botons.addActionListener(this);

		botona = new JButton("anterior");
		botona.setBounds(166, 149, 89, 23);
		contentPane.add(botona);
		botona.addActionListener(this);

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

		// cuando cambia el elemento seleccionado

		// cambio el valor de la etiqueta
		String seleccion = (String) this.lista.getSelectedValue();
		this.texto.setText(seleccion);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object o = e.getSource();

		if (o == this.botons) {

			// si quiero copiar de la lista izquierda a la derecha
			int[] indices = this.lista.getSelectedIndices();
			int numeroOpciones = indices.length;
			String opcion = null;
			for (int posicion = numeroOpciones-1; posicion >=0; posicion--  ) {
				opcion = dlm.getElementAt(indices[posicion]);

				this.dlmCopia.addElement(opcion);
				dlm.remove(indices[posicion]);
				
			}


		}

		else if (o == this.botona) {

			// si quiero copiar de la lista derecha a la izquierda
			int[] indices = this.list1.getSelectedIndices();
			int numeroOpciones = indices.length;
			String opcion = null;

			for (int posicion = numeroOpciones-1; posicion >=0; posicion--) {
				opcion = dlmCopia.getElementAt(indices[posicion]);
				this.dlm.addElement(opcion);
				dlmCopia.remove(indices[posicion]);

			}

		}
	}
}