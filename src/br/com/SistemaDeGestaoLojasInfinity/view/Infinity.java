package br.com.SistemaDeGestaoLojasInfinity.view;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class Infinity {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Infinity window = new Infinity();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Infinity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	   // frame.setLocationRelativeTo(null);  
		
		JLabel logo = new JLabel("");
		logo.setBounds(110, 23, 272, 104);
		
		ImageIcon imagem = new ImageIcon(Infinity.class.getResource("/img/logp infinity.png"));
		Image imag = imagem.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT);
		
		logo.setIcon(new ImageIcon(imag));
		
		frame.getContentPane().add(logo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(186, 208, 176, 20);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(186, 167, 176, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario :");
		lblNewLabel.setBounds(133, 152, 200, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha :");
		lblSenha.setBounds(133, 193, 200, 50);
		frame.getContentPane().add(lblSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(234, 254, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxLembrar = new JCheckBox("Lembrar");
		chckbxLembrar.setBounds(133, 254, 103, 23);
		frame.getContentPane().add(chckbxLembrar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(122, 152, 249, 132);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(122, 295, 249, 2);
		frame.getContentPane().add(separator_1);
	}
}
