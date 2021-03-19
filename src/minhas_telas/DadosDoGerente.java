package minhas_telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class DadosDoGerente extends JFrame {

	private JPanel contentPaneDadosDeGerente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosDoGerente frame = new DadosDoGerente();
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
	public DadosDoGerente() {
		setTitle("Dados de Gerente Supervisor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPaneDadosDeGerente = new JPanel();
		contentPaneDadosDeGerente.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPaneDadosDeGerente.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPaneDadosDeGerente);
		
		JTabbedPane tabbedPaneGerente = new JTabbedPane(JTabbedPane.TOP);
		contentPaneDadosDeGerente.add(tabbedPaneGerente, BorderLayout.CENTER);
		
		JPanel panelDadosGerente = new JPanel();
		tabbedPaneGerente.addTab("Dados Pessoais", null, panelDadosGerente, null);
		GroupLayout gl_panelDadosGerente = new GroupLayout(panelDadosGerente);
		gl_panelDadosGerente.setHorizontalGroup(
			gl_panelDadosGerente.createParallelGroup(Alignment.LEADING)
				.addGap(0, 785, Short.MAX_VALUE)
		);
		gl_panelDadosGerente.setVerticalGroup(
			gl_panelDadosGerente.createParallelGroup(Alignment.LEADING)
				.addGap(0, 533, Short.MAX_VALUE)
		);
		panelDadosGerente.setLayout(gl_panelDadosGerente);
		
		JPanel panelLojasSupervisionadas = new JPanel();
		tabbedPaneGerente.addTab("Lojas supervisionadas", null, panelLojasSupervisionadas, null);
	}
}
