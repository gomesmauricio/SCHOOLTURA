package VIEW;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class LancaNotas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	

	/**
	 * Create the dialog.
	 */
	public LancaNotas() {
		setTitle("SchoolTura - Lan\u00E7amento de Notas");
		setResizable(false);
		setBounds(100, 100, 436, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Matricula:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(13, 45, 72, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setBounds(13, 70, 101, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(124, 69, 83, 23);
		contentPanel.add(btnNewButton);
		
		JLabel lblNomeDoAluno = new JLabel("Nome do Aluno:");
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoAluno.setBounds(13, 101, 101, 14);
		contentPanel.add(lblNomeDoAluno);
		
		JLabel lblLanamentoDeNotas = new JLabel("***Lan\u00E7amento de Notas***");
		lblLanamentoDeNotas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLanamentoDeNotas.setBounds(132, 11, 198, 14);
		contentPanel.add(lblLanamentoDeNotas);
		
		textField_1 = new JTextField();
		textField_1.setBounds(13, 126, 317, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNota = new JLabel("Nota 1:");
		lblNota.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNota.setBounds(13, 164, 72, 14);
		contentPanel.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2:");
		lblNota_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNota_1.setBounds(95, 164, 72, 14);
		contentPanel.add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 3:");
		lblNota_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNota_2.setBounds(177, 164, 72, 14);
		contentPanel.add(lblNota_2);
		
		JLabel lblNota_3 = new JLabel("Nota 4:");
		lblNota_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNota_3.setBounds(252, 164, 72, 14);
		contentPanel.add(lblNota_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(13, 189, 63, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(95, 189, 63, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(173, 189, 63, 20);
		contentPanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(252, 189, 63, 20);
		contentPanel.add(textField_5);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStatus.setBounds(299, 45, 72, 14);
		contentPanel.add(lblStatus);
		
		JLabel lblNewLabel_1 = new JLabel("Aprovado ou Reprovado");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(252, 73, 162, 14);
		contentPanel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Lan\u00E7ar");
		btnNewButton_1.setBounds(325, 188, 89, 23);
		contentPanel.add(btnNewButton_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
