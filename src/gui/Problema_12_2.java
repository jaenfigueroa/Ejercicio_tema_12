package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import hijos.Particular;
import hijos.Profesional;
import padre.Licencia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_12_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_12_2 frame = new Problema_12_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_12_2() {
		setTitle("Problema_12_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(185, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 444, 563);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Arial", Font.PLAIN, 16));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Licencia l = new Licencia("A13", "1232A" , "12/12/2023" , "12/12/2028");
		Licencia pro = new Particular("A34", "1223A" , "23/12/2023" , "23/12/2028", 71312548 );
		Licencia par = new Profesional("A45", "1234A" , "05/12/2023" , "05/12/2028", "AJDH154848");
		
		imprimir(l);
		imprimir(pro);
		imprimir(par);
	}

	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
	void imprimir(Licencia x) {
		String datos = "";
		
		if(x instanceof Particular){
			datos += ">>>>>>>>>> LICENCIA PARTICULAR <<<<<<<<<<\n\n";
		}
		else if(x instanceof Profesional) {
			datos += ">>>>>>>>>> LICENCIA PROFESIONAL <<<<<<<<<<\n\n";
		}
		else if (x instanceof Licencia) {
			datos += ">>>>>>>>>> LICENCIA <<<<<<<<<<\n\n";
		}
		
		datos += x.datosCompletos()  + "\n";
		
		txtS.append(datos);
	}
}
