package minhas_telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class DadosDoGerente extends JFrame {

	private JPanel contentPaneDadosDeGerente;
	private JTextField textField;

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
		panelDadosGerente.setBorder(new TitledBorder(null, "Dados pessoais do gerente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPaneGerente.addTab("Dados Pessoais", null, panelDadosGerente, null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Dialog", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_panelDadosGerente = new GroupLayout(panelDadosGerente);
		gl_panelDadosGerente.setHorizontalGroup(
			gl_panelDadosGerente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosGerente.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
					.addGap(47))
		);
		gl_panelDadosGerente.setVerticalGroup(
			gl_panelDadosGerente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosGerente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelDadosGerente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(466, Short.MAX_VALUE))
		);
		panelDadosGerente.setLayout(gl_panelDadosGerente);
		
		JPanel panelLojasSupervisionadas = new JPanel();
		panelLojasSupervisionadas.setBorder(new TitledBorder(null, "Lista de lojas supervisionadas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPaneGerente.addTab("Lojas supervisionadas", null, panelLojasSupervisionadas, null);
		GroupLayout gl_panelLojasSupervisionadas = new GroupLayout(panelLojasSupervisionadas);
		gl_panelLojasSupervisionadas.setHorizontalGroup(
			gl_panelLojasSupervisionadas.createParallelGroup(Alignment.LEADING)
				.addGap(0, 785, Short.MAX_VALUE)
		);
		gl_panelLojasSupervisionadas.setVerticalGroup(
			gl_panelLojasSupervisionadas.createParallelGroup(Alignment.LEADING)
				.addGap(0, 533, Short.MAX_VALUE)
		);
		panelLojasSupervisionadas.setLayout(gl_panelLojasSupervisionadas);
	}
}
