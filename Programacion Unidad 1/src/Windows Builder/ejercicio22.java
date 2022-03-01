package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ejercicio22 extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel texto;
	private JButton botoninsertar;
	private JButton botonborrar;
	private JButton botonlimpiar;
	private JList<Integer> lista;
	private DefaultListModel<Integer> dlm;
	/**
	 * 
	 */
	private static final long serialVersionUID = 7718281489782145071L;
	private JPanel contentPane;
	private JTextField textonumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio22 frame = new ejercicio22();
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
	public ejercicio22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(5, 5, 424, 50);
		contentPane.add(panel);

		texto = new JLabel("numero");
		panel.add(texto);

		textonumero = new JTextField();
		textonumero.setText("0");
		panel.add(textonumero);
		textonumero.setColumns(10);
		textonumero.addActionListener(this);

		botoninsertar = new JButton("insertar");
		panel.add(botoninsertar);
		botoninsertar.addActionListener(this);

		botonborrar = new JButton("borrar");
		panel.add(botonborrar);
		botonborrar.addActionListener(this);

		botonlimpiar = new JButton("limpiar");
		panel.add(botonlimpiar);
		botonlimpiar.addActionListener(this);

		dlm = new DefaultListModel<Integer>();

		lista = new JList<Integer>();
		lista.setModel(dlm);
		lista.setBounds(5, 65, 419, 185);
		contentPane.add(lista);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object o = e.getSource();

		if (o == this.botoninsertar || o == textonumero) {

			Integer elemento = Integer.parseInt(textonumero.getText());

			if (dlm.contains(elemento)) {

				JOptionPane.showMessageDialog(this, "error", " borrar", JOptionPane.ERROR_MESSAGE);

			}

			else {
				dlm.addElement(elemento);
			}

		}

		if (o == this.botonborrar) {

			int[] indices = this.lista.getSelectedIndices();
			int numeroOpciones = indices.length;
			for (int posicion = numeroOpciones - 1; posicion >= 0; posicion--) {

				dlm.remove(indices[posicion]);

			}
		}

			if (o == botonlimpiar) {

				dlm.clear();
			}
		}

	}


