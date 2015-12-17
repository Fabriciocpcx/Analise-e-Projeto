package br.com.SistemaDeGestaoLojasInfinity.view;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarCliente {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente window = new CadastrarCliente();
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
	public CadastrarCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 745, 614);
		//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCadastroDeCliente = new JLabel("CADASTRO DE CLIENTE");
		lblCadastroDeCliente.setBounds(10, 22, 216, 14);
		lblCadastroDeCliente.setFont(new Font("Eras Medium ITC", Font.PLAIN, 17));
		frame.getContentPane().add(lblCadastroDeCliente);
		
		JLabel lblNome = new JLabel("NOME :");
		lblNome.setBounds(9, 73, 46, 14);
		frame.getContentPane().add(lblNome);
		
		JLabel lblNewLabel = new JLabel("SOBRENOME :");
		lblNewLabel.setBounds(9, 123, 72, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblReferencias = new JLabel("REFERENCIAS :");
		lblReferencias.setBounds(9, 179, 86, 14);
		frame.getContentPane().add(lblReferencias);
		
		JLabel lblLimiteDeCrdito = new JLabel("LIMITE DE CR\u00C9DITO :");
		lblLimiteDeCrdito.setBounds(363, 179, 115, 14);
		frame.getContentPane().add(lblLimiteDeCrdito);
		
		JLabel lblRg = new JLabel("RG :");
		lblRg.setBounds(9, 289, 46, 14);
		frame.getContentPane().add(lblRg);
		
		JLabel lblCpf = new JLabel("CPF :");
		lblCpf.setBounds(361, 289, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblNascimento = new JLabel("NASCIMENTO :");
		lblNascimento.setBounds(8, 232, 73, 14);
		frame.getContentPane().add(lblNascimento);
		
		JLabel lblContato = new JLabel("CONTATO :");
		lblContato.setBounds(363, 232, 86, 14);
		frame.getContentPane().add(lblContato);
		
		JLabel lblLogradouro = new JLabel("LOGRADOURO :");
		lblLogradouro.setBounds(10, 363, 96, 14);
		frame.getContentPane().add(lblLogradouro);
		
		JLabel lblBairro = new JLabel("BAIRRO :");
		lblBairro.setBounds(10, 414, 46, 14);
		frame.getContentPane().add(lblBairro);
		
		JLabel lblN = new JLabel("N\u00BA :");
		lblN.setBounds(499, 363, 46, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblComplemento = new JLabel("COMPLEMENTO :");
		lblComplemento.setBounds(323, 414, 120, 14);
		frame.getContentPane().add(lblComplemento);
		
		JLabel lblCep = new JLabel("CEP :");
		lblCep.setBounds(488, 465, 46, 14);
		frame.getContentPane().add(lblCep);
		
		JLabel lblEstado = new JLabel("ESTADO :");
		lblEstado.setBounds(10, 465, 82, 14);
		frame.getContentPane().add(lblEstado);
		
		JLabel lblNewLabel_1 = new JLabel("CIDADE :");
		lblNewLabel_1.setBounds(259, 465, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(91, 70, 565, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 120, 565, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 176, 239, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(488, 176, 168, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(91, 229, 239, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(457, 229, 199, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(91, 286, 239, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(417, 286, 239, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(9, 331, 647, 2);
		frame.getContentPane().add(separator);
		
		textField_8 = new JTextField();
		textField_8.setBounds(91, 360, 370, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(88, 411, 191, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(524, 360, 132, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(417, 411, 239, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(91, 462, 132, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(329, 462, 120, 20);
		frame.getContentPane().add(comboBox_1);
		
		textField_12 = new JTextField();
		textField_12.setBounds(524, 462, 132, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 527, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 504, 646, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBounds(137, 527, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
	}
}
