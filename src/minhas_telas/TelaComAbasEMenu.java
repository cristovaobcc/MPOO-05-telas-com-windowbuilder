package minhas_telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TelaComAbasEMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaComAbasEMenu frame = new TelaComAbasEMenu();
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
	public TelaComAbasEMenu() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelDadosPessoais = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panelDadosPessoais, null);
		GroupLayout gl_panelDadosPessoais = new GroupLayout(panelDadosPessoais);
		gl_panelDadosPessoais.setHorizontalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGap(0, 785, Short.MAX_VALUE)
		);
		gl_panelDadosPessoais.setVerticalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGap(0, 533, Short.MAX_VALUE)
		);
		panelDadosPessoais.setLayout(gl_panelDadosPessoais);
	}

}
