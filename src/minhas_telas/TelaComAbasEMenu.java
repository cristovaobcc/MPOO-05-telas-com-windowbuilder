package minhas_telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

public class TelaComAbasEMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;

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
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Dialog", Font.BOLD, 16));
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		GroupLayout gl_panelDadosPessoais = new GroupLayout(panelDadosPessoais);
		gl_panelDadosPessoais.setHorizontalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
					.addGap(415))
		);
		gl_panelDadosPessoais.setVerticalGroup(
			gl_panelDadosPessoais.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDadosPessoais.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panelDadosPessoais.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(textFieldNome, Alignment.LEADING)
						.addComponent(lblNome, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(481, Short.MAX_VALUE))
		);
		panelDadosPessoais.setLayout(gl_panelDadosPessoais);
		
		JPanel panelDadosEndereco = new JPanel();
		panelDadosEndereco.setBorder(new TitledBorder(null, "Dados do endere\u00E7o do Funcion\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPane.addTab("Endereço", null, panelDadosEndereco, null);
		GroupLayout gl_panelDadosEndereco = new GroupLayout(panelDadosEndereco);
		gl_panelDadosEndereco.setHorizontalGroup(
			gl_panelDadosEndereco.createParallelGroup(Alignment.LEADING)
				.addGap(0, 785, Short.MAX_VALUE)
		);
		gl_panelDadosEndereco.setVerticalGroup(
			gl_panelDadosEndereco.createParallelGroup(Alignment.LEADING)
				.addGap(0, 533, Short.MAX_VALUE)
		);
		panelDadosEndereco.setLayout(gl_panelDadosEndereco);
	}
}
