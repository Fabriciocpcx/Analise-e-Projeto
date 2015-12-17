package br.com.SistemaDeGestaoLojasInfinity.view;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

public class TelaMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu window = new TelaMenu();
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
	public TelaMenu() {
		initialize();
	}

	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		//frame.setBounds(100, 100, 475, 305);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1362, 37);
		frame.getContentPane().add(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenu mnNotaFiscal = new JMenu("Nota Fiscal");
		menuBar.add(mnNotaFiscal);
		
		JMenuItem mntmEmitirNotaFiscal = new JMenuItem("Emitir Nota Fiscal");
		mnNotaFiscal.add(mntmEmitirNotaFiscal);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mnNotaFiscal.add(mntmConsultar);
		
		JMenu mnAtendimento = new JMenu("Atendimento");
		menuBar.add(mnAtendimento);
		
		JMenuItem mntmNovaCompra = new JMenuItem("Nova Venda");
		mnAtendimento.add(mntmNovaCompra);
		
		JMenuItem mntmTrocarProduto = new JMenuItem("Trocar Produto");
		mnAtendimento.add(mntmTrocarProduto);
		
		JMenuItem mntmPagamento = new JMenuItem("Pagamento");
		mnAtendimento.add(mntmPagamento);
		
		JMenu mnNewMenu = new JMenu("Cadastro");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCadastrarCliente = new JMenuItem("Cadastrar Cliente");
		mnNewMenu.add(mntmCadastrarCliente);
		
		JMenuItem mntmConsultarCliente = new JMenuItem("Consultar Cliente");
		mnNewMenu.add(mntmConsultarCliente);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastrar Funcionario");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmCadastrarFuncionario = new JMenuItem("Consutar Funcionario");
		mnNewMenu.add(mntmCadastrarFuncionario);
		
		JMenu mnEstoque = new JMenu("Estoque");
		menuBar.add(mnEstoque);
		
		JMenuItem mntmCadastrarNovoProduto = new JMenuItem("Cadastrar novo Produto");
		mnEstoque.add(mntmCadastrarNovoProduto);
		
		JMenuItem mntmRemoverProduto = new JMenuItem("Remover Produto");
		mnEstoque.add(mntmRemoverProduto);
		
		JMenuItem mntmConsultarProduto = new JMenuItem("Consultar Produto");
		mnEstoque.add(mntmConsultarProduto);
		
		JMenu mnRelatrio = new JMenu("Relat\u00F3rio");
		menuBar.add(mnRelatrio);
		
		JMenuItem mntmEmitirRelatorioDe = new JMenuItem("Relatorio de Vendas");
		mnRelatrio.add(mntmEmitirRelatorioDe);
		
		JMenuItem mntmRelatorioDeProdutos = new JMenuItem("Relatorio de Produtos");
		mnRelatrio.add(mntmRelatorioDeProdutos);
		
		JMenu mnFinanceiro = new JMenu("Financeiro");
		menuBar.add(mnFinanceiro);
		
		JMenuItem mntmFluxoDeCaixa = new JMenuItem("Fluxo de caixa");
		mnFinanceiro.add(mntmFluxoDeCaixa);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		JLabel img1 = new JLabel("");
		img1.setBounds(1042, 558, 278, 98);
		ImageIcon imagem = new ImageIcon(TelaMenu.class.getResource("/img/logp infinity.png"));
		Image imag = imagem.getImage().getScaledInstance(img1.getWidth(),img1.getHeight(),Image.SCALE_DEFAULT);
		
		img1.setIcon(new ImageIcon(imag));
		
		
		frame.getContentPane().add(img1);
	}
}
