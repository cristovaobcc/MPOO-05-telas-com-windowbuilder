package minhas_telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipalComMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalComMenu frame = new TelaPrincipalComMenu();
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
	public TelaPrincipalComMenu() {
		setTitle("AppPrincipal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenuCadastro = new JMenu("Cadastro");
		mnNewMenuCadastro.setMnemonic('C');
		menuBar.add(mnNewMenuCadastro);
		
		JMenu mnNewMenu_1 = new JMenu("Funcionário");
		mnNewMenu_1.setMnemonic('F');
		mnNewMenuCadastro.add(mnNewMenu_1);
		
		JMenuItem mntmMenuItemNovoFuncionario = new JMenuItem("Novo Funcionario");
		mntmMenuItemNovoFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DadosDoFuncionario dadosJanela = new DadosDoFuncionario();
				dadosJanela.setVisible(true);
				dadosJanela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
			}
		});
		mntmMenuItemNovoFuncionario.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnNewMenu_1.add(mntmMenuItemNovoFuncionario);
		
		JMenu mnGerente = new JMenu("Gerente");
		mnGerente.setMnemonic('G');
		mnNewMenuCadastro.add(mnGerente);
		
		JMenuItem mntmGerenteSupervisor = new JMenuItem("Novo Gerente Supervisor");
		mntmGerenteSupervisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DadosDoGerente dadosJanela = new DadosDoGerente();
				dadosJanela.setVisible(true);
				dadosJanela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}
		});
		mntmGerenteSupervisor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnGerente.add(mntmGerenteSupervisor);
		
		JMenuItem mntmGerenteDiretor = new JMenuItem("Novo Gerente Diretor");
		mntmGerenteDiretor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		mnGerente.add(mntmGerenteDiretor);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
