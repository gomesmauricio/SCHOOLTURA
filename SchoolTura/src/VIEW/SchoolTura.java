package VIEW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SchoolTura {

	private JFrame frmSchooltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchoolTura window = new SchoolTura();
					window.frmSchooltura.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SchoolTura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSchooltura = new JFrame();
		frmSchooltura.setResizable(false);
		frmSchooltura.setTitle("SchoolTura - Sistema Escolar");
		frmSchooltura.setBounds(100, 100, 695, 467);
		frmSchooltura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSchooltura.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SchoolTura");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		lblNewLabel.setBounds(264, 197, 199, 50);
		frmSchooltura.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 679, 21);
		frmSchooltura.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastrar Responsavel");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroResponsavel resp = new CadastroResponsavel();
				resp.setModal(true);
				resp.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Matriular Aluno");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MatriculaAluno matricula = new MatriculaAluno();
				matricula.setModal(true);
				matricula.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Notas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lan\u00E7ar Notas");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LancaNotas notas = new LancaNotas();
				notas.setModal(true);
				notas.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
	}
}
