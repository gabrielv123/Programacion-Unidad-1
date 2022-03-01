package windowsbuilder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileFilter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import say.swing.JFontChooser;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

public class ejercicio17 extends JFrame implements ActionListener {

	private JButton botoncolor;
	private JButton botonfuente;
	private JButton botonarchivo;
	private JLabel texto;
	/**
	 * 
	 */
	private static final long serialVersionUID = -65576107174158860L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio17 frame = new ejercicio17();
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
	public ejercicio17() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 botonarchivo = new JButton("archivo");
		botonarchivo.setBounds(30, 156, 89, 23);
		contentPane.add(botonarchivo);
		botonarchivo.addActionListener(this);
		
		botoncolor = new JButton("color");
		botoncolor.setBounds(158, 156, 89, 23);
		contentPane.add(botoncolor);
		botoncolor.addActionListener(this);
		
		botonfuente = new JButton("fuente");
		botonfuente.setBounds(291, 156, 89, 23);
		contentPane.add(botonfuente);
		botonfuente.addActionListener(this);
		
		texto = new JLabel("texto");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		texto.setBounds(0, 0, 424, 145);
		contentPane.add(texto);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		
				
				Component contenedor =null;
				
				if (o==botonarchivo) {
					
					JFileChooser fileChooser = new JFileChooser();
					int opcion = fileChooser.showOpenDialog(this);
					
					if (opcion == JFileChooser.APPROVE_OPTION){
						// si ha pulsado Aceptar
						texto.setText("Ha elegido el archivo "+fileChooser.getSelectedFile());
						}
						else if (opcion == JFileChooser.CANCEL_OPTION){
						// si ha pulsado Cancelar
						texto.setText("Ha pulsado Cancelar");
						}
						else if (opcion == JFileChooser.ERROR_OPTION){
						// si ha producido un Error
						texto.setText("Se ha producido un Error.");
						}

					FileNameExtensionFilter filtro = new FileNameExtensionFilter("Ficheros de Texto","txt");
					fileChooser.setFileFilter(filtro);
					
					fileChooser.setAcceptAllFileFilterUsed(false);
					
					filtro = new FileNameExtensionFilter("Documentos de Word","doc");
					fileChooser.addChoosableFileFilter(filtro);

					
					
				}
				
				else if (o==botoncolor) {
					
					Color nuevoColor = JColorChooser.showDialog(this, "Elija un Color ...", texto.getForeground());
					texto.setForeground(nuevoColor);
					
				}
				
				else if (o==botonfuente) {
					
					int opcion;
					Font nuevaFuente;
					// muestro el JFontChooser
					JFontChooser fontChooser = new JFontChooser();
					nuevaFuente = texto.getFont();
					fontChooser.setSelectedFont(nuevaFuente);
					opcion = fontChooser.showDialog(contenedor);
					
					if (opcion == JFontChooser.OK_OPTION){
						// si se ha pulsado OK
						// cambio la fuente de la etiqueta
						nuevaFuente = fontChooser.getSelectedFont();
						texto.setFont(nuevaFuente);
						// cambio el texto de la etiqueta
						texto.setText("La fuente ha sido cambiada.");
						}
				}
		
	}
}
