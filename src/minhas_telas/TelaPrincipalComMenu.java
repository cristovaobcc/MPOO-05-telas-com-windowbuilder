package minhas_telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
		mnNewMenu_1.add(mntmMenuItemNovoFuncionario);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
