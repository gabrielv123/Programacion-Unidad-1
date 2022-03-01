package windowsbuilder;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class ejercicio25 extends JFrame implements ActionListener {

	private JComboBox<String> cmbGrupos;
	private JLabel lblTexto;
	private JList<String> lista;
	private DefaultListModel<String> dlm;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3626632485066096984L;
	private JPanel contentPane;
	private JButton botoninsertar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio25 frame = new ejercicio25();
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
	public ejercicio25() {

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
		lblTexto.setBounds(35, 236, 46, 14);
		contentPane.add(lblTexto);

		botoninsertar = new JButton("insertar");
		botoninsertar.setBounds(300, 16, 89, 23);
		contentPane.add(botoninsertar);

		dlm = new DefaultListModel<String>();
		lista = new JList<String>();
		lista.setModel(dlm);
		lista.setBounds(10, 68, 414, 154);
		contentPane.add(lista);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		
		if (o == botoninsertar){
			 String seleccion = (String) this.cmbGrupos.getSelectedItem();
			
			this.dlm.addElement(seleccion);
	
			if (dlm.contains(seleccion)) {

				JOptionPane.showMessageDialog(this, "error", " borrar", JOptionPane.ERROR_MESSAGE);
			}
		}
		

	 }
}
